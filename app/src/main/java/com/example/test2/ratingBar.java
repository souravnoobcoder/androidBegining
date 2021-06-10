package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class ratingBar extends AppCompatActivity {
RatingBar ratingBar;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);
        ratingBar=findViewById(R.id.ratingBar);
        textView=findViewById(R.id.val);
        ratingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> textView.setText("Rating : "+rating));
    }
}