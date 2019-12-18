package com.wulianwang.lsp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.wulianwang.lsp.R;

public class EvenActivity extends AppCompatActivity {
    private ImageButton button1;
    private Button button2;
    private TextView xq,mc,sj,nr,dd,pj;
    private EditText edit1,edit2,edit3,edit4,edit5,edit6;
    private ImageView ha;
    private RatingBar xx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_even);
        button1 =(ImageButton)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        xq=(TextView)findViewById(R.id.xq);
        mc=(TextView)findViewById(R.id.mc);
        sj=(TextView)findViewById(R.id.sj);
        nr=(TextView)findViewById(R.id.nr);
        dd=(TextView)findViewById(R.id.dd);
        pj=(TextView)findViewById(R.id.pj);
        edit1=(EditText)findViewById(R.id.edit1);
        edit2=(EditText)findViewById(R.id.edit2);
        edit3=(EditText)findViewById(R.id.edit3);
        edit4=(EditText)findViewById(R.id.edit4);
        edit5=(EditText)findViewById(R.id.edit5);
        edit6=(EditText)findViewById(R.id.edit6);
        ha=(ImageView)findViewById(R.id.ha);
        xx=(RatingBar)findViewById(R.id.xx);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
