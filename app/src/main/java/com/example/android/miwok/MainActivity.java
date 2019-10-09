package com.example.android.miwok;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager = findViewById(R.id.pager);
        MiwakViewPagerAdapter pagerAdapter = new MiwakViewPagerAdapter(getSupportFragmentManager(), this);
        pager.setAdapter(pagerAdapter);

        TabLayout tab = findViewById(R.id.tab);
        tab.setupWithViewPager(pager);
    }

}
