package com.example.cjnnetwork.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.UiAutomation;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.cjnnetwork.MainActivity;
import com.example.cjnnetwork.R;
import com.example.cjnnetwork.UIHelper;
import com.example.cjnnetwork.databinding.ActivityMainBinding;
import com.example.cjnnetwork.databinding.ActivityRegisterBinding;
import com.example.cjnnetwork.model.InputParamerLogin;
import com.example.cjnnetwork.model.InputRegisterParameters;
import com.example.cjnnetwork.model.ResponseParameterLogin;
import com.example.cjnnetwork.model.ResponseParameterRegister;
import com.example.cjnnetwork.network.ApiClient;
import com.example.cjnnetwork.network.AuthenticationApi;
import com.google.gson.Gson;

import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {

    private ActivityRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        binding.btnCreateProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=binding.etFullName.getText().toString();
                String email=binding.etEmail.getText().toString();
                String mobile=binding.etMobile.getText().toString();
                String password=binding.etPassword.getText().toString();
                String confirmPassword=binding.etConfirmPassword.getText().toString();
                if(name.isEmpty()){
                    binding.etFullName.requestFocus();
                    binding.etFullName.setError("Enter Full Name plz");
                }
                else if(email.isEmpty()|| !UIHelper.isValidEmail(email)){
                    binding.etEmail.requestFocus();
                    binding.etEmail.setError("Enter valid Email plz");
                }
                else if(mobile.isEmpty()|| !UIHelper.isValidPhoneNumber(mobile)){
                    binding.etMobile.requestFocus();
                    binding.etMobile.setError("Enter valid mobile plz");
                }
                else if(password.isEmpty()|| password.length()<=6){
                    binding.etPassword.requestFocus();
                    binding.etPassword.setError("Enter password greater than 6 characters plz");
                }
                else if(confirmPassword.isEmpty()|| !confirmPassword.equals(password)){
                    binding.etConfirmPassword.requestFocus();
                    binding.etConfirmPassword.setError("Password mismatch");
                }
                else{
                    binding.pbReg.setVisibility(View.VISIBLE);
                    registerApi(name,email,mobile,password);
                }
            }
        });

    }


    private void registerApi(final String name, final String email,final String mobile,final String password) {

        AuthenticationApi authenticationApi = ApiClient.getClient().create(AuthenticationApi.class);

        InputRegisterParameters d = new InputRegisterParameters();
        d.setFullname(name);
        d.setEmail(email);
        d.setMobile(mobile);
        d.setPassword(password);
        Log.e("TAG", "Register Input : " + new Gson().toJson(d));
        Call<ResponseParameterRegister> call = authenticationApi.register(d);
        Log.e("request_api_url", "" + call.request().url());

        call.enqueue(new Callback<ResponseParameterRegister>() {
            @Override
            public void onResponse(Call<ResponseParameterRegister> call, Response<ResponseParameterRegister> response) {
                binding.pbReg.setVisibility(View.GONE);

                Log.e("TAG", "Register Response: " + new Gson().toJson(response.body()));
                Log.e("TAG", "Register Response: " + new Gson().toJson(response.body().getResponseStatus()));

                if (response.body() != null) {
                    if (Objects.equals(response.body().getResponseStatus(), "true")) {
                        UIHelper.toast(RegisterActivity.this,"User Register Successfully");
                        Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                        startActivity(intent);
                    } else {

                        String errorMessage = response.body().getResponseMessage().toString();
                        UIHelper.toast(RegisterActivity.this,errorMessage);

                    }
                } else {

                }
            }

            @Override
            public void onFailure(Call<ResponseParameterRegister> call, Throwable t) {
                //validationDialog();
                Log.d("myResponse:", "MSG" + t.toString());
                UIHelper.toast(RegisterActivity.this,t.toString());
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}