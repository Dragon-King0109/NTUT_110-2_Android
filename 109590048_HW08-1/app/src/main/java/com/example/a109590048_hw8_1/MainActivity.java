package com.example.a109590048_hw8_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView ImageView_battery;
    Integer NowLevel = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView_battery = findViewById(R.id.Imageview_battery);
        ImageView_battery.setImageLevel(NowLevel);
    }

    public void Plus(View view) {
        if (NowLevel < 6){
            NowLevel += 1;
        }
        ImageView_battery.setImageLevel(NowLevel);
    }

    public void Minus(View view) {
        if (NowLevel > 0){
            NowLevel -= 1;
        }
        ImageView_battery.setImageLevel(NowLevel);
    }
}