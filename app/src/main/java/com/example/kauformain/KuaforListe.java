package com.example.kauformain;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class KuaforListe {

    private String name;
    private int photo_id;

    public int getPhoto_id() {
        return this.photo_id;
    }

    public String getName() {
        return this.name;
    }

    public KuaforListe(String name, int photo_id) {
        this.name = name;
        this.photo_id = photo_id;
    }

    public KuaforListe()
    {

    }
}
