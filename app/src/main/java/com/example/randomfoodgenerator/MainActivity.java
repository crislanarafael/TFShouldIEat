package com.example.randomfoodgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Integer [] images = {
            R.drawable.burger,
            R.drawable.casserole,
            R.drawable.cheese,
            R.drawable.chicken,
            R.drawable.eggsandbacon,
            R.drawable.friedchicken,
            R.drawable.fries,
            R.drawable.gyro,
            R.drawable.ham,
            R.drawable.hotdog,
            R.drawable.pizza,
            R.drawable.popcorn,
            R.drawable.ramen,
            R.drawable.salad,
            R.drawable.shrimptempura,
            R.drawable.spaghetti,
            R.drawable.steak,
            R.drawable.sushi,
            R.drawable.taco
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView foodGen = ((TextView) findViewById(R.id.RandomlyGeneratedFood));
        ImageView imgView = ((ImageView) findViewById(R.id.foodImage));
        findViewById(R.id.GenerateFoodButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String [] food = {"A Burger", "Some Sort of Casserole", "A Block of Cheese", "A Whole Rotisserie Chicken", "Eggs & Bacon", "Fried Chicken", "Fries", "Gyro", "A Whole Ham", "Hotdog", "Pizza", "Popcorn", "Ramen", "Salad", "Tempura", "Spaghetti", "Steak", "Sushi", "Tacos"};
                int num = (int)(Math.random() * 12);

                imgView.setImageResource(images[num]);
                foodGen.setText(food[num].toString());



            }
        });
    }
}