package com.tips.chestclashroyal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.appodeal.ads.Appodeal;

public class chestclashroyal5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chestclashroyal5);




        Appodeal.isLoaded(Appodeal.INTERSTITIAL);
        Appodeal.show(this, Appodeal.INTERSTITIAL);
    }



    public void but4(View view) {

        Intent i = new Intent(this, chestclashroyal6.class);
        startActivity(i);
    }
}
