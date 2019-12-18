package com.wulianwang.lsp.activity;


        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.GridLayout;
        import android.widget.ListView;
        import android.widget.Toast;

        import com.wulianwang.lsp.R;
        import com.wulianwang.lsp.adapter.MyList;
        import com.wulianwang.lsp.adapter.MyListAdapter;

        import java.util.ArrayList;
        import java.util.List;

/**
 *     成员：刘长恩 曹彬
 *     3.5 企业服务
 *     下拉框，不显示时间，所有企业未接工单，分页显示
 */

public class CompanyServiceActivity extends AppCompatActivity {
    private ListView mLv1;
    private List<MyList> mylist;
    private MyListAdapter gridadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_service);
        mLv1 =(ListView)findViewById(R.id.list1);
        try {
            mylist =new ArrayList<MyList>();
            gridadapter=new MyListAdapter(this);
            mylist.add(new MyList("黎明"));
            mylist.add(new MyList("刘德华"));
            mylist.add(new MyList("王二小"));
            mylist.add(new MyList("胡歌"));
            gridadapter.setList(mylist);
            mLv1.setAdapter(gridadapter);
        } catch (Exception e) {
            Toast.makeText(this,e.toString(),Toast.LENGTH_LONG).show();
        }
        finally {

        }

        mLv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
           //     Toast.makeText(ListMainActivity.this, "pos"+position, Toast.LENGTH_SHORT).show();
          //      Intent intent=new Intent();
          //      intent.putExtra("stringname","这是第一个页面的内容");
          //      intent.setClass(ListMainActivity.this,NextActivity.class);
          //      ListMainActivity.this.startActivity(intent);
            }
        });
    }
}
