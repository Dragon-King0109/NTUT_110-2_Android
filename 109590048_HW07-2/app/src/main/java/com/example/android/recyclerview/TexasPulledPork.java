package com.example.android.recyclerview;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TexasPulledPork extends AppCompatActivity {

    private TextView recipe3;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texas_pulled_pork);
        recipe3 = (TextView) findViewById(R.id.recipe3);
        recipe3.setText("1 teaspoon vegetable oil\n" +
                "1 (4 pound) pork shoulder roast\n" +
                "1 cup barbeque sauce\n" +
                "½ cup apple cider vinegar\n" +
                "½ cup chicken broth\n" +
                "¼ cup light brown sugar\n" +
                "1 tablespoon prepared yellow mustard\n" +
                "1 tablespoon Worcestershire sauce\n" +
                "1 tablespoon chili powder\n" +
                "1 extra large onion, chopped\n" +
                "2 large cloves garlic, crushed\n" +
                "1 ½ teaspoons dried thyme\n" +
                "8 hamburger buns, split\n" +
                "2 tablespoons butter, or as needed");
    }
}