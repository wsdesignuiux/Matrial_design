package com.example.wolfsoft3.matrial_design;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import adapter.Call_History_Tabs;

public class Calls_History extends AppCompatActivity {

    ViewPager viewpager_call_history;
    TabLayout tablayout_call_history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calls_history);

        tablayout_call_history = findViewById(R.id.tab_call_history);
        viewpager_call_history = findViewById(R.id.viewpager_call_history);


        tablayout_call_history.setTabGravity(TabLayout.GRAVITY_FILL);




        tablayout_call_history.addTab(tablayout_call_history.newTab().setIcon(R.drawable.ic_star_black_24dp));
        tablayout_call_history.addTab(tablayout_call_history.newTab().setIcon(R.drawable.clock22));
        tablayout_call_history.addTab(tablayout_call_history.newTab().setIcon(R.drawable.ic_group_black_24dp));


        Call_History_Tabs adapter = new Call_History_Tabs(getSupportFragmentManager(), tablayout_call_history.getTabCount());
        viewpager_call_history.setAdapter(adapter);
        viewpager_call_history.setOffscreenPageLimit(3);
        viewpager_call_history.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout_call_history));
        tablayout_call_history.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager_call_history.setCurrentItem(tab.getPosition());
                tab.getIcon().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.parseColor("#e7898a"), PorterDuff.Mode.SRC_IN);

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
            }
        });


    }


}
