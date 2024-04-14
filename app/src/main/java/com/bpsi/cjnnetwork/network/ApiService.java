package com.bpsi.cjnnetwork.network;

import com.bpsi.cjnnetwork.model.AllModel;
import com.bpsi.cjnnetwork.model.ApiResponse;
import com.bpsi.cjnnetwork.model.Display;
import com.bpsi.cjnnetwork.model.InputParameterJobDec;
import com.bpsi.cjnnetwork.model.OutputJobDescription;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
    @POST(WebserviceConstants.GET_LANDING_PAGE)
    Call<ApiResponse> getTvShowInfo(@Body ApiRequest request);
}
