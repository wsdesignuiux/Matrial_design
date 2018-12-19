package com.example.wolfsoft3.matrial_design;


import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


import com.arsy.maps_library.MapRadar;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

import adapter.Route_Tabs_Adapter;


public class Route extends AppCompatActivity {

    private double radius = 1000;
    Point displaySize = new Point();
    private LatLng origin, destination, three, four, five, six, seven;
    private static final String KEY_CAMERA_POSITION = "camera_position";
    private static final String KEY_LOCATION = "location";
    private GoogleMap mMap;
    MapRadar mapRadar;
    private Context context = Route.this;
    private int[] SELECTED_STATE_SET;
    private int[] ENABLED_STATE_SET;

    TabLayout tl;

    ViewPager viewpager_home;
    TabLayout tablayout_home;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.route);






        tablayout_home = findViewById(R.id.tablayout_route);
        viewpager_home = findViewById(R.id.viewpager_route);


        tablayout_home.setTabGravity(TabLayout.GRAVITY_FILL);



        tablayout_home.addTab(tablayout_home.newTab().setText("4 min").setIcon(R.drawable.ic_car));
        tablayout_home.addTab(tablayout_home.newTab().setText("--").setIcon(R.drawable.bus));
        tablayout_home.addTab(tablayout_home.newTab().setText("3 min").setIcon(R.drawable.ic_walk));
        tablayout_home.addTab(tablayout_home.newTab().setText("4 min").setIcon(R.drawable.lift));

        Route_Tabs_Adapter adapter = new Route_Tabs_Adapter(getSupportFragmentManager(), tablayout_home.getTabCount());
        viewpager_home.setAdapter(adapter);
        viewpager_home.setOffscreenPageLimit(4);
        viewpager_home.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout_home));
        tablayout_home.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager_home.setCurrentItem(tab.getPosition());
                tab.getIcon().setColorFilter(Color.parseColor("#a40001"), PorterDuff.Mode.SRC_IN);

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.parseColor("#a40001"), PorterDuff.Mode.SRC_IN);

            }
        });


//        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager_route);
//        if (viewPager != null) {
//            setupViewPager(viewPager);
//        }
//
//        // Setup TabLayout
//        tl = (TabLayout) findViewById(R.id.tablayout_route);
//        tl.setupWithViewPager(viewPager);
////        tl.getTabAt(0).setIcon(tabIcons[0]);
////        tl.getTabAt(1).setIcon(tabIcons[1]);
////        tl.getTabAt(2).setIcon(tabIcons[2]);
////        tl.getTabAt(3).setIcon(tabIcons[3]);
////        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
////            @Override
////            public void onTabSelected(TabLayout.Tab tab) {
////
////            }
////
////            @Override
////            public void onTabUnselected(TabLayout.Tab tab) {
////
////            }
////
////            @Override
////            public void onTabReselected(TabLayout.Tab tab) {
////
////            }
////        });
//
//
//    }
//
//
//    private void setupViewPager(ViewPager viewPager) {
//      Adapter adapter = new Adapter(
//                getSupportFragmentManager(), Route.this);
//
//        adapter.addFragment(new Fragment1(), "  4 min", R.drawable.ic_car);
//
//
//
//        adapter.addFragment(new Fragment1(), "  --", R.drawable.ic_bus);
//
//        adapter.addFragment(new Fragment1(), "  3 min", R.drawable.ic_walk);
//
//        adapter.addFragment(new Fragment1(), "  4 min", R.drawable.ic_lift);
//
//        viewPager.setAdapter(adapter);
//
//
//    }
//
//    static class Adapter extends FragmentPagerAdapter {
//        private final List<Fragment> mFragments = new ArrayList<>();
//        private final List<Integer> mFragmentIcons = new ArrayList<>();
//        private final List<String> mFragmentTitles = new ArrayList<>();
//        private Context context;
//
//        public Adapter(FragmentManager fm, Context context) {
//            super(fm);
//            this.context = context;
//        }
//
//        public void addFragment(Fragment fragment, String title, int iconId) {
//            mFragments.add(fragment);
//            mFragmentTitles.add(title);
//            mFragmentIcons.add(iconId);
//
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            if (position==0){
//
//            }
//
//
//            return mFragments.get(position);
//        }
//
//        @Override
//        public int getCount() {
//            return mFragments.size();
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//            Drawable image = context.getResources().getDrawable(mFragmentIcons.get(position), null);
//            image.setBounds(0, 0, image.getIntrinsicWidth(),
//                    image.getIntrinsicHeight());
//            SpannableString sb = new SpannableString("   " + mFragmentTitles.get(position));
//            ImageSpan imageSpan = new ImageSpan(image, ImageSpan.ALIGN_BASELINE);
//            sb.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//            return sb;
//        }
//    }
    }



}









