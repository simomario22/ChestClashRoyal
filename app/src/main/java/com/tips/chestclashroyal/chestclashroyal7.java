package com.tips.chestclashroyal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.appodeal.ads.Appodeal;
import com.appodeal.ads.InterstitialCallbacks;

public class chestclashroyal7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chestclashroyal7);


        Appodeal.show(this, Appodeal.REWARDED_VIDEO);


    }

    public void but6(View view) {

        Intent i = new Intent(this, chestclashroyal8.class);
        startActivity(i);


    }
}
