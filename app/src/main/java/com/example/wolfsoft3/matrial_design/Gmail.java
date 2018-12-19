package com.example.wolfsoft3.matrial_design;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import adapter.Item_Gmail_Adapter;
import model.Item_Gmail_Model;

public class Gmail extends AppCompatActivity {

    ImageView image1,image2,image3,image4,image5;
    TextView text;


    private Item_Gmail_Adapter item_gmail_adapter;
    private RecyclerView recyclerview;
    private ArrayList<Item_Gmail_Model> modelArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gmail);

        image1 = findViewById(R.id.back);
        image1.setImageResource(R.drawable.menu);

        text = findViewById(R.id.text);
        text.setVisibility(View.VISIBLE);

        image2 = findViewById(R.id.download_id);
        image2.setVisibility(View.GONE);

        image3 = findViewById(R.id.delete_id);
        image3.setVisibility(View.GONE);

        image4 = findViewById(R.id.message_id);
        image4.setVisibility(View.GONE);

        image5 = findViewById(R.id.dot_id);
        image5.setImageResource(R.drawable.search1);




        recyclerview = (RecyclerView) findViewById(R.id.recycle_gmail);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Gmail.this);
        recyclerview.setLayoutManager(layoutManager);


        modelArrayList = new ArrayList<>();

        modelArrayList.add(new Item_Gmail_Model("WSDesign","Welcome to WSDesign","Subscribe to WSDesign now, and get…"));
        modelArrayList.add(new Item_Gmail_Model("Dribble","Thank you for purchasing!","When you arrive prepared to negotiate"));
        modelArrayList.add(new Item_Gmail_Model("Google Play","Thank you. You have signed up for a…","Your Google Play Music Order from…"));
        modelArrayList.add(new Item_Gmail_Model("Google Play","Thank you. You have signed up for a…","Your Google Play Music Order from…"));
        modelArrayList.add(new Item_Gmail_Model("Google Play","Thank you. You have signed up for a…","Your Google Play Music Order from…"));
        modelArrayList.add(new Item_Gmail_Model("Google Play","Thank you. You have signed up for a…","Your Google Play Music Order from…"));





        item_gmail_adapter = new Item_Gmail_Adapter(Gmail.this, modelArrayList);
        recyclerview.setAdapter(item_gmail_adapter);


    }
}
