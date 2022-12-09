package com.example.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MoveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Samsung Galaxy S20");
        }
    }
}