package com.wulianwang.lsp.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.wulianwang.lsp.R;

/**
 * 张栋凯 曹小康 1-3
 */
public class ForgetPasswordActivity extends AppCompatActivity {

    private ImageButton mybtn1;private Button mybtn2;
    private  EditText editText1;private  EditText editText2;
    String password;String password2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        editText1 = (EditText) findViewById(R.id.et_password);
        editText2 = (EditText) findViewById(R.id.et_password2);
        mybtn1 = (ImageButton) findViewById(R.id.bt1);
        mybtn2 = (Button) findViewById(R.id.bt2);
        mybtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                password=editText1.getText().toString().trim();
                password2=editText2.getText().toString().trim();

               if(password.equals("")||password2.equals("")){
                   Toast.makeText(getApplicationContext(),"密码不能为空",Toast.LENGTH_SHORT).show();
               }else if (password.equals(password2)){
                   Toast.makeText(getApplicationContext(),"修改成功",Toast.LENGTH_SHORT).show();

               }else if (password.equals("")  != password2.equals("")){
                   Toast.makeText(getApplicationContext(),"密码不一致，请重新输入",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}



