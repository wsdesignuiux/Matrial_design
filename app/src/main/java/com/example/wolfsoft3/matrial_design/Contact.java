package com.example.wolfsoft3.matrial_design;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import adapter.Contacts_fragment_Adapter;

public class Contact extends AppCompatActivity {

    ViewPager viewpager1;
    TabLayout tablayout1;
    Contacts_fragment_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        tablayout1 = findViewById(R.id.tablayout1);

        viewpager1 = findViewById(R.id.viewpager1);

        tablayout1.setTabGravity(TabLayout.GRAVITY_FILL);


        tablayout1.addTab(tablayout1.newTab().setIcon(R.drawable.ic_baseline_grade_24px_star));
        tablayout1.addTab(tablayout1.newTab().setIcon(R.drawable.ic_baseline_query_builder_duration));
        tablayout1.addTab(tablayout1.newTab().setIcon(R.drawable.ic_baseline_group_24px));
//        tablayout1.getTabAt(3).getIcon().setColorFilter(Color.parseColor("#a8a8a8"), PorterDuff.Mode.SRC_IN);

        Contacts_fragment_Adapter adapter = new Contacts_fragment_Adapter(getSupportFragmentManager(), tablayout1.getTabCount());
        viewpager1.setAdapter(adapter);
        viewpager1.setOffscreenPageLimit(3);
        viewpager1.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout1));




        tablayout1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int tabIconColor = ContextCompat.getColor(Contact.this, R.color.white);
                tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

                int tabIconColor = ContextCompat.getColor(Contact.this, R.color.greylight);
                tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }



}
