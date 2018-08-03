package com.example.sey.usersapp;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.example.sey.usersapp.Frags.CallFragment;
import com.example.sey.usersapp.Frags.MailFragment;
import com.example.sey.usersapp.Frags.UsersFragment;
import com.example.sey.usersapp.mods_data.DataProvider;
import android.support.design.widget.TabLayout;

public class UserTabs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_tabs);
        //


        Toolbar toolbar =  findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        final FrAdapter adapter = new FrAdapter(getSupportFragmentManager());
        adapter.addFragment(new UsersFragment());
        adapter.addFragment(new MailFragment());
        adapter.addFragment(new CallFragment());
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_users_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_mail_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_call_24dp);
    }

}

