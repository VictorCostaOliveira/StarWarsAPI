package com.example.jera.starwarsapi.Activity.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jera on 26/05/17.
 */

public class PeopleResults {

    @SerializedName("name")
    private String namePeople;
    @SerializedName("height")
    private String heigthPeople;
    @SerializedName("mass")
    private String massPeople;
    @SerializedName("hair_color")
    private String hairPeople;
    @SerializedName("skin_color")
    private String skinPeople;
    @SerializedName("eye_color")
    private String eyePeople;
    @SerializedName("birth_year")
    private String birthPeople;
    @SerializedName("gender")
    private String genderPeople;
    @SerializedName("homeworld")
    private String homePeople;

    public PeopleResults(String namePeople, String heigthPeople, String massPeople, String hairPeople, String skinPeople, String eyePeople, String birthPeople, String genderPeople, String homePeople) {
        this.namePeople = namePeople;
        this.heigthPeople = heigthPeople;
        this.massPeople = massPeople;
        this.hairPeople = hairPeople;
        this.skinPeople = skinPeople;
        this.eyePeople = eyePeople;
        this.birthPeople = birthPeople;
        this.genderPeople = genderPeople;
        this.homePeople = homePeople;
    }

    public String getNamePeople() {
        return namePeople;
    }

    public void setNamePeople(String namePeople) {
        this.namePeople = namePeople;
    }

    public String getHeigthPeople() {
        return heigthPeople;
    }

    public void setHeigthPeople(String heigthPeople) {
        this.heigthPeople = heigthPeople;
    }

    public String getMassPeople() {
        return massPeople;
    }

    public void setMassPeople(String massPeople) {
        this.massPeople = massPeople;
    }

    public String getHairPeople() {
        return hairPeople;
    }

    public void setHairPeople(String hairPeople) {
        this.hairPeople = hairPeople;
    }

    public String getSkinPeople() {
        return skinPeople;
    }

    public void setSkinPeople(String skinPeople) {
        this.skinPeople = skinPeople;
    }

    public String getEyePeople() {
        return eyePeople;
    }

    public void setEyePeople(String eyePeople) {
        this.eyePeople = eyePeople;
    }

    public String getBirthPeople() {
        return birthPeople;
    }

    public void setBirthPeople(String birthPeople) {
        this.birthPeople = birthPeople;
    }

    public String getGenderPeople() {
        return genderPeople;
    }

    public void setGenderPeople(String genderPeople) {
        this.genderPeople = genderPeople;
    }

    public String getHomePeople() {
        return homePeople;
    }

    public void setHomePeople(String homePeople) {
        this.homePeople = homePeople;
    }
}
