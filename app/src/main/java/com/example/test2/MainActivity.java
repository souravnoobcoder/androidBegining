package com.example.test2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView textview,textview2,textView3;
EditText firstname,lastname,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button=findViewById(R.id.button);
        Button button3=findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                 textview=findViewById(R.id.textview);
                 textview2=findViewById(R.id.textview2);
                 textView3=findViewById(R.id.textview3);

                 firstname=findViewById(R.id.firstname);
                 lastname=findViewById(R.id.lastname);
                 email=findViewById(R.id.email);

                textview.setText("first name :"+firstname.getText().toString());
                textview2.setText("last name :"+lastname.getText().toString());
                textView3.setText("email :"+email.getText().toString());
                Toast.makeText(MainActivity.this,"Saved Successfully",Toast.LENGTH_LONG).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("are you sure you want to use seekBar").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(intent);
                    }
                }).setNegativeButton("Cancel",null);
                AlertDialog alert= builder.create();
                alert.show();
            }
        });
    }



    }









