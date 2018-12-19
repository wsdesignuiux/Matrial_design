package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import fragment.All;
import fragment.Support;

/**
 * Created by wolfsoft4 on 3/12/18.
 */

public class TabAdaptersettings2 extends FragmentPagerAdapter {


    int mnooftabs;

    public TabAdaptersettings2(FragmentManager fm, int mnooftabs) {
        super(fm);
        this.mnooftabs = mnooftabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                All tab1 = new All();
                return tab1;
            case 1:
                Support tab2 = new Support();
                return tab2;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
