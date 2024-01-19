package com.example.cjnnetwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PatternMatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.cjnnetwork.authentication.RegisterActivity;
import com.example.cjnnetwork.model.CjnSharedPreferences;
import com.example.cjnnetwork.model.InputParamerLogin;
import com.example.cjnnetwork.model.OutputLogin;
import com.example.cjnnetwork.model.ResponseParameterLogin;
import com.example.cjnnetwork.model.ResponseParameterRegister;
import com.example.cjnnetwork.model.Student;
import com.example.cjnnetwork.network.ApiClient;
import com.example.cjnnetwork.network.AuthenticationApi;
import com.example.cjnnetwork.network.WebserviceConstants;
import com.example.cjnnetwork.utils.GlobalInterface;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.database.FirebaseDatabase;
import com.google.gson.Gson;
import com.example.cjnnetwork.databinding.ActivityMainBinding;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    Button login, signup;
    String error_decscription;
    private ActivityMainBinding binding;
    String enviromentType;

    private static final int RC_SIGN_IN = 9001;
    private FirebaseAuth mAuth;
    FirebaseDatabase database;
    private GoogleSignInClient mGoogleSignInClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        CjnSharedPreferences.init(this);

        _initUI();
        FirebaseApp.initializeApp(this);
        mAuth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
        binding.cvGoogle.setOnClickListener(view -> signIn());

        binding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DashboardActivity.class));

                String email=binding.etEmail.getText().toString();
                String password=binding.etPassword.getText().toString();
                if(email.isEmpty()|| !UIHelper.isValidEmail(email)) {
                    binding.etEmail.requestFocus();
                    binding.etEmail.setError("Please enter Email address");
                }
                else if(password.isEmpty()|| password.length()<=6){
                    binding.etPassword.requestFocus();
                    binding.etPassword.setError("Please enter Password greater than 6 characters");
                }
                else{
                    login(email,password);
                    startActivity(new Intent(MainActivity.this, DashboardActivity.class));
                }

            }
        });

        binding.tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
                finish();
            }
        });

        binding.rdgAppType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                if (checkedId == R.id.rbtn_dev) {
                    enviromentType = GlobalInterface.DEV;
                    CjnSharedPreferences.setAppType(GlobalInterface.DEV);
                    WebserviceConstants.setAppType(GlobalInterface.DEV);
                } else if (checkedId == R.id.rbtn_test) {
                    enviromentType = GlobalInterface.TEST;
                    CjnSharedPreferences.setAppType(GlobalInterface.TEST);
                    WebserviceConstants.setAppType(GlobalInterface.TEST);
                } else if (checkedId == R.id.rbtn_production) {
                    enviromentType = GlobalInterface.PRODUCTION;
                    CjnSharedPreferences.setAppType(GlobalInterface.PRODUCTION);
                    WebserviceConstants.setAppType(GlobalInterface.PRODUCTION);
                }

            }

        });

    }

    private void signIn() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_SIGN_IN) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                GoogleSignInAccount account = task.getResult(ApiException.class);
                firebaseAuthWithGoogle(account.getIdToken());
            } catch (ApiException e) {
                Log.w("TAG", "Google sign in failed", e);
            }
        }
    }

    private void firebaseAuthWithGoogle(String idToken) {
        AuthCredential credential = GoogleAuthProvider.getCredential(idToken, null);
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {

                        FirebaseUser user = mAuth.getCurrentUser();
                        if (user != null) {
                            String userEmail = user.getEmail();
                            String userName = user.getDisplayName();
                            Toast.makeText(this, "Used Signed In Succesfully", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(MainActivity.this, DashboardActivity.class));

                            Log.d("TAG", "User email: " + userEmail);
                            Log.d("TAG", "User name: " + userName);
                        }
                    } else {
                        Log.w("TAG", "signInWithCredential:failure", task.getException());
                        Toast.makeText(this, "Failed To Sign In", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void login(final String email, final String password) {

        AuthenticationApi authenticationApi = ApiClient.getClient().create(AuthenticationApi.class);

        InputParamerLogin d = new InputParamerLogin();
        d.setEmail(email);
        d.setPassword(password);
        Log.e("TAG", "Login Input : " + new Gson().toJson(d));
        Call<ResponseParameterLogin> call = authenticationApi.login(d);
        Log.e("request_api_url", "" + call.request().url());

        call.enqueue(new Callback<ResponseParameterLogin>() {
            @Override
            public void onResponse(Call<ResponseParameterLogin> call, Response<ResponseParameterLogin> response) {
                Log.e("TAG", "Login Response: " + new Gson().toJson(response.body()));
                if (response.body() != null) {
                    error_decscription = response.body().getResponseMessage();
                    if (response.body().getResponseStatus() == 200) {

                    } else {

                    }
                } else {

                }
            }

            @Override
            public void onFailure(Call<ResponseParameterLogin> call, Throwable t) {
                //validationDialog();
                Log.d("myResponse:", "MSG" + t.toString());
            }
        });
    }

    private void _initUI() {
        if (CjnSharedPreferences.getAppType().equals(GlobalInterface.TEST)) {
            binding.rbtnTest.setChecked(true);
            WebserviceConstants.setAppType(GlobalInterface.TEST);
        } else if (CjnSharedPreferences.getAppType().equals(GlobalInterface.PRODUCTION)) {
            binding.rbtnProduction.setChecked(true);
            WebserviceConstants.setAppType(GlobalInterface.PRODUCTION);
        } else if (CjnSharedPreferences.getAppType().equals(GlobalInterface.DEV)) {
            binding.rbtnDev.setChecked(true);
            WebserviceConstants.setAppType(GlobalInterface.DEV);
        }
    }

}