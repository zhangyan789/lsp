package com.wulianwang.lsp.adapter;


/**
 *     成员：刘长恩 曹彬
 *     3.5 企业服务
 *     下拉框，不显示时间，所有企业未接工单，分页显示
 */


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.wulianwang.lsp.R;

import java.util.List;

public class MyListAdapter extends BaseAdapter {
    private Context mContext;
    private List<MyList> gridlist;
    private LayoutInflater mLayoutInflater;
    static class  ViewHolder {
        public ImageView imageView;
        TextView tvTile, tvTime, tvContent;
    }
    public MyListAdapter(Context context){
        super();
        this.mContext =context;
        //mLayoutInflater =LayoutInflater.from(context);
    }
    public void  setList(List<MyList> gridlist){
        this.gridlist=gridlist;
        mLayoutInflater =(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }




    @Override
    public int getCount() {
        return gridlist.size();
    }


    @Override
    public Object getItem(int position) {
        return gridlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder =null;
        if(convertView == null){
            convertView = mLayoutInflater.inflate(R.layout.layout_list_item,null);
            holder =new ViewHolder();
            holder.imageView =(ImageView)convertView.findViewById(R.id.iv);

            holder.tvTile=(TextView)convertView.findViewById(R.id.tv_title);
            holder.tvTime=(TextView)convertView.findViewById(R.id.tv_Time);
            holder.tvContent=(TextView)convertView.findViewById(R.id.tv_Content);
            convertView.setTag(holder);

        }
        else{
            holder =(ViewHolder)convertView.getTag();
        }
        MyList grid =gridlist.get(position);
        if(grid!=null){
            holder.tvTile.setText(grid.getObjname());
        }
        else{

        }
        //holder.tvTile.setText("黎明");
        //holder.tvTime.setText("2008-9-10");
        //holder.tvContent.setText("河南信阳");


        //Glide.with(mContext).load("").inti(holder.imageView);
        //holder.imageView.getBackground();
        return convertView;
    }
}
