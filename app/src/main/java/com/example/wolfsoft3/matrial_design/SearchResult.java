package com.example.wolfsoft3.matrial_design;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.RecySearchAdapter;
import model.SearchModel;

public class SearchResult extends AppCompatActivity {


    private RecySearchAdapter recySearchAdapter;
    private RecyclerView recyclerView;
    private ArrayList<SearchModel> searchModelArrayList;

    Integer img[] = {R.drawable.headphone, R.drawable.headphone,
            R.drawable.headphone,R.drawable.headphone};
    Integer imgmore[] = {R.drawable.ic_show_more_button_with_three_dots,
            R.drawable.ic_show_more_button_with_three_dots,
            R.drawable.ic_show_more_button_with_three_dots,
            R.drawable.ic_show_more_button_with_three_dots};
    String txtbeoplay[] = {"Beoplay H9i", "Beoplay H9i", "Beoplay H9i","Beoplay H9i"};
    String txtbang[] = {"Bang & Olufsen", "Bang & Olufsen", "Bang & Olufsen","Bang & Olufsen"};
    String txtprice[] = {"€250", "€250", "€250","€250"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchresult);

        recyclerView = findViewById(R.id.recyclerview1);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(SearchResult.this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        searchModelArrayList = new ArrayList<>();

        for (int i = 0; i < img.length; i++) {
            SearchModel view = new SearchModel(img[i], imgmore[i], txtbeoplay[i], txtbang[i],txtprice[i]);
            searchModelArrayList.add(view);
        }
        recySearchAdapter = new RecySearchAdapter(SearchResult.this, searchModelArrayList);
        recyclerView.setAdapter(recySearchAdapter);


    }
}
