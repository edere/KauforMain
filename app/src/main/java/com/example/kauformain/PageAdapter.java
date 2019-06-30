package com.example.kauformain;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Toast;

public class PageAdapter extends FragmentPagerAdapter {
    private String[] tabtitle = new String[]{"Fiyat", "Hakkında", "Ustalar", "Kampanyalar", "Yorumlar"};
    Context context;

    public PageAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }


    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            fragment_fiyat fragment_fiyat = new fragment_fiyat();
            return fragment_fiyat;
        }
        else{

            Fragment_Hakkinda fragment_hakkinda = new Fragment_Hakkinda();
            return fragment_hakkinda;
        }

    }

    @Override
    public int getCount() {
        return tabtitle.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitle[position];
    }
}
