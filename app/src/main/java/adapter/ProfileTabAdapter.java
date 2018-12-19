package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import fragment.Person;


/**
 * Created by wolfsoft4 on 3/12/18.
 */

public class ProfileTabAdapter extends FragmentPagerAdapter {


    int mnooftabs;

    public ProfileTabAdapter(FragmentManager fm, int mnooftabs) {
        super(fm);
        this.mnooftabs = mnooftabs;

    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
                Person tab1 = new Person();
                return tab1;

            case 1:
                Person tab2 = new Person();
                return tab2;

            case 2:
                Person tab3 = new Person();
                return tab3;

            case 3:
                Person tab4 = new Person();
                return tab4;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
