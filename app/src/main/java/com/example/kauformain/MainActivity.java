package com.example.kauformain;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private RecyclerView recycler_view;
    private List<KuaforListe> person_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler_view = (RecyclerView)findViewById(R.id.idrecycleview);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);

        recycler_view.setLayoutManager(layoutManager);

        person_list = new ArrayList<KuaforListe>();

        person_list.add(new KuaforListe("Nisan Kuafor",  R.drawable.nisan_1));
        person_list.add(new KuaforListe("Vip Class Bayan Kuaförü",  R.drawable.nisan_1));
        person_list.add(new KuaforListe("Su Kuaför", R.drawable.nisan_1));
        person_list.add(new KuaforListe("Samet Bayan Kuaförü", R.drawable.nisan_1));
        person_list.add(new KuaforListe("Hair White Bayan Kuaförü", R.drawable.nisan_1));


        SimpleRecyclerAdapter adapter_items = new SimpleRecyclerAdapter(person_list, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Log.d("position", "Tıklanan Pozisyon:" + position);
                KuaforListe person = person_list.get(position);
                Toast.makeText(getApplicationContext(),"pozisyon:"+" "+position+" "+"Ad:"+person.getName(),Toast.LENGTH_SHORT).show();
            }
        });
        recycler_view.setHasFixedSize(true);

        recycler_view.setAdapter(adapter_items);

        recycler_view.setItemAnimator(new DefaultItemAnimator());




    }
}
