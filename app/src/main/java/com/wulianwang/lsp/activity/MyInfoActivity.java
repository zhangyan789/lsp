package com.wulianwang.lsp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.wulianwang.lsp.R;

/**
 * 孙帅达，张世浩 5.1
 */
public class MyInfoActivity extends AppCompatActivity {

    LinearLayout l1, l2, l3, l4, l5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_info);
        l1 = findViewById(R.id.nameAuth);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        l2 = findViewById(R.id.nameAuth);
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        l3 = findViewById(R.id.nameAuth);
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        l4 = findViewById(R.id.nameAuth);
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        l5 = findViewById(R.id.nameAuth);
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
