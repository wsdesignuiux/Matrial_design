package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import fragment.ContactFragment;

/**
 * Created by wolfsoft3 on 24/7/18.
 */

public class Contacts_fragment_Adapter extends FragmentPagerAdapter {
    int numoftabs;

    public Contacts_fragment_Adapter(FragmentManager fm, int mnumoftabs) {
        super(fm);
        this.numoftabs = mnumoftabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ContactFragment tab1 = new ContactFragment();
                return tab1;

            case 1:
                ContactFragment tab2 = new ContactFragment();
                return tab2;

            case 2:
                ContactFragment tab3 = new ContactFragment();
                return tab3;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}
