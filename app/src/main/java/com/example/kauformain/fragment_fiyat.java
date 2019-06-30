package com.example.kauformain;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class fragment_fiyat extends Fragment {


    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View v = inflater.inflate(R.layout.fiyat_layout, container, false);
        ExpandableListView listView = (ExpandableListView) v.findViewById(R.id.idExpanList);
        initData();
        listAdapter = new ExpandableListAdapter(this.getContext(),listDataHeader, listHash);
        listView.setAdapter(listAdapter);
        return v;
    }


    private void initData() {


        listDataHeader = new ArrayList<>();   //Ana elemanlar için yeni bir ArrayList oluşturduk.
        listHash = new HashMap<>();           //HashMap oluşturduk.

        listDataHeader.add("Saç");     //ArrayList'e yani ana kategorilere eleman ekledik.
        listDataHeader.add("Bakım");
        listDataHeader.add("Güzellik");

        List sac = new ArrayList();   //Alt elemanlar için yeni bir ArrayList oluşturduk.
        sac.add("Fön");                          //Ana Elemanların alt elemanlarını bu List'e ekledik
        sac.add("Kırık Fön");
        sac.add("Düz Kesim");
        sac.add("Katlı Kesim");
        sac.add("Boya");
        sac.add("Brezilya Fönü");

        List bakim = new ArrayList<>();  //Aynı şekilde ikinci Ana elemanımız için alt elemanları ekledik.
        bakim.add("Manikür");
        bakim.add("Pedikür");
        bakim.add("Yüz Masaji");

        List guzellik = new ArrayList<>();  //Aynı şekilde ikinci Ana elemanımız için alt elemanları ekledik.
        guzellik.add("Masaj");
        guzellik.add("Solaryum");


        listHash.put((String) listDataHeader.get(0), sac);   //HashMap'e ana eleman ve alt eleman bağlantısını söyledik.
        //(Sıfırıncı ana eleman ın alt elemanları: pc adlı ArrayList)
        listHash.put((String) listDataHeader.get(1), bakim);
        listHash.put((String) listDataHeader.get(2), guzellik);
    }

}
