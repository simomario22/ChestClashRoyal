package com.tips.chestclashroyal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.appodeal.ads.Appodeal;

public class Chestclashroyal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chestclashroyal);


        //appodeal
        Appodeal.confirm(Appodeal.SKIPPABLE_VIDEO);

        String appKey = "bbf95e8f5d3cdbf5d23148fb34bf9c6511e63e497105d5ba";
        Appodeal.initialize(this, appKey, Appodeal.REWARDED_VIDEO);

        //appodeal
        Appodeal.initialize(this, appKey, Appodeal.INTERSTITIAL | Appodeal.SKIPPABLE_VIDEO);
    }

    public void but1(View view) {

        Intent i = new Intent(this, chestclashroyal3.class);
        startActivity(i);
    }

    public void but2(View view) {

        Intent i = new Intent(this, chestclashroyal2.class);
        startActivity(i);
    }
}
