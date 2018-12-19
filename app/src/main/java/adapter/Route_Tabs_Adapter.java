package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.Fragment1;


/**
 * Created by wolfsoft3 on 12/9/18.
 */

public class Route_Tabs_Adapter extends FragmentStatePagerAdapter {

    int mnooftabs;

    public Route_Tabs_Adapter(FragmentManager fm, int mnooftabs) {
        super(fm);
        this.mnooftabs = mnooftabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Fragment1 tab1 = new Fragment1();
                return tab1;

            case 1:
                Fragment1 tab2 = new Fragment1();
                return tab2;

            case 2:
                Fragment1 tab3 = new Fragment1();
                return tab3;

            case 3:
                Fragment1 tab4 = new Fragment1();
                return tab4;



            default:

                return null;
        }
    }

    @Override
    public int getCount() {
        return mnooftabs;
    }
}
