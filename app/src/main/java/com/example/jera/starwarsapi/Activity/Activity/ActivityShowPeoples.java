package com.example.jera.starwarsapi.Activity.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.example.jera.starwarsapi.Activity.Adapter.PeoplesAdapter;
import com.example.jera.starwarsapi.R;

import retrofit2.Call;

/**
 * Created by jera on 26/05/17.
 */

public class ActivityShowPeoples extends AppCompatActivity {
    private RecyclerView recyclerViewPeoples;
    private PeoplesAdapter peoplesAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_peoples);

        recyclerViewPeoples = (RecyclerView) findViewById(R.id.recyclerViewShowAllPeoples);

        Call<>
        peoplesAdapter = new PeoplesAdapter();
        recyclerViewPeoples.setAdapter(peoplesAdapter);

    }
}
