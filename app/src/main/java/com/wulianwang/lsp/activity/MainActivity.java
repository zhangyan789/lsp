package com.wulianwang.lsp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.wulianwang.lsp.R;

public class MainActivity extends AppCompatActivity {

    private ImageView im1, im2, im3, im4;
    boolean isLogin = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //电力服务
        im1 = findViewById(R.id.imageView);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ElectricityServiceActivity.class);
                startActivity(intent);
            }
        });
        //任务广场
        im2 = findViewById(R.id.imageView3);
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //人员列表
        im3 = findViewById(R.id.imageView5);
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //我的、登录
        im4 = findViewById(R.id.imageView2);
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isLogin){

                }else{
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
