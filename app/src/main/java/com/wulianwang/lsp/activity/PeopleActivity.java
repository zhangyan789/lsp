package com.wulianwang.lsp.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;
import com.wulianwang.lsp.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PeopleActivity extends AppCompatActivity {
    String[] StringArray=new String[]{"岗位","昵称"};
    String[] data=new String[]{"张三","李四","王五"};
    Spinner sp;
    SmartRefreshLayout refreshLayout;
    RecyclerView recyclerView;

    private List<Map<String, String>> initDta;
    private List<Map<String, String>> list;
    private LinearLayoutManager linearLayoutManager;
    MyListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);
        sp = (Spinner)findViewById(R.id.spinner);
        //sp.setOnItemClickListener(this);
        //ArrayAdapter<String> ada=new ArrayAdapter<String>(this,R.layout,StringArray);
        //ArrayAdapter<String> aa = new ArrayAdapter<String>(this,android.R.layout)
        ArrayAdapter<String> ada=new ArrayAdapter<String>(PeopleActivity.this,android.R.layout.simple_list_item_1,StringArray);
        sp.setAdapter(ada);

        initData();
        refreshLayout = (SmartRefreshLayout)findViewById(R.id.refreshLayout);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        refreshLayout.setOnRefreshLoadMoreListener(new OnRefreshLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                list.addAll(initDta);
                adapter.notifyDataSetChanged();
                refreshLayout.finishLoadMore(true);
            }

            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                list = initDta;
                adapter.notifyDataSetChanged();
                refreshLayout.finishRefresh(true);
            }
        });

        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        list = initDta;
        adapter = new MyListAdapter(list, R.layout.people_item);
        recyclerView.setAdapter(adapter);

    }


    private void initData(){
        initDta = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Map<String, String> map = new HashMap<>();
            map.put("title", "title" + i);
            map.put("data", "data" + i);
            map.put("data2", "data2" + i);
            initDta.add(map);
        }
    }

    static class MyListAdapter<T> extends RecyclerView.Adapter {

        List<T> list;
        int resId;

        MyListAdapter(List<T> list, int resId){
            this.list = list;
            this.resId = resId;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new RecyclerView.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(resId, parent, false)){
            };
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            Map<String, String> map = (Map<String, String>)list.get(position);
            TextView textView1 = (TextView) holder.itemView.findViewById(R.id.textView);
            TextView textView2 = (TextView) holder.itemView.findViewById(R.id.textView2);
            TextView textView4 = (TextView) holder.itemView.findViewById(R.id.textView4);
            textView1.setText(map.get("title"));
            textView2.setText(map.get("data"));
            textView4.setText(map.get("data2"));
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        void refresh(List<T> list) {
            this.list.clear();
            this.loadMore(list);
        }

        void loadMore(List<T> list) {
            this.list.addAll(list);
            this.notifyDataSetChanged();
        }
    }
}
