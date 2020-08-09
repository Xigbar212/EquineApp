package com.example.starscream.firstapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView mEventsRecyclerView;
    private RecyclerView.Adapter mEventsAdapter;
    private RecyclerView.LayoutManager mEventsLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        // Temp info for news articles in app ttt
        ArrayList<ArticleItem> articleList = new ArrayList<>();
        articleList.add(new ArticleItem(R.drawable.ic_settings,"New Training Technique", "How to improve seat"));
        articleList.add(new ArticleItem(R.drawable.ic_settings,"Top Score at Tournament", "Jones scores 88% in Grand Prix"));
        articleList.add(new ArticleItem(R.drawable.ic_settings,"Horses Afraid of tarps?", "The horses greatest fear discovered"));

        // Temp data for the events list
        ArrayList<UpcomingEventsItem> eventsList = new ArrayList<>();
        eventsList.add(new UpcomingEventsItem("Dec 22nd","Feerrier Coming", "10:05AM"));
        eventsList.add(new UpcomingEventsItem("Dec 24th","Christmas Eve Show", "11:00AM"));
        eventsList.add(new UpcomingEventsItem("Jan 1st","Horse Dentist", "2:15PM"));
        eventsList.add(new UpcomingEventsItem("Jan 22nd","Pony Auction", "1:05AM"));
        eventsList.add(new UpcomingEventsItem("Apr 24th","Lesson", "9:00AM"));
        eventsList.add(new UpcomingEventsItem("Feb 1st","Horse Dentist", "12:15PM"));
        eventsList.add(new UpcomingEventsItem("Mar 2nd","Lesson", "10:09AM"));
        eventsList.add(new UpcomingEventsItem("May 24th","Clydesdale clinic", "11:03PM"));
        eventsList.add(new UpcomingEventsItem("Jun 1st","Let Ivy run around", "4:15PM"));
        eventsList.add(new UpcomingEventsItem("Jul 22nd","Lesson", "6:05AM"));
        eventsList.add(new UpcomingEventsItem("Aug 24th","Feed Mouse Carrots", "11:30AM"));
        eventsList.add(new UpcomingEventsItem("Nov 1st","Foal's Birth", "4:15PM"));

        //Establishing the RecyclerView for the new articles at top of page
        mRecyclerView = findViewById(R.id.news_recycler);
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mAdapter = new ArticleAdapter(articleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        //Establishing the RecyclerView for the Upcoming events list @ bottom of page
        mEventsRecyclerView = findViewById(R.id.upcoming_events_recycler);
        mEventsLayoutManager = new LinearLayoutManager(this);
        mEventsAdapter = new UpcommingEventsAdapter(eventsList);

        mEventsRecyclerView.setLayoutManager(mEventsLayoutManager);
        mEventsRecyclerView.setAdapter(mEventsAdapter);

        // How to make footer nav bar active... Commented out while testing built in nav bar
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    }
}
