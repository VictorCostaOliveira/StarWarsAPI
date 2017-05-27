package com.example.jera.starwarsapi.Activity.Rest;

import com.example.jera.starwarsapi.Activity.Model.APIPeopleResult;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by jera on 26/05/17.
 */

public interface ClientInterface {

    @GET("people/")
    Call<APIPeopleResult> getAllPeoples();


}
