package com.wulianwang.lsp.activity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.wulianwang.lsp.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 */
public class JdYwcFragment extends Fragment {

    List<Map<String, String>> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_jd_ywc, container, false);
        ListView listView = view.findViewById(R.id.listview);

        getData();

        NewAdapter adapter = new NewAdapter(getActivity(), R.layout.jd_ywc_item, list);
        listView.setAdapter(adapter);

        return view;
    }

    private void getData(){
        Map<String, String> map1 = new HashMap<>();
        map1.put("title", "title1");
        map1.put("value", "content");
        list.add(map1);
        Map<String, String> map2 = new HashMap<>();
        map2.put("title", "title1");
        map2.put("value", "content");
        list.add(map2);
    }

    class NewAdapter<T> extends ArrayAdapter{

        private Context context;
        private int resId;
        private List<T> list;

        public NewAdapter(@NonNull Context context, int resource, @NonNull List objects) {
            super(context, resource, objects);
            this.context = context;
            this.resId = resource;
            this.list = objects;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            Map<String, String> map = (Map<String, String>)getItem(position);
            View view;
            ViewHolder holder;
            if(convertView == null){
                view = getLayoutInflater().inflate(resId, null);
                holder = new ViewHolder();
                holder.layout = view.findViewById(R.id.item);
                holder.title = view.findViewById(R.id.title);
                holder.content = view.findViewById(R.id.content);
                view.setTag(holder);
            }else {
                view = convertView;
                holder = (ViewHolder) view.getTag();
            }

            holder.title.setText(map.get("title"));
            holder.content.setText(map.get("content"));

            holder.layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //点击后执行的事件
                    Intent intent = new Intent(getActivity(),MainActivity.class);
                    startActivity(intent);

                }
            });

            return view;
        }

        class ViewHolder{
            LinearLayout layout;
            TextView title;
            TextView content;
        }
    }

}