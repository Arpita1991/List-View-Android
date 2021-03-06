package com.example.arpita.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Arpita on 2016-06-25.
 */
public class CustomListAdapter extends ArrayAdapter {

    private final Activity context;
    private final String[] name;
    private final Integer[] imgid;

    public CustomListAdapter(Activity context, String[] name, Integer[] imgid) {
        super(context, R.layout.mylist, name);
        this.context = context;
        this.name = name;
        this.imgid = imgid;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        txtTitle.setText(name[position]);
        imageView.setImageResource(imgid[position]);
        return rowView;
    };
}
