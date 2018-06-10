package com.example.android.singlescreen.ui.activities.carddetail;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewpagerAdapter extends FragmentPagerAdapter {

    //List of fragments
    private final List<Fragment> fragmentList = new ArrayList<>();
    //List of titles for fragments
    private final List<String> titleList = new ArrayList<>();

    //Default constructor
    ViewpagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    /**
     * Method to add fragments for viewPager
     * <p>
     * The method can have tag and bundle as addition parameters for future use
     * <p>
     * Being used in {@link CardDetailActivity#setUpViewpager()}
     *
     * @since 1.0
     */
    public void addFragment(Fragment fragment, String title) {
        fragmentList.add(fragment);
        titleList.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
}
