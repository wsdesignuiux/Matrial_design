package com.example.wolfsoft3.matrial_design;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

import adapter.MessengerAdapter;
import model.MessengerModel;

public class Messanger extends AppCompatActivity {

    ImageView more;

    LinearLayout linear,bg;


    private MessengerAdapter messengerAdapter;
    private RecyclerView recyclerView;
    private ArrayList<MessengerModel> messengerModelArrayList;

    Integer profileimage[] = {R.drawable.profile, R.drawable.profile,
            R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile};

    String txtbirthdaygift[]={"Birthday gift","Gym and pool time","Write the report","Recipe to try",
            "Brunch with friends","Birthday gift"};

    String txtsandraadams[]={"Sandra Adams","Ray Neal","Carrie Mann"
            ,"Lelia Colon","to Trevor, Andrew, Sandra","Sandra Adams"};

    String txtweek[]={" — It’s the one week of the"," — Healthy, robust, contracting,"," — A wonderful serenity has",
            " — Speaking of which, Peter"," — Images span"," — It’s the one week of the"};

    String txtyear[]={"year in which you get the chance to take…","healthy, robust and contracting like a lung.",
            "taken possession of my entire soul, like…","really wants you to come in on Friday",
            "the screen in ribbons, which expand with ","year in which you get the chance to take…"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.messanger);
        linear = findViewById(R.id.linear);
        bg = findViewById(R.id.bg);
        more = findViewById(R.id.more);

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                linear.setVisibility(View.VISIBLE);
                bg.setVisibility(View.VISIBLE);
            }
        });

        bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                linear.setVisibility(View.GONE);
                bg.setVisibility(View.GONE);
            }
        });

        recyclerView = findViewById(R.id.recycler2);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Messanger.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        messengerModelArrayList = new ArrayList<>();

        for (int i = 0; i < profileimage.length; i++) {
            MessengerModel view = new MessengerModel(profileimage[i], txtbirthdaygift[i], txtsandraadams[i], txtweek[i], txtyear[i]);
            messengerModelArrayList.add(view);
        }
        messengerAdapter = new MessengerAdapter(Messanger.this, messengerModelArrayList);
        recyclerView.setAdapter(messengerAdapter);


    }
}
