package com.example.dddeok.timeschedule;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int Max_Page = 3;
    android.support.v4.app.Fragment fragment = new android.support.v4.app.Fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager viewPager = (ViewPager)findViewById(R.id.main_viewpager);
        viewPager.setAdapter(new adapter(getSupportFragmentManager()));

    }
    public class adapter extends FragmentPagerAdapter{
        public adapter(android.support.v4.app.FragmentManager fm) {
            super(fm);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            if(position<0 || Max_Page<=position)
                return null;
            switch (position){
                case 0:
                    fragment = new main_schedule();
                    break;
                case 1:
                    fragment = new spare_time();
                    break;
                case 2:
                    fragment = new self_develop();
                    break;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return Max_Page;
        }
    }
}

