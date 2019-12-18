

package com.wulianwang.lsp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListPopupWindow;
import android.widget.TextView;

import android.widget.Spinner;
import android.widget.ArrayAdapter;

import com.wulianwang.lsp.R;

public class Test extends AppCompatActivity {
    private ListPopupWindow listPopupWindow = null;
    private EditText myEditText;
    private Spinner mySpinner;
    private ImageView arrowImageView;
    private TextView chooseText;
    private LinearLayout linearLayout;
    private ImageView mBT;
    private Button mBtnTextView;
    private TextView mTv;
    private Button mBt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        String[] ctype = new String[]{"项目1", "项目2", "项目3", "项目4"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,ctype);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = super.findViewById(R.id.spinner);
        spinner.setAdapter(adapter);


        mBT=findViewById(R.id.imageView);
        mBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Test.this,Test2.class);
                startActivity(intent);
            }
        });

        mBt2=findViewById(R.id.button2);
        mBt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Test.this,Test2.class);
                startActivity(intent);
            }
        });


        mBtnTextView =findViewById(R.id.button);
         mTv=(TextView) findViewById(R.id.textView);
         mBtnTextView.setOnClickListener(new View.OnClickListener() {
          @Override
         public void onClick(View v) {
            Intent intent= new Intent(Test.this,Test2.class);
          startActivity(intent);
         }
         });
    }
}

