package com.wulianwang.lsp.adapter;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.wulianwang.lsp.R;

/**
 * 刘长恩 曹彬 3.5
 */
public class MyListAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public MyListAdapter(Context context){
        this.mContext =context;
        mLayoutInflater =LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    static class  ViewHolder {
        public ImageView imageView,Arraw1;
        TextView tvTile, tvTime, tvContent;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder =null;
        if(convertView == null){
            convertView = mLayoutInflater.inflate(R.layout.layout_list_item,null);
            holder =new ViewHolder();
            holder.imageView =(ImageView)convertView.findViewById(R.id.iv);
            holder.Arraw1 =(ImageView)convertView.findViewById(R.id.iv1);
            holder.tvTile=(TextView)convertView.findViewById(R.id.tv_title);
            holder.tvTime=(TextView)convertView.findViewById(R.id.tv_Time);
            holder.tvContent=(TextView)convertView.findViewById(R.id.tv_Content);
            convertView.setTag(holder);

        }
        else{
            holder =(ViewHolder)convertView.getTag();
        }
        holder.tvTile.setText("黎明");
        holder.tvTime.setText("2008-9-10");
        holder.tvContent.setText("河南信阳");


        //Glide.with(mContext).load("").inti(holder.imageView);
        //holder.imageView.getBackground();
        return convertView;
    }
}
