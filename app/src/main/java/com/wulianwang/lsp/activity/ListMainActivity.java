package com.wulianwang.lsp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.wulianwang.lsp.R;

public class ListMainActivity extends AppCompatActivity {
    private ListView mLv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLv1 =(ListView)findViewById(R.id.list1);
        mLv1.setAdapter(new MyListAdapter(ListMainActivity.this));
    }
}
