package com.wulianwang.lsp.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.wulianwang.lsp.R;

/**
 * 4.2 人员详情 王艺江 皂辉杰
 */
public class PersonDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_detail);
        TextView resume = (TextView)this.findViewById(R.id.resume);
        TextView work = (TextView)this.findViewById(R.id.work);
        TextView location = (TextView)this.findViewById(R.id.location);
        TextView description = (TextView)this.findViewById(R.id.description);
        TextView score = (TextView)this.findViewById(R.id.score);
        ImageView back = (ImageView)this.findViewById(R.id.back);
        ImageView phone = (ImageView)this.findViewById(R.id.phone);
        ImageView message = (ImageView)this.findViewById(R.id.message);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent();
                intent1.setAction(Intent.ACTION_DIAL);
                intent1.setData(Uri.parse("tel:18337600315"));
                startActivity(intent1);

            }
        });
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Intent.ACTION_SENDTO,Uri.parse("smsto: 18337600315"));
                startActivity(intent2);
            }
        });
        String str1 = "信阳彭于晏" +
                "              43岁     高中以上";
        resume.setText(str1);
        String str2 = "水电工、建筑工";
        work.setText(str2);
        String str3 = "信阳市平桥区、浉河区";
        location.setText(str3);
        String str4 = "综合得分:" +
                "      95";
        score.setText(str4);
        String str5 = "电子主要介绍的基本概念、基本定律及分析方法电路的暂态分析;单相正弦交流电路;" +
                "半导体基础;晶体管及;集成运算放大器及应用;数字逻辑电路基础;逻辑代数与逻辑函数\n";
        description.setText(str5);
    }
}

