package com.wulianwang.lsp.activity;


import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.wulianwang.lsp.R;
import com.wulianwang.lsp.bean.Itemview;

import java.util.List;

/**
 * 李鑫鑫 李永祥 3.2
 */
public class PersonalServiceActivity extends AppCompatActivity {
    private ListView list_animal;
    private List<Itemview> Itemalls;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_service);

        getSupportActionBar().hide();







    }





}
