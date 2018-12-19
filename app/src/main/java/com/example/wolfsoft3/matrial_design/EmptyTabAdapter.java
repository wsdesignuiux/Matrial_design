package com.example.wolfsoft3.matrial_design;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.Following;
import fragment.Friend;
import fragment.Me;


public class EmptyTabAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public EmptyTabAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Me tab1 = new Me();
                return tab1;
            case 1:
                Friend tab2 = new Friend();
                return tab2;
            case 2:
                Following tab3 = new Following();
                return tab3;

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
