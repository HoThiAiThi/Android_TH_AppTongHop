package com.example.apptonghop;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FlowerAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Flower> flowerList;

    public FlowerAdapter(Context context, int layout, List<Flower> nhacList) {
        this.context = context;
        this.layout = layout;
        this.flowerList = nhacList;
    }

    @Override
    public int getCount() {
        return flowerList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        // anh xa
        ImageView imgitem= view.findViewById(R.id.item_img);
        TextView txt_itemtitle = view.findViewById(R.id.item_title);
        TextView txt_itemmeaning = view.findViewById(R.id.item_meaning);

        Flower flower = flowerList.get(i);
        imgitem.setImageResource(flower.getSoureImg());
        txt_itemtitle.setText(flower.getTitle());
        txt_itemmeaning.setText(flower.getMeaning());
        return view;
    }
}
