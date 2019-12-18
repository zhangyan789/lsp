package com.wulianwang.lsp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.wulianwang.lsp.R;
import com.wulianwang.lsp.adapter.MyListAdapter;

/**
 * 刘长恩 曹彬 3.5
 */
public class CompanyServiceActivity extends AppCompatActivity {
    private ListView mLv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_service);
        mLv1 =(ListView)findViewById(R.id.list1);
        mLv1.setAdapter(new MyListAdapter(CompanyServiceActivity.this));
    }
}
