package com.example.codingmounrtain.addtocartbadgecount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Cartdisplay extends AppCompatActivity {

    static final String KEY_TITLE = "title";
    static final String KEY_COST = "cost";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartdisplay);


    }
}
