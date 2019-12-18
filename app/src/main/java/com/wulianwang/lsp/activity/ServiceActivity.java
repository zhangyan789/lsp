package com.wulianwang.lsp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * 任务 1.5
 * 服务政策
 * 段天尧  叶皓明
 */

public class ServiceActivity extends AppCompatActivity {
        private ImageButton btn;
        private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ServiceActivity.this,MainActivity.class);
                startActivity(intent);
         tv=findViewById(R.id.tv_3);
         tv.setMovementMethod(ScrollingMovementMethod.getInstance());

            }
        });
    }
}
