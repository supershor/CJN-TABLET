package com.bpsi.cjnnetwork.BottomNavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bpsi.cjnnetwork.AssessmentWebView;
import com.bpsi.cjnnetwork.databinding.FragmentAssesmentNavigationBinding;

public class AssesmentNavigationFragment extends Fragment {
    private FragmentAssesmentNavigationBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAssesmentNavigationBinding.inflate(inflater, container, false);

        binding.assessment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(requireActivity(), AssessmentWebView.class));
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