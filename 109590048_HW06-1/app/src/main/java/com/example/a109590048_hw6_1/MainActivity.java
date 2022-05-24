package com.example.a109590048_hw6_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox Choco;
    CheckBox Sprinkles;
    CheckBox Crushed_nuts;
    CheckBox Cherries;
    CheckBox Oreo;

    String str = "Toppings: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Choco = findViewById(R.id.Chocolate_Syrup_Box);
        Sprinkles = findViewById(R.id.Sprinkles_Box);
        Crushed_nuts = findViewById(R.id.Crushed_nuts_Box);
        Cherries = findViewById(R.id.Cherries_Box);
        Oreo = findViewById(R.id.Oreo_Box);
    }

    public void Toast(View view) {
        if (Choco.isChecked()) {
            str += "Chocolate Syrup ";
        }
        if (Sprinkles.isChecked()) {
            str += "Sprinkles ";
        }
        if (Crushed_nuts.isChecked()) {
            str += "Crushed nuts";
        }
        if (Cherries.isChecked()) {
            str += "Cherries";
        }
        if (Oreo.isChecked()) {
            str += "Oreo Cookie crumbles";
        }
        Toast.makeText(this, str, Toast.LENGTH_LONG).show();
        str = "Toppings: ";
    }
}