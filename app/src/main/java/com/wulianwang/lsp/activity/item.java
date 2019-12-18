package com.wulianwang.lsp.activity;


import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.wulianwang.lsp.R;

import java.util.List;


public class item extends AppCompatActivity {
    private ListView list_animal;
    private List<Itemview> Itemalls;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        getSupportActionBar().hide();







    }





}
