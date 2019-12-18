package com.wulianwang.lsp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListPopupWindow;
import android.widget.TextView;

import android.widget.Spinner;
import android.widget.ArrayAdapter;

import com.wulianwang.lsp.R;

/**
 * 王城 王光彪 5.7
 */
public class PersonPublishActivity extends AppCompatActivity {
    private ListPopupWindow listPopupWindow = null;
    private ImageView arrowImageView;
    private TextView chooseText;
    private LinearLayout linearLayout;
    private Button mBtnTextView;
    TextView txt1;
    Button btn1,btn2,btn3,btn4 ,BtnTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_publish);
        btn2=(Button)findViewById(R.id.buttonoo2);
        //btn3=(Button)findViewById(R.id.button003);
        btn4=(Button)findViewById(R.id.button04);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // activity页面跳转
          //      Intent intent= new Intent(PersonPublishActivity.this,Main3Activity.class);

          //      startActivity(intent);
            }
        });
        BtnTextView =findViewById(R.id.button01);
        BtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // activity页面跳转
            //    Intent intent= new Intent(PersonPublishActivity.this,Main3Activity.class);

           //     startActivity(intent);
            }
        });
        txt1=(TextView)findViewById(R            .id.text001);
        // txt2=(TextView)findViewById(R.id.text002);
        // btn1.setOnClickListener(new mClick());
        String[] ctype = new String[]{"全部", "游戏", "电影", "娱乐", "图书"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,ctype);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = super.findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
        btn2.setOnClickListener(new mClick());
        //   btn3.setOnClickListener(new mClick());
    }
    class mClick implements View.OnClickListener{
        int m_year=2019;
        int m_month=11;
        int m_day=2;
        //  int m_hour=2,m_minute=6;
        public void onClick(View v){


            if (v==btn2)
            {
                DatePickerDialog.OnDateSetListener dateListener=new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        m_year=year;
                        m_month=month;
                        m_day=dayOfMonth;
                        txt1.setText("您设置的日期为："+m_year+"年"+m_month+"月"+m_day+"日");
                    }
                };
                DatePickerDialog date=new DatePickerDialog(PersonPublishActivity.this,dateListener,m_year,m_month,m_day);
                date.setTitle("日期对话框");
                date.show();

            }
            else if(v==btn3){

            }

        }
    }

}








