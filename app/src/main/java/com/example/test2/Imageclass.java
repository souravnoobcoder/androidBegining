package com.example.test2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Imageclass  extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] programmingList;
    private  final Integer[] programmingImages;

    public Imageclass(Activity context, String[] programmingList, Integer[] programmingImages) {
        super(context,R.layout.set_images,programmingList);
        this.context = context;
        this.programmingList = programmingList;
        this.programmingImages = programmingImages;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.set_images,null,true);
        TextView texTitle=rowView.findViewById(R.id.name);
        ImageView imageView=rowView.findViewById(R.id.c);

        texTitle.setText(programmingList[position]);
        imageView.setImageResource(programmingImages[position]);

        return rowView;
    }
}
