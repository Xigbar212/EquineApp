package com.example.starscream.firstapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class SettingsActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

//        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
//
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//                switch (item.getItemId()) {
//
//                    case R.id.home_nav:
//                        Intent i1 = new Intent(SettingsActivity.this, HomePage.class);
//                        startActivity(i1);
//                        break;
//
//                    case R.id.settings_nav:
//                        Intent i2 = new Intent(SettingsActivity.this, SettingsActivity.class);
//                        startActivity(i2);
//                        break;
//
//                    case R.id.other_nav:
//                        Intent i3 = new Intent(SettingsActivity.this, OtherActivity.class);
//                        startActivity(i3);
//                        break;
//
//                    case R.id.explore_nav:
//                        Intent i4 = new Intent(SettingsActivity.this, ExploreActivity.class);
//                        startActivity(i4);
//                        break;
//
//                    case R.id.records_nav:
//                        Intent i5 = new Intent(SettingsActivity.this, RecordsActivity.class);
//                        startActivity(i5);
//                        break;
//                }
//
//                return false;
//            }
//        });
    }
}
