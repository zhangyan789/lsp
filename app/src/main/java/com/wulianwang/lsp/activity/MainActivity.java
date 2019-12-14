package com.wulianwang.lsp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wulianwang.lsp.BannerActivity;
import com.wulianwang.lsp.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView(){
        Button b1 = findViewById(R.id.b1);
        b1.setOnClickListener(this);
        Button b2 = findViewById(R.id.b2);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.b1){
            Intent intent = new Intent(this, OkhttpActivity.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.b2){
            Intent intent = new Intent(this, BannerActivity.class);
            startActivity(intent);
        }
    }
}
