package com.example.codingmounrtain.addtocartbadgecount;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.carteasy.v1.lib.Carteasy;

import java.util.Map;

public class Cartdisplay extends AppCompatActivity {

    Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartdisplay);

        Map<Integer, Map> data;
        Carteasy cs = new Carteasy();
        data = cs.ViewAll(Context mContext);

        for (Map.Entry<Integer, Map> entry : data.entrySet()) {
            //get the Id
            Log.d("Key: ",entry.getKey());
            Log.d("Value: ",entry.getValue());

            //Get the items tied to the Id
            Map<String, String> innerdata = entry.getValue();
            for (Map.Entry<String, String> innerentry : innerdata.entrySet()) {
                Log.d("Inner Key: ",innerentry.getKey());
                Log.d("Inner Value: ",innerentry.getValue());
            }
        }

    }
}
