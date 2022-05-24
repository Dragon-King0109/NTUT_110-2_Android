package com.example.a109590048_hw4_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int mCount = 0;
    private TextView showCount;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount = (TextView) findViewById(R.id.show_count);

        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");

        if(savedInstanceState != null){
            mCount = savedInstanceState.getInt("SaveCount");
            showCount.setText(Integer.toString(mCount));
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("SaveCount", mCount);
    }

    @SuppressLint("SetTextI18n")
    public void countUp(View view) {
        mCount++;
        if (showCount != null)
            showCount.setText(Integer.toString(mCount));
    }
}