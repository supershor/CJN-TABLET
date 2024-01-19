package com.example.cjnnetwork.BottomNavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.cjnnetwork.R;
import com.example.cjnnetwork.databinding.FragmentProfileNavigationBinding;
import com.example.cjnnetwork.profile.AddProfileInfo;

public class ProfileNavigationFragment extends Fragment {

    private FragmentProfileNavigationBinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentProfileNavigationBinding.inflate(inflater, container, false);

//        binding.btnProfile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(requireContext(), "Profile", Toast.LENGTH_SHORT).show();
//            }
//        });
//        binding.btnCreateProfile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(requireActivity(), AddProfileInfo.class));
//            }
//        });

        return binding.getRoot();
    }
}