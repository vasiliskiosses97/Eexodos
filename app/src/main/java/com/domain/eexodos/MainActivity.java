package com.domain.eexodos;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton coffeButton;
    ImageButton psilikaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        coffeButton  = (ImageButton) findViewById(R.id.coffeButton);
        coffeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    setContentView(R.layout.activity_maps);
            }
        });

        psilikaButton  = (ImageButton) findViewById(R.id.psilikaButton);
        psilikaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.activity_maps);
            }
        });

    }


}
