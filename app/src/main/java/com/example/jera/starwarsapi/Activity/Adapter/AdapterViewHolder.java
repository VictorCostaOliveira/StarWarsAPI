package com.example.jera.starwarsapi.Activity.Adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.jera.starwarsapi.R;

/**
 * Created by jera on 26/05/17.
 */

class AdapterViewHolder extends RecyclerView.ViewHolder {
    public CardView cardViewPeopleInformation;
    public TextView textViewNamePeople;
    public TextView textViewGenderPeople;


    public AdapterViewHolder(View itemView) {
        super(itemView);

        textViewNamePeople = (TextView) itemView.findViewById(R.id.textViewViewNamePeople);
        textViewGenderPeople = (TextView) itemView.findViewById(R.id.textViewGenderPeople);
    }
}
