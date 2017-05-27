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

    public APIPeopleResult(int countPeople, String nextPeople, String previousPeople, ArrayList<PeopleResults> resultsPeople) {
        this.countPeople = countPeople;
        this.nextPeople = nextPeople;
        this.previousPeople = previousPeople;
        this.resultsPeople = resultsPeople;
    }

    public int getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    public String getNextPeople() {
        return nextPeople;
    }

    public void setNextPeople(String nextPeople) {
        this.nextPeople = nextPeople;
    }

    public String getPreviousPeople() {
        return previousPeople;
    }

    public void setPreviousPeople(String previousPeople) {
        this.previousPeople = previousPeople;
    }

    public ArrayList<PeopleResults> getResultsPeople() {
        return resultsPeople;
    }

    public void setResultsPeople(ArrayList<PeopleResults> resultsPeople) {
        this.resultsPeople = resultsPeople;
    }
}
