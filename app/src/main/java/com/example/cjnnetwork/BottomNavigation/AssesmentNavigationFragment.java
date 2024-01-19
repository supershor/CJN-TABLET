package com.example.cjnnetwork.BottomNavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.cjnnetwork.AssessmentWebView;
import com.example.cjnnetwork.DashboardActivity;
import com.example.cjnnetwork.R;
import com.example.cjnnetwork.databinding.FragmentAssesmentNavigationBinding;
import com.example.cjnnetwork.databinding.FragmentTrainingNavigationBinding;

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