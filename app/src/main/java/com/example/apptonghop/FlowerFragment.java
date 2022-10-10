package com.example.apptonghop;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import kotlinx.coroutines.flow.Flow;


public class FlowerFragment extends Fragment {
    FlowerAdapter flowerAdapter;
    ArrayList<Flower> list;
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=  inflater.inflate(R.layout.fragment_list, container, false);
        list = new ArrayList<>();
        list.add(new Flower(R.drawable.t1, "Hoa Hồng", "Tình yêu"));
        list.add(new Flower(R.drawable.t2, "Hoa Lưu Ly", "Tình yêu"));
        list.add(new Flower(R.drawable.t3, "Hoa Cúc", "Tình yêu"));
        list.add(new Flower(R.drawable.m1, "Hoa Mẫu Đơn", "Tình mẫu tử"));
        list.add(new Flower(R.drawable.m2, "Hoa Ly", "Tình mẫu tử"));
        list.add(new Flower(R.drawable.m3, "Hoa Sơn Trà", "Tình mẫu tử"));
        listView =view.findViewById(R.id.listView);
        flowerAdapter= new FlowerAdapter(getContext(),R.layout.item,list);
        listView.setAdapter(flowerAdapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent = new Intent(getContext(),MoTa.class);
//                intent.putExtra("key1",nhacList.get(i).getImg());
//                intent.putExtra("key2",nhacList.get(i).getTenNhac());
//                intent.putExtra("key3",nhacList.get(i).getTacGia());
//                intent.putExtra("key4",nhacList.get(i).getTenCaSi());
//                intent.putExtra("key5",nhacList.get(i).getMoTa());
//                startActivity(intent);
//            }
        return  view;
    }
}