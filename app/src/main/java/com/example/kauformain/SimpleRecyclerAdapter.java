package com.example.kauformain;

import android.content.Context;
import android.content.Intent;
import android.security.keystore.KeyNotYetValidException;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SimpleRecyclerAdapter extends RecyclerView.Adapter<SimpleRecyclerAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView person_name;
        public TextView person_age;
        public ImageView person_img;
        public CardView card_view;


        public ViewHolder(View view) {
            super(view);

            card_view = (CardView)view.findViewById(R.id.idcard_view);
            person_name = (TextView)view.findViewById(R.id.kuafor_name);
            person_img = (ImageView)view.findViewById(R.id.kuafor_photo);

        }
    }

    List<KuaforListe> list_person;
    CustomItemClickListener listener;
    public SimpleRecyclerAdapter(List<KuaforListe> list_person, CustomItemClickListener listener) {

        this.list_person = list_person;
        this.listener = listener;
    }


    @Override
    public SimpleRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout, parent, false);
        final ViewHolder view_holder = new ViewHolder(v);

        v.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, KuaforDetay.class);
                context.startActivity(intent);
            }
        });

        return view_holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.person_name.setText(list_person.get(position).getName());
        holder.person_img.setImageResource(list_person.get(position).getPhoto_id());

    }

    @Override
    public int getItemCount() {
        return list_person.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


}
