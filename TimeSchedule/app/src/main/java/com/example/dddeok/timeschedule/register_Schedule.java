package com.example.dddeok.timeschedule;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class register_Schedule extends AppCompatActivity{
    View view;
    int MAX_PAGE=3;
    Fragment fragment = new Fragment();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        ViewPager viewPager = (ViewPager)findViewById(R.id.register);
        viewPager.setAdapter(new adapter(getSupportFragmentManager()));
    }
    private class adapter extends FragmentPagerAdapter{
        public adapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if(position<0 || MAX_PAGE<=position)
                return null;
            switch (position){
                case 0:
                    fragment = new register1();
                    break;
                case 1:
                    fragment = new register2();
                    break;
                case 2:
                    fragment = new register3();
                    break;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }
    }

}
