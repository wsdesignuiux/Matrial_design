package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.Viewpager_call_histrory_Fragment;


/**
 * Created by wolfsoft3 on 12/9/18.
 */

public class Call_History_Tabs extends FragmentStatePagerAdapter {

    int mnooftabs;

    public Call_History_Tabs(FragmentManager fm, int mnooftabs) {
        super(fm);
        this.mnooftabs = mnooftabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Viewpager_call_histrory_Fragment tab1 = new Viewpager_call_histrory_Fragment();
                return tab1;

            case 1:
                Viewpager_call_histrory_Fragment tab2 = new Viewpager_call_histrory_Fragment();
                return tab2;

            case 2:
                Viewpager_call_histrory_Fragment tab3 = new Viewpager_call_histrory_Fragment();
                return tab3;

            default:

                return null;
        }
    }

    @Override
    public int getCount() {
        return mnooftabs;
    }
}
