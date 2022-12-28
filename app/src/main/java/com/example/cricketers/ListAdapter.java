package com.example.cricketers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {
    MainActivity mainActivity;
    int[] cr_img;
    String[] cr_name;
    TextView textView;
    ImageView imageView;
    public ListAdapter(MainActivity mainActivity, int[] cr_img, String[] cr_name) {
        this.mainActivity=mainActivity;
        this.cr_img=cr_img;
        this.cr_name=cr_name;

    }

    @Override
    public int getCount() {
        return cr_img.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(mainActivity).inflate(R.layout.item_category,parent,false);
        textView=convertView.findViewById(R.id.img_title);
        imageView=convertView.findViewById(R.id.img);

        textView.setText(cr_name[position]);
        imageView.setImageResource(cr_img[position]);
        return convertView;
    }
}
