package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button forRating,button;
    SeekBar seekBar;
TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1=findViewById(R.id.size);
        seekBar=findViewById(R.id.seekBar);
        t2=findViewById(R.id.number);
        button=findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                t1.setTextSize(progress*5);
                t2.setText(progress+"");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity2.this,"Started",Toast.LENGTH_LONG);
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity2.this,"Stopped",Toast.LENGTH_LONG);
            }

        });
        forRating=findViewById(R.id.button4);
        forRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(MainActivity2.this,ratingBar.class);
                startActivity(next);
            }
        });


    }


}