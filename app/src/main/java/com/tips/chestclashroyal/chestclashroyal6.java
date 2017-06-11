package com.tips.chestclashroyal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.appodeal.ads.Appodeal;

public class chestclashroyal6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chestclashroyal6);




        Appodeal.isLoaded(Appodeal.SKIPPABLE_VIDEO);
        Appodeal.show(this, Appodeal.SKIPPABLE_VIDEO);
    }

    public void but5(View view) {

        Intent i = new Intent(this, chestclashroyal7.class);
        startActivity(i);
    }
}
