package com.domain.eexodos;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton coffeButton;
    ImageButton psilikaButton;
    public static boolean button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coffeButton  = (ImageButton) findViewById(R.id.coffeButton);
        coffeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button=true;
                //Intent intent = new Intent(MainActivity.this, WeatherActivity.class);
                //startActivity(intent);
                setContentView(R.layout.activity_weather);
                //startActivity(new Intent(MainActivity.this, WeatherActivity.class));
            }
        });

        psilikaButton  = (ImageButton) findViewById(R.id.psilikaButton);
        psilikaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button=false;
                //Intent intent = new Intent(WeatherActivity.this,WeatherActivity.class);
                //startActivity(intent);
                setContentView(R.layout.activity_weather);
                startActivity(new Intent(MainActivity.this, WeatherActivity.class));
            }
        });

    }

}
