package com.example.wolfsoft3.matrial_design;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import adapter.Alumbs1_adapter;
import model.Alumbs1_model;

public class Albums1Activity extends AppCompatActivity implements View.OnClickListener {
    Integer image_photo[] ={R.drawable.image1,R.drawable.image2,
            R.drawable.image1,R.drawable.image2};
    String tv1[] = {"Camera","Screenshots","Camera","Screenshots"};

    private RecyclerView recyclerView;
    private Alumbs1_adapter alumbs1_adapter;
    private ArrayList<Alumbs1_model> alumbs1_models;

    LinearLayout li1,li2,li3;
    TextView t1,t2,t3;
    ImageView img1,img2,img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums1);
        li1 = findViewById(R.id.li1);
        li2 = findViewById(R.id.li2);
        li3 = findViewById(R.id.li3);

        t1= findViewById(R.id.t1);
        t2= findViewById(R.id.t2);
        t3= findViewById(R.id.t3);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);

        li1.setOnClickListener(this);
        li2.setOnClickListener(this);
        li3.setOnClickListener(this);


        recyclerView = findViewById(R.id.recycle_albums1);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(Albums1Activity.this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        alumbs1_models = new ArrayList<>();

        for (int i = 0; i < image_photo.length; i++) {
            Alumbs1_model ab = new Alumbs1_model(image_photo[i],tv1[i]);
            alumbs1_models.add(ab);
        }
        alumbs1_adapter = new Alumbs1_adapter(Albums1Activity.this, alumbs1_models);
        recyclerView.setAdapter(alumbs1_adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.li1:
                img1.setImageResource(R.drawable.ic_baseline_assistant_red);
                img2.setImageResource(R.drawable.ic_baseline_photo_black);
                img3.setImageResource(R.drawable.ic_baseline_bookmard_black);

                t1.setTextColor(Color.parseColor("#cb0000"));
                t2.setTextColor(Color.parseColor("#8a000000"));
                t3.setTextColor(Color.parseColor("#8a000000"));
                break;

            case R.id.li2:
                img1.setImageResource(R.drawable.ic_baseline_assistant_black);
                img2.setImageResource(R.drawable.ic_baseline_photo_red);
                img3.setImageResource(R.drawable.ic_baseline_bookmard_black);

                t1.setTextColor(Color.parseColor("#8a000000"));
                t2.setTextColor(Color.parseColor("#cb0000"));
                t3.setTextColor(Color.parseColor("#8a000000"));
                break;

            case R.id.li3:
                img1.setImageResource(R.drawable.ic_baseline_assistant_black);
                img2.setImageResource(R.drawable.ic_baseline_photo_black);
                img3.setImageResource(R.drawable.ic_baseline_bookmard_red);

                t1.setTextColor(Color.parseColor("#8a000000"));
                t2.setTextColor(Color.parseColor("#8a000000"));
                t3.setTextColor(Color.parseColor("#cb0000"));
                break;
        }
    }
}
