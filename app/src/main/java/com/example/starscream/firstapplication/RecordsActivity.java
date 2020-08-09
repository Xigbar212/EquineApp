package com.example.starscream.firstapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;

public class RecordsActivity extends AppCompatActivity {
    private RecyclerView RecordsRecyclerView;
    private RecyclerView.Adapter RecordsAdapter;
    private RecyclerView.LayoutManager RecordsLayoutManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records);

        ArrayList<RecordsItem> recordsList = new ArrayList<>();
        recordsList.add(new RecordsItem("Intro B", "70","Green Mouse", "9/18/20"));
        recordsList.add(new RecordsItem("Intro A", "81","Green Mouse", "9/18/20"));
        recordsList.add(new RecordsItem("Intro C", "76","Green Mouse", "9/18/20"));
        recordsList.add(new RecordsItem("Intro A", "60","Green Mouse", "10/8/20"));
        recordsList.add(new RecordsItem("Intro B", "67","Green Mouse", "10/8/20"));
        recordsList.add(new RecordsItem("Intro C", "74","Green Mouse", "10/8/20"));

        //Establish Manager and Recycler
        RecordsRecyclerView = findViewById(R.id.records_recycler);
        RecordsLayoutManager = new LinearLayoutManager(this);
        RecordsAdapter = new RecordsAdapter(recordsList);

        RecordsRecyclerView.setLayoutManager(RecordsLayoutManager);
        RecordsRecyclerView.setAdapter(RecordsAdapter);



    }
}
