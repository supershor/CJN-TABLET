package com.bpsi.cjnnetwork.BottomNavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bpsi.cjnnetwork.JobOfferWebView;
import com.bpsi.cjnnetwork.PdfViewverActivity;
import com.bpsi.cjnnetwork.databinding.FragmentJobOfferNavigationBinding;
import com.bpsi.cjnnetwork.model.InputParameterJobDec;
import com.bpsi.cjnnetwork.model.OutputJobDescription;
import com.bpsi.cjnnetwork.network.ApiClient;
import com.bpsi.cjnnetwork.network.AuthenticationApi;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class JobOfferNavigationFragment extends Fragment {
    private FragmentJobOfferNavigationBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentJobOfferNavigationBinding.inflate(inflater, container, false);
        binding.jc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(requireContext(), JobOfferWebView.class));
            }
        });

        getJobDescription("1");
        binding.tvUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(requireContext(), PdfViewverActivity.class));

            }
        });


        return binding.getRoot();
    }

    private void getJobDescription(final String jobid) {

        AuthenticationApi authenticationApi = ApiClient.getClient().create(AuthenticationApi.class);

        InputParameterJobDec d = new InputParameterJobDec();
        d.setJobid(jobid);
        Log.e("API_TAG", "Job Description Input : " + new Gson().toJson(d));
        Call<OutputJobDescription> call = authenticationApi.jobDescriptionPdf(String.valueOf(d));
        Log.e("request_api_url", "" + call.request().url());

        call.enqueue(new Callback<OutputJobDescription>() {
            @Override
            public void onResponse(Call<OutputJobDescription> call, Response<OutputJobDescription> response) {
                Log.e("API_TAG", "Job Description Response: " + new Gson().toJson(response.body()));
                if (response.body() != null) {
                    if (response.body().getResponseStatus() == 200) {

                    } else {

                    }
                } else {

                }
            }

            @Override
            public void onFailure(Call<OutputJobDescription> call, Throwable t) {
                //validationDialog();
                Log.d("myResponse:", "MSG" + t.toString());
            }
        });
    }
}