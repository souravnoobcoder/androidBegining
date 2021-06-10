package com.example.test2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelStore;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class imageListview extends AppCompatActivity {
ListView listView;
Context context;
ArrayList programmingList;
public static Integer[] programmingImage={
        R.drawable.c,
        R.drawable.cplus,
        R.drawable.to,
        R.drawable.go,
        R.drawable.javascript,
        R.drawable.python,
        R.drawable.react,
        R.drawable.ruby,
        R.drawable.swift,
        R.drawable.typescript
};

public static String[] programmingNames={
    "C","C++","Java","Go","Javascript","Python","React","Ruby","Swift","Typescript"
};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_listview);


        Imageclass adapter=new Imageclass(imageListview.this,programmingNames,programmingImage);
        listView=findViewById(R.id.mainlistview);
        listView.setAdapter(adapter);
    }
}