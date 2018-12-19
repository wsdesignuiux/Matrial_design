package com.example.wolfsoft3.matrial_design;

import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import adapter.ProfileTabAdapter;

public class ProfileCpy extends AppCompatActivity {


    ViewPager viewpager2;
    TabLayout tablayout2;


    private Typeface mTypeface;
    private Typeface mTypefaceBold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profilecopy);

        viewpager2 = findViewById(R.id.viewpager2);
        tablayout2 = findViewById(R.id.tablayout2);

        setCustomFontAndStyle(tablayout2, 0);
        tablayout2.setTabGravity(TabLayout.GRAVITY_FILL);

        tablayout2.addTab(tablayout2.newTab().setIcon(R.drawable.ic_explore));
        tablayout2.addTab(tablayout2.newTab().setIcon(R.drawable.ic_apps));
        tablayout2.addTab(tablayout2.newTab().setIcon(R.drawable.ic_favorite));
        tablayout2.addTab(tablayout2.newTab().setIcon(R.drawable.ic_person));



        Typeface mTypeface = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Medium.ttf");
        ViewGroup vg = (ViewGroup) tablayout2.getChildAt(0);
        int tabsCount = vg.getChildCount();
        for (int j = 0; j < tabsCount; j++) {
            ViewGroup vgTab = (ViewGroup) vg.getChildAt(j);
            int tabChildsCount = vgTab.getChildCount();
            for (int i = 0; i < tabChildsCount; i++) {
                View tabViewChild = vgTab.getChildAt(i);
                if (tabViewChild instanceof TextView) {
                    ((TextView) tabViewChild).setTypeface(mTypeface, Typeface.NORMAL);
                }
            }
        }


        ProfileTabAdapter adapter = new ProfileTabAdapter(getSupportFragmentManager(), tablayout2.getTabCount());
        viewpager2.setAdapter(adapter);
        viewpager2.setOffscreenPageLimit(2);
        viewpager2.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout2));
        tablayout2.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int tabIconColor = ContextCompat.getColor(ProfileCpy.this, R.color.tabSelectedIconColor);
                tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

                int tabIconColor = ContextCompat.getColor(ProfileCpy.this, R.color.tabUnselectedIconColor);
                tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    private void setCustomFontAndStyle(TabLayout tabLayout, Integer position) {

        mTypeface = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Medium.ttf");
        mTypefaceBold = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Medium.ttf");
        ViewGroup vg = (ViewGroup) tabLayout.getChildAt(0);
        int tabsCount = vg.getChildCount();
        for (int j = 0; j < tabsCount; j++) {
            ViewGroup vgTab = (ViewGroup) vg.getChildAt(j);
            int tabChildsCount = vgTab.getChildCount();
            for (int i = 0; i < tabChildsCount; i++) {
                View tabViewChild = vgTab.getChildAt(i);
                if (tabViewChild instanceof TextView) {
                    if (j == position) {
                        ((TextView) tabViewChild).setTypeface(mTypefaceBold, Typeface.NORMAL);
                    } else {
                        ((TextView) tabViewChild).setTypeface(mTypeface, Typeface.NORMAL);
                    }
                }
            }
        }


    }
}
