package com.wulianwang.lsp.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Fragment;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 谭敏，孙彦婷
 * 5.12.1 未接（fragment)
 * （不显示时间），点击任务，显示未接任务详情
 */


public class BlankFragment extends Fragment  implements AdapterView.OnItemClickListener {

    private List<Animal> mData = null;
    private Context mContext;
    private AnimalAdapter mAdapter = null;
    private ListView list_animal;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mContext = getActivity();
        list_animal = (ListView) view.findViewById(R.id.listview);
        mData = new LinkedList<Animal>();
        mData.add(new Animal("更换灯泡", "信阳市平桥区五号公馆12#1401更换灯泡"));
        mData.add(new Animal("更换灯泡", "信阳市平桥区五号公馆12#1401更换灯泡"));
        mData.add(new Animal("更换灯泡", "信阳市平桥区五号公馆12#1401更换灯泡"));
        mData.add(new Animal("更换灯泡", "信阳市平桥区五号公馆12#1401更换灯泡"));
        mData.add(new Animal("更换灯泡", "信阳市平桥区五号公馆12#1401更换灯泡"));
        mData.add(new Animal("更换灯泡", "信阳市平桥区五号公馆12#1401更换灯泡"));
        mData.add(new Animal("更换灯泡", "信阳市平桥区五号公馆12#1401更换灯泡"));
        mData.add(new Animal("更换灯泡", "信阳市平桥区五号公馆12#1401更换灯泡"));
        mData.add(new Animal("更换灯泡", "信阳市平桥区五号公馆12#1401更换灯泡"));
        mData.add(new Animal("更换灯泡", "信阳市平桥区五号公馆12#1401更换灯泡"));
        mData.add(new Animal("更换灯泡", "信阳市平桥区五号公馆12#1401更换灯泡"));
        mData.add(new Animal("更换灯泡", "信阳市平桥区五号公馆12#1401更换灯泡"));
        mData.add(new Animal("更换灯泡", "信阳市平桥区五号公馆12#1401更换灯泡"));
        mData.add(new Animal("更换灯泡", "信阳市平桥区五号公馆12#1401更换灯泡"));
        mData.add(new Animal("更换灯泡", "信阳市平桥区五号公馆12#1401更换灯泡"));
        mData.add(new Animal("更换灯泡", "信阳市平桥区五号公馆12#1401更换灯泡"));
        mData.add(new Animal("更换灯泡", "信阳市平桥区五号公馆12#1401更换灯泡"));
        mData.add(new Animal("更换灯泡", "信阳市平桥区五号公馆12#1401更换灯泡"));
        mData.add(new Animal("更换灯泡", "信阳市平桥区五号公馆12#1401更换灯泡"));
        mData.add(new Animal("更换灯泡", "信阳市平桥区五号公馆12#1401更换灯泡"));


        mAdapter = new AnimalAdapter((LinkedList<Animal>) mData, mContext);
        list_animal.setAdapter(mAdapter);
//        list_animal.setAdapter(mAdapter);
        list_animal.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(mContext, "你点击了第" + position + "项", Toast.LENGTH_SHORT).show();
    }

}
