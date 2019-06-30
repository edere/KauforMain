package com.example.kauformain;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KuaforDetay extends AppCompatActivity {

    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;
    ViewPager viewPager;
    Context context = this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.kuafordetay);
        super.onCreate(savedInstanceState);

        TabLayout tablLayout = (TabLayout) findViewById(R.id.idtablayout);
        tablLayout.setTabGravity(tablLayout.GRAVITY_FILL);
        viewPager = findViewById(R.id.idviewpagertab);
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), context));
        tablLayout.setupWithViewPager(viewPager);


        tablLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}