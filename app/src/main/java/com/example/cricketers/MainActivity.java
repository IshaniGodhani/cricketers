package com.example.cricketers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    int[] cr_img={R.drawable.dhoni,R.drawable.virat,R.drawable.boomrah,R.drawable.hardik,
            R.drawable.kd,R.drawable.chahal,R.drawable.jadeja,R.drawable.rahul,
            R.drawable.rohit,R.drawable.yuvraj};
    String[] cr_name={"M.S.Dhoni","Virat kohali","Jasprit Boomrah","Harik Pandya",
    "Kapil Dev","Yuzi chahal","Ravindra jadeja","KL Rahul","Rohit Sharma","Yuvraj Singh"};

    ListView listView;
    ListAdapter listAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.list_item);
        listAdapter=new ListAdapter(this,cr_img,cr_name);
        listView.setAdapter(listAdapter);


    }
}