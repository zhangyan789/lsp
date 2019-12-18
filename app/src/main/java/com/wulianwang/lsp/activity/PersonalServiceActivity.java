package com.wulianwang.lsp.activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.wulianwang.lsp.R;
import com.wulianwang.lsp.bean.Itemview;

import java.util.ArrayList;
import java.util.List;

/**
 * 李鑫鑫 李永祥 3.2
 */
public class PersonalServiceActivity extends AppCompatActivity {
    private ListView list_animal;
    private List<Itemview> itemalls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_service);

        getSupportActionBar().hide();

        Itemview itemview = new Itemview("time", "name", "content");
        itemalls.add(itemview);

        list_animal = findViewById(R.id.listview);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, itemalls);
        //ItemAdapter adapter = new ItemAdapter(this, android.R.layout.simple_list_item_1, itemalls);

        list_animal.setAdapter(adapter);

        list_animal.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(PersonalServiceActivity.this, PersonalServiceDetailActivity.class);
                startActivity(intent);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }





}
