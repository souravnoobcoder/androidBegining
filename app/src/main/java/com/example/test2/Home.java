package com.example.test2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {
TextView t1,t2,t3,t4,t5;
Button b1,b2,b3,b4,b5;
    boolean doubleBackToExitPressedOnce = false;
Toast doubel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        t1=findViewById(R.id.textview);
        t2=findViewById(R.id.textview2);
        t3=findViewById(R.id.textview3);
        t4=findViewById(R.id.textView4);
        t5=findViewById(R.id.textView5);

        b1=findViewById(R.id.seekBar);
        b2=findViewById(R.id.Register);
        b3=findViewById(R.id.ratingBar);
        b4=findViewById(R.id.Webview);
        b5=findViewById(R.id.button5);

        b1.setOnClickListener(v -> {
            Intent forseekbar=new Intent(Home.this,MainActivity2.class);
            startActivity(forseekbar);
        });
        b2.setOnClickListener(v -> {
            Intent forRegister=new Intent(Home.this,MainActivity.class);
            startActivity(forRegister);
        });

        b3.setOnClickListener(v -> {
            Intent forRating =new Intent(Home.this,ratingBar.class);
            startActivity(forRating);
        });

        b4.setOnClickListener(v -> {
            Intent forWebpage=new Intent(Home.this,Webpage.class);
            startActivity(forWebpage);
        });
        b5.setOnClickListener(v -> {
            Intent forAccount=new Intent(Home.this,practice.class);
            startActivity(forAccount);
        });

    }
//    @Override
//    public void onBackPressed() {
//        AlertDialog.Builder builder=new AlertDialog.Builder(Home.this);
//        builder.setMessage("You really want to Exit").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//           Home.super.onBackPressed();
//            }
//        }).setNegativeButton("Cancel",null);
//        AlertDialog alert= builder.create();
//        alert.show();
//
//    }boolean doubleBackToExitPressedOnce = false;
//
@Override
public void onBackPressed() {
    if (doubleBackToExitPressedOnce) {
        super.onBackPressed();
        return;
    }

    this.doubleBackToExitPressedOnce = true;
    Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

    new Handler().postDelayed(() -> doubleBackToExitPressedOnce=false, 2000);
  }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menudemo,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
Intent intent=new Intent(Home.this,listView.class);
Intent imageIntent=new Intent(Home.this,imageListview.class);
        switch (item.getItemId()){
            case R.id.setting:
                Toast.makeText(this,"Setting",Toast.LENGTH_LONG).show();
                return true;
            case R.id.About:
                Toast.makeText(this,"About",Toast.LENGTH_LONG).show();
                return true;
            case R.id.Contact:
                Toast.makeText(this,"7818908525",Toast.LENGTH_LONG).show();
                return true;
            case R.id.Listview:
                startActivity(intent);
            case R.id.withImages:
                startActivity(imageIntent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}