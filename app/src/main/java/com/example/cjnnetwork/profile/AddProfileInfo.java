package com.example.cjnnetwork.profile;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.cjnnetwork.R;
import com.example.cjnnetwork.databinding.ActivityAddProfileInfoBinding;
import com.example.cjnnetwork.databinding.ActivityMainBinding;

public class AddProfileInfo extends AppCompatActivity {
    private ActivityAddProfileInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAddProfileInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}