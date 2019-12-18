package com.wulianwang.lsp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.wulianwang.lsp.R;

/**
 * 陈关奇、侯璐鑫 1.4
 */
public class RegisterActivity extends AppCompatActivity {
    private Button bt1, bt2, bt3, bt4;
    private Button btn = null;

    private CheckBox checkBox = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



        bt1 = (Button) findViewById(R.id.button1);//id后面为上方button的id

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                finish();
            }
        });



        bt2 = (Button) findViewById(R.id.button);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                finish();
            }
        });

        bt3 = (Button) findViewById(R.id.button4);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RegisterActivity.this, PravcyActivity.class);//this前面为当前activty名称，class前面为要跳转到得activity名称
                startActivity(intent);
            }
        });
        bt4 = (Button) findViewById(R.id.button9);//id后面为上方button的id
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RegisterActivity.this, ServiceActivity.class);//this前面为当前activty名称，class前面为要跳转到得activity名称
                startActivity(intent);
            }
        });


        this.checkBox = (CheckBox) super.findViewById(R.id.checkBox);


// 设置CheckBox默认不选中

        this.checkBox.setFocusable(false);

        this.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {



            @Override

            public void onCheckedChanged(CompoundButton buttonView,

                                         boolean isChecked) {

                if (isChecked == true) {

                    btn.setClickable(true);

                } else {

                    btn.setClickable(false);

                }

            }

        });
        EditText et = (EditText) findViewById(R.id.editText2);
        et.setInputType(InputType.TYPE_CLASS_PHONE);
        EditText etc = (EditText) findViewById(R.id.editText5);
        etc.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
        EditText etcc = (EditText) findViewById(R.id.editText5);
        etcc.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);



        bt2.setOnClickListener(new View.OnClickListener() {	//给注册按钮设置监听


            EditText editText=(EditText)findViewById(R.id.editText3);
            EditText editTextt=(EditText)findViewById(R.id.editText4);

            public void onClick(View v) {
                String password=editText.getText().toString();//第一次输入的密码赋值给password
                String password2=editTextt.getText().toString();//第二次输入的密码赋值给password2

                if (password.equals("")||password2.equals("")){	//判断两次密码是否为空
                    Toast.makeText(getApplicationContext(),"密码不能为空",Toast.LENGTH_SHORT).show();
                }else if(password.equals(password2)){
                    Toast.makeText(getApplication(),"注册成功",Toast.LENGTH_SHORT).show();

                    //Intent intent=new Intent(getApplicationContext(),Main6Activity.class);
                    //intent.putExtra(    );//可以填入用户信息，如ID等
                    //startActivity(intent);
                    finish();


                }else if (password.equals("") != password2.equals("")){
                    Toast.makeText(getApplication(),"密码不一致，请重新输入",Toast.LENGTH_SHORT).show();
                }

            }
        });







    }
}








