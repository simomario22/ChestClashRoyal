package com.tips.chestclashroyal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Chestclashroyal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chestclashroyal);
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
