package com.example.wolfsoft3.matrial_design;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import adapter.TabAdaptersettings2;

public class Settings2 extends AppCompatActivity {
    ViewPager viewpager1;
    TabLayout tablayout1;

    private Typeface mTypeface;
    private Typeface mTypefaceBold;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings2);

        viewpager1 = findViewById(R.id.viewpager1);
        tablayout1 = findViewById(R.id.tablayout1);

        setCustomFontAndStyle(tablayout1, 0);
        tablayout1.setTabGravity(TabLayout.GRAVITY_FILL);

        tablayout1.addTab(tablayout1.newTab().setText("ALL"));
        tablayout1.addTab(tablayout1.newTab().setText("SUPPORT"));

        Typeface mTypeface = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Medium.ttf");
        ViewGroup vg = (ViewGroup) tablayout1.getChildAt(0);
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


        TabAdaptersettings2 adapter = new TabAdaptersettings2(getSupportFragmentManager(), tablayout1.getTabCount());
        viewpager1.setAdapter(adapter);
        viewpager1.setOffscreenPageLimit(2);
        viewpager1.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout1));

    }

    private void setCustomFontAndStyle(TabLayout tabLayout, Integer position) {


        mTypeface = Typeface.createFromAsset(getAssets(), "fonts/SF-Pro-Display-Light.otf");
        mTypefaceBold = Typeface.createFromAsset(getAssets(), "fonts/SF-Pro-Display-Medium.otf");
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
