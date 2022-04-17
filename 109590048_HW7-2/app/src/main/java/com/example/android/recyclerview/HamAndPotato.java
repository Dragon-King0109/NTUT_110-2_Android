package com.example.android.recyclerview;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HamAndPotato extends AppCompatActivity {

    private TextView recipe2;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ham_and_potato);
        recipe2 = (TextView) findViewById(R.id.recipe2);
        recipe2.setText("¼ cup unsalted butter\n" +
                "1 cup diced yellow onion\n" +
                "¼ cup all-purpose flour\n" +
                "2 cups heavy cream\n" +
                "2 cups whole milk\n" +
                "2 teaspoons kosher salt, divided, or to taste\n" +
                "½ teaspoon freshly ground black pepper\n" +
                "¼ teaspoon cayenne pepper\n" +
                "⅛ teaspoon freshly grated nutmeg\n" +
                "¼ teaspoon Worcestershire sauce\n" +
                "2 teaspoons chopped fresh thyme leaves\n" +
                "4 ½ pounds russet potatoes, peeled and sliced 1/4 inch thick\n" +
                "8 ounces grated sharp white Cheddar cheese\n" +
                "1 pound thinly sliced ham");
    }
}