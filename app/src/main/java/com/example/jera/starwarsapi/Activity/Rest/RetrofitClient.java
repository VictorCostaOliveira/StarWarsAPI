package com.example.jera.starwarsapi.Activity.Rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jera on 26/05/17.
 */

public class RetrofitClient {
    private static final String BASE_URL = "http://swapi.co/api/";
    private static Retrofit retrofit;

    public static ClientInterface getAPI() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        ClientInterface clientInterface = retrofit.create(ClientInterface.class);
        return clientInterface;

    }


}
