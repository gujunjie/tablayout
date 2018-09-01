package com.example.abc.myapplication10;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.tablayout)
    TabLayout tablayout;
    @BindView(R.id.viewpager)
    ViewPager viewpager;


    List<Fragment> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

         list=new ArrayList<>();

         list.add(new FirstFragment());
         list.add(new SecondFragment());
         list.add(new ThirdFragment());
        list.add(new FirstFragment());
        list.add(new SecondFragment());
        list.add(new ThirdFragment());
        list.add(new FirstFragment());
        list.add(new SecondFragment());
        list.add(new ThirdFragment());

         MyFragmentPageAdapter adapter=new MyFragmentPageAdapter(getSupportFragmentManager(),list);
         viewpager.setAdapter(adapter);


         tablayout.setupWithViewPager(viewpager);

    }


}
