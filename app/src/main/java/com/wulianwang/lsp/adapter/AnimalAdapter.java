package com.wulianwang.lsp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.wulianwang.lsp.R;
import com.wulianwang.lsp.bean.Animal;

import java.util.LinkedList;

/**
 * 谭敏，孙彦婷
 * 5.12.1 未接（fragment)
 * （不显示时间），点击任务，显示未接任务详情
 */

public class AnimalAdapter extends BaseAdapter {

    private LinkedList<Animal> mData;
    private Context mContext;

    public AnimalAdapter(LinkedList<Animal> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(mContext).inflate(R.layout.anmial,parent,false);

        TextView txt_aName = (TextView) convertView.findViewById(R.id.textView2);
        TextView txt_aSpeak = (TextView) convertView.findViewById(R.id.textView3);

        txt_aName.setText(mData.get(position).getaName());
        txt_aSpeak.setText(mData.get(position).getaSpeak());
        return convertView;
    }
}