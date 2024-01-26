package com.example.cjnnetwork.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cjnnetwork.R;
import com.example.cjnnetwork.databinding.ActivityEditProfileBinding;
import com.example.cjnnetwork.databinding.ActivityMainBinding;

public class EditProfileActivity extends AppCompatActivity {
    private ActivityEditProfileBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityEditProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}