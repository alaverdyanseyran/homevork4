package com.example.sey.usersapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class FrAdapter extends FragmentPagerAdapter {
    private final ArrayList<Fragment> fragments = new ArrayList<>();
    public FrAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
    public void addFragment(Fragment fr){
        fragments.add(fr);
    }
}
