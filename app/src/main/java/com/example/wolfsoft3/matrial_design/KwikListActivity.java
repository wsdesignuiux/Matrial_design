package com.example.wolfsoft3.matrial_design;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.KwikListRecycleAdapter;
import model.KwikListModelClass;


public class KwikListActivity extends AppCompatActivity {


    private ArrayList<KwikListModelClass> kwikListModelClasses;
    private RecyclerView recyclerView;
    private KwikListRecycleAdapter bAdapter;

    private String txt[]={"01.Calls_History","02.Call","03.Mail","04.Gmail",

            "05.Navigation_Drawer","06.Route","07.Collapsing_Contacts",

            "08.Contact","9.Maps", "10.NewEvent","11.Setting1",

            "12.Chat","13.Messanger","14.ProfileCpy","15.SearchResult",

            "16.Settings2","17.Albums1Activity","18.DownloadsCopyActivity"

            ,"19.EmptyState1Activity", "20.MessageemptystatesActivity","21.Photos1Activity"

            ,"22.SearchResult1Activity","23.Walkthrough1Activity"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_recycle);


        recyclerView = findViewById(R.id.listrecycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(KwikListActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        kwikListModelClasses = new ArrayList<>();

        for (int i = 0; i < txt.length; i++) {
            KwikListModelClass beanClassForRecyclerView_contacts = new KwikListModelClass(txt[i]);
            kwikListModelClasses.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new KwikListRecycleAdapter(KwikListActivity.this,kwikListModelClasses);
        recyclerView.setAdapter(bAdapter);


    }
}
