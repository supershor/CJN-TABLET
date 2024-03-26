package com.bpsi.cjnnetwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bpsi.cjnnetwork.databinding.ActivityJobDescriptionBinding;

public class JobDescription extends AppCompatActivity {
    private ActivityJobDescriptionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityJobDescriptionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}