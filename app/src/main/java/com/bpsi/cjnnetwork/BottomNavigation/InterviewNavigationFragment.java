package com.bpsi.cjnnetwork.BottomNavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bpsi.cjnnetwork.InterviewWebview;
import com.bpsi.cjnnetwork.databinding.FragmentInterviewNavigationBinding;


public class InterviewNavigationFragment extends Fragment {
    private FragmentInterviewNavigationBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentInterviewNavigationBinding.inflate(inflater, container, false);

        binding.Interview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(requireContext(), InterviewWebview.class));
            }
        });

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}