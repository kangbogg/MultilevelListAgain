package com.example.day0927;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.day0927.adapter.MyAdapter;
import com.example.day0927.bean.MyChildBean;
import com.example.day0927.bean.MyGroupBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<MyGroupBean> groupBeans;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    //初始化数据
    private void initData() {
        ArrayList<MyChildBean> song_list1 = new ArrayList<>();
        song_list1.add(new MyChildBean("风继续吹"));
        song_list1.add(new MyChildBean("春夏秋冬"));
        song_list1.add(new MyChildBean("洁身自好"));
        groupBeans.add(new MyGroupBean(song_list1, "张国荣"));


        ArrayList<MyChildBean> song_list2 = new ArrayList<>();
        song_list2.add(new MyChildBean("遥远的她"));
        song_list2.add(new MyChildBean("饿狼传说"));
        song_list2.add(new MyChildBean("还是觉得你最好"));
        groupBeans.add(new MyGroupBean(song_list2, "张学友"));

    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        groupBeans = new ArrayList<>();
        adapter = new MyAdapter(groupBeans);
        recyclerView.setAdapter(adapter);
    }
}
