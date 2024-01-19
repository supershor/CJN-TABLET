package com.example.cjnnetwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cjnnetwork.BottomNavigation.AssesmentNavigationFragment;
import com.example.cjnnetwork.BottomNavigation.InterviewNavigationFragment;
import com.example.cjnnetwork.BottomNavigation.JobOfferNavigationFragment;
import com.example.cjnnetwork.BottomNavigation.ProfileNavigationFragment;
import com.example.cjnnetwork.BottomNavigation.TrainingNavigationFragment;
import com.example.cjnnetwork.databinding.ActivityDashboardBinding;
import com.example.cjnnetwork.databinding.ActivityMainBinding;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import nl.joery.animatedbottombar.AnimatedBottomBar;

public class DashboardActivity extends AppCompatActivity {
    private ActivityDashboardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new TrainingNavigationFragment());

        binding.btmNavigation.setOnTabSelectListener(new AnimatedBottomBar.OnTabSelectListener() {
            @Override
            public void onTabSelected(int lastIndex, AnimatedBottomBar.Tab lastTab, int newIndex, AnimatedBottomBar.Tab newTab) {
                switch (newIndex) {
                    case 0:
                        replaceFragment(new TrainingNavigationFragment());
                        break;
                    case 1:
                        replaceFragment(new AssesmentNavigationFragment());
                        break;
                    case 2:
                        replaceFragment(new InterviewNavigationFragment());
                        break;
                    case 3:
                        replaceFragment(new JobOfferNavigationFragment());
                        break;
                    case 4:
                        replaceFragment(new ProfileNavigationFragment());
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onTabReselected(int i, AnimatedBottomBar.Tab tab) {
            }
        });


    }

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, fragment).commit();
    }

    @Override
    public void onBackPressed() {
        Fragment currentFragment = getSupportFragmentManager().findFragmentById(R.id.fragment);
        if (!(currentFragment instanceof TrainingNavigationFragment)) {
            replaceFragment(new TrainingNavigationFragment());
            binding.btmNavigation.selectTabAt(0,true);
        } else {
            super.onBackPressed();
        }
    }


}