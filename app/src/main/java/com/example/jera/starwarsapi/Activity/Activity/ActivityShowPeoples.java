package com.example.jera.starwarsapi.Activity.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.jera.starwarsapi.Activity.Adapter.PeoplesAdapter;
import com.example.jera.starwarsapi.Activity.Model.APIPeopleResult;
import com.example.jera.starwarsapi.Activity.Model.PeopleResults;
import com.example.jera.starwarsapi.Activity.Rest.RetrofitClient;
import com.example.jera.starwarsapi.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by jera on 26/05/17.
 */

public class ActivityShowPeoples extends AppCompatActivity {
    private RecyclerView recyclerViewPeoples;
    private PeoplesAdapter peoplesAdapter;
    private LinearLayoutManager linearLayoutManager;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_peoples);

        recyclerViewPeoples = (RecyclerView) findViewById(R.id.recyclerViewShowAllPeoples);
        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        frameLayout = (FrameLayout) findViewById(R.id.frameLayoutLoadingAPI);

        frameLayout.setVisibility(View.VISIBLE);

        Call<APIPeopleResult> peopleResults = RetrofitClient.getAPI().getAllPeoples();
        peopleResults.enqueue(new Callback<APIPeopleResult>() {
            @Override
            public void onResponse(Call<APIPeopleResult> call, Response<APIPeopleResult> response) {
                frameLayout.setVisibility(View.GONE);
                List<PeopleResults> listPeopleResult = response.body().getResultsPeople();
                peoplesAdapter = new PeoplesAdapter(listPeopleResult, R.layout.list_items_people,getApplicationContext());
                recyclerViewPeoples.setAdapter(peoplesAdapter);
                recyclerViewPeoples.setLayoutManager(linearLayoutManager);
            }

            @Override
            public void onFailure(Call<APIPeopleResult> call, Throwable t) {
                Toast.makeText(ActivityShowPeoples.this, R.string.conection_error, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
