package com.example.jera.starwarsapi.Activity.Model;

import android.provider.Contacts;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by jera on 26/05/17.
 */

public class APIPeopleResult {

    @SerializedName("count")
    private int countPeople;
    @SerializedName("next")
    private String nextPeople;
    @SerializedName("previous")
    private String previousPeople;
    @SerializedName("results")
    private ArrayList<PeopleResults> resultsPeople;



}
