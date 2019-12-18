package com.wulianwang.lsp.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

import com.wulianwang.lsp.R;

import java.util.LinkedList;
import java.util.List;

/**
 * 李珍珍 康子露 5.12.2
 */
public class HandlingPublishFragment extends Fragment {
    private  Context mcontext ;
    private ListView list;
    private List<Data> data;
    Adapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_handling_publish, container, false);
        return view;


    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mcontext=getActivity();
        list = (ListView)view.findViewById(R.id.listview);
        data=new LinkedList<Data>();

        data.add(new Data("更换灯泡","信阳市平桥区伍号公馆\\n12#140更换灯泡","处理中"));
        data.add(new Data("更换灯泡","信阳市平桥区陆号公馆\\n12#319更换灯泡","处理中"));
        data.add(new Data("更换灯泡","信阳市平桥区伍号公馆\\n12#140更换灯泡","处理中"));
        data.add(new Data("更换灯泡","信阳市平桥区陆号公馆\\n12#319更换灯泡","处理中"));
        data.add(new Data("更换灯泡","信阳市平桥区伍号公馆\\n12#140更换灯泡","处理中"));
        data.add(new Data("更换灯泡","信阳市平桥区陆号公馆\\n12#319更换灯泡","处理中"));
        data.add(new Data("更换灯泡","信阳市平桥区伍号公馆\\n12#140更换灯泡","处理中"));
        data.add(new Data("更换灯泡","信阳市平桥区陆号公馆\\n12#319更换灯泡","处理中"));
        data.add(new Data("更换灯泡","信阳市平桥区伍号公馆\\n12#140更换灯泡","处理中"));
        data.add(new Data("更换灯泡","信阳市平桥区陆号公馆\\n12#319更换灯泡","处理中"));
        data.add(new Data("更换灯泡","信阳市平桥区伍号公馆\\n12#140更换灯泡","处理中"));
        data.add(new Data("更换灯泡","信阳市平桥区陆号公馆\\n12#319更换灯泡","处理中"));
        data.add(new Data("更换灯泡","信阳市平桥区伍号公馆\\n12#140更换灯泡","处理中"));
        data.add(new Data("更换灯泡","信阳市平桥区陆号公馆\\n12#319更换灯泡","处理中"));
        data.add(new Data("更换灯泡","信阳市平桥区伍号公馆\\n12#140更换灯泡","处理中"));
        data.add(new Data("更换灯泡","信阳市平桥区陆号公馆\\n12#319更换灯泡","处理中"));


   //     adapter=new Adapter((LinkedList<Data>) data,getActivity());



   //     list.setAdapter(adapter);

    }




    class Data {

        private  String question;
        private  String address;
        private  String doing;

        public Data(String question,String address,String doing){
            this.question=question;
            this.address=address;
            this.doing=doing;
        }

        public String getQuestion(){
            return question;
        }
        public String getAddress(){
            return address;
        }
        public String getDoing(){
            return doing;
        }

    }
}
