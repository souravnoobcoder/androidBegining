package com.example.test2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class practice extends AppCompatActivity {
    TextView firstName, LastName, account;
    Button b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);


        b1 = findViewById(R.id.button6);
        b2 = findViewById(R.id.button7);
        b3 = findViewById(R.id.button8);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstName = findViewById(R.id.textView6);
                firstName.setText("Sourav");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LastName = findViewById(R.id.textView7);
                LastName.setText("Rawat");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                account = findViewById(R.id.textView8);

                View view = LayoutInflater.from(practice.this).inflate(R.layout.layout, null);

                EditText username = view.findViewById(R.id.editTextTextPersonName);
                EditText password = view.findViewById(R.id.editTextNumberPassword);

                AlertDialog.Builder builder = new AlertDialog.Builder(practice.this);
                builder.setMessage("Login view");
                builder.setView(view);
                builder.setPositiveButton("Login", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (username.getText().toString().equals("Sourav") && password.getText().toString().equals("1234")) {
                            account.setText("50000");
                        } else account.setText("100");
                    }
                });
                builder.setNegativeButton("Cancel", null);
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
}