package com.wulianwang.lsp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.wulianwang.lsp.R;

/**
 * 5.14.1 丁亚茹 聂艳艳
 */
public class HandlingDetailActivity extends AppCompatActivity {
    private ImageView button1,button2;
    private TextView rwxq,gzxq,zzmc,gzsj,gxnr,gzdd,lxfs,xxn,xq,jdrxx;
    private Button button;
    private EditText dd,wt,sj,wx,gh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handling_detail);
        button1=(ImageView)findViewById(R.id.button1);
        button2=(ImageView)findViewById(R.id.button2);
        rwxq=(TextView)findViewById(R.id.rwxq);
        gzxq=(TextView)findViewById(R.id.gzxq);
        zzmc=(TextView)findViewById(R.id.zzmc);
        gzsj=(TextView)findViewById(R.id.gzsj);
        gxnr=(TextView)findViewById(R.id.gxnr);
        gzdd=(TextView)findViewById(R.id.gzdd);
        lxfs=(TextView)findViewById(R.id.lxfs);
        xxn=(TextView)findViewById(R.id.xxn);
        xq=(TextView)findViewById(R.id.xq);
        jdrxx=(TextView)findViewById(R.id.jdrxx);
        button=(Button)findViewById(R.id.button);
        dd=(EditText)findViewById(R.id.dd);
        wt=(EditText)findViewById(R.id.wt);
        sj=(EditText)findViewById(R.id.sj);
        wx=(EditText)findViewById(R.id.wx);
        gh=(EditText)findViewById(R.id.gh);

    }
}

