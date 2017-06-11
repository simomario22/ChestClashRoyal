package com.tips.chestclashroyal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.appodeal.ads.Appodeal;

public class chestclashroyal3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chestclashroyal3);


    }



    public void but3(View view) {

        Intent i = new Intent(this, chestclashroyal4.class);
        startActivity(i);


    }
}
