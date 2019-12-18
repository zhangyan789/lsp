package com.wulianwang.lsp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.wulianwang.lsp.R;

public class App extends AppCompatActivity {
    private TextView myTextView;
    private Button bt1,bt2;
    private EditText et1,et2,et3,et4,et5;

    boolean flag = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        myTextView = (TextView)this.findViewById(R.id.textView2);
        et1 = (EditText)this.findViewById(R.id.editText);
        bt1=(Button) this.findViewById(R.id.button2);
        bt2=(Button)this.findViewById(R.id.button);
        et2 = (EditText)findViewById(R.id.editText2);
        et3 = (EditText)findViewById(R.id.editText3);
        et4=(EditText)findViewById(R.id.editText4);
        et5=(EditText)findViewById(R.id.editText5);


        if(flag){
            bt1.setVisibility(View.VISIBLE);
        }else{
            bt1.setVisibility(View.GONE);

            bt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //点击事件
                    Intent i=new Intent(App.this,PPAP.class);
                    startActivity(i);

     bt2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent x=new Intent(App.this,PPP.class);
             startActivity(x);
         }
     });

                }
            });

        }
    }
        }

