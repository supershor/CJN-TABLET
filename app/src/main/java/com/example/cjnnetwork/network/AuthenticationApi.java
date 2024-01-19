package com.example.cjnnetwork.network;

import com.example.cjnnetwork.model.InputParamerLogin;
import com.example.cjnnetwork.model.InputParameterJobDec;
import com.example.cjnnetwork.model.InputRegisterParameters;
import com.example.cjnnetwork.model.OutputJobDescription;
import com.example.cjnnetwork.model.OutputLogin;
import com.example.cjnnetwork.model.ResponseParameterLogin;
import com.example.cjnnetwork.model.ResponseParameterRegister;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AuthenticationApi {

    @POST(WebserviceConstants.LOGIN_API)
    Call<ResponseParameterLogin> login(@Body InputParamerLogin d);

    @POST(WebserviceConstants.REGISTER_API)
    Call<ResponseParameterRegister> register(@Body InputRegisterParameters d);

    @POST(WebserviceConstants.GET_JOBDESCRIPTION)
    Call<OutputJobDescription> jobDescriptionPdf(@Body InputParameterJobDec d);

}
