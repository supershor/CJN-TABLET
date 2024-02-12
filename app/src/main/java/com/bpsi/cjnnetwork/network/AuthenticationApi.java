package com.bpsi.cjnnetwork.network;

import com.bpsi.cjnnetwork.model.InputParamerLogin;
import com.bpsi.cjnnetwork.model.InputParameterJobDec;
import com.bpsi.cjnnetwork.model.InputRegisterParameters;
import com.bpsi.cjnnetwork.model.OutputJobDescription;
import com.bpsi.cjnnetwork.model.ResponseParameterLogin;
import com.bpsi.cjnnetwork.model.ResponseParameterRegister;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AuthenticationApi {

    @POST(WebserviceConstants.LOGIN_API)
    Call<ResponseParameterLogin> login(@Body InputParamerLogin d);

    @POST(WebserviceConstants.REGISTER_API)
    Call<ResponseParameterRegister> register(@Body InputRegisterParameters d);

    @POST(WebserviceConstants.GET_JOBDESCRIPTION)
    Call<OutputJobDescription> jobDescriptionPdf( @Body InputParameterJobDec d);

}
