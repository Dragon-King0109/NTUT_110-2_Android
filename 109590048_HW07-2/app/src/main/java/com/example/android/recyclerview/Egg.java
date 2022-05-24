package com.example.android.recyclerview;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Egg extends AppCompatActivity {

    private TextView recipe1;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egg);
        recipe1 = (TextView) findViewById(R.id.recipe1);
        recipe1.setText("9 eggs\n" +
                "2 tablespoons sesame seeds\n" +
                "½ cup mayonnaise\n" +
                "2 teaspoons soy sauce\n" +
                "2 teaspoons wasabi paste\n" +
                "2 teaspoons rice wine vinegar\n" +
                "2 tablespoons thinly sliced green onions\n" +
                "4 tablespoons panko bread crumbs");
    }
}