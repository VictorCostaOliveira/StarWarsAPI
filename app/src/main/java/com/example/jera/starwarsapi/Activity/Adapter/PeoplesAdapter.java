package com.example.jera.starwarsapi.Activity.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jera.starwarsapi.Activity.Model.PeopleResults;

import java.util.List;

/**
 * Created by jera on 26/05/17.
 */

public class PeoplesAdapter extends RecyclerView.Adapter<AdapterViewHolder> {
    public List<PeopleResults> peopleResultsesList;
    private int rowLayout;
    private Context context;

    public PeoplesAdapter(List<PeopleResults> peopleResultsesList, int rowLayout, Context context) {
        this.peopleResultsesList = peopleResultsesList;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public AdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);

        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterViewHolder holder, int position) {
        holder.textViewNamePeople.setText(peopleResultsesList.get(position).getNamePeople());
        holder.textViewGenderPeople.setText(peopleResultsesList.get(position).getGenderPeople());

    }

    @Override
    public int getItemCount() {
        return peopleResultsesList.size();
    }
}
