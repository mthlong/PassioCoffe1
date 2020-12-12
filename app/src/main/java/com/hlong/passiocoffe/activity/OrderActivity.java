package com.hlong.passiocoffe.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.hlong.passiocoffe.R;
import com.hlong.passiocoffe.adapter.ViewOrderAdapter;
import com.hlong.passiocoffe.fragment.FreshEasyFragment;
import com.hlong.passiocoffe.fragment.GreenxmasFragment;
import com.hlong.passiocoffe.fragment.IceBlendedFragment;
import com.hlong.passiocoffe.fragment.PassioCoffeeFragment;
import com.hlong.passiocoffe.fragment.TeadSodaFragment;


public class OrderActivity extends AppCompatActivity {
    private TabLayout tabLayout_107;
    private ViewPager viewPager_107;
    private ViewOrderAdapter orderAdapter_107;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        tabLayout_107 = findViewById(R.id.drink_tab_107);
        viewPager_107 = findViewById(R.id.viewPager_drink_item_107);

        orderAdapter_107 = new ViewOrderAdapter(getSupportFragmentManager());


        orderAdapter_107.AddFragment(new GreenxmasFragment(), "Green xmas");
        orderAdapter_107.AddFragment(new IceBlendedFragment(), "Ice blended");
        orderAdapter_107.AddFragment(new TeadSodaFragment(), "Tea/coffee");
        orderAdapter_107.AddFragment(new PassioCoffeeFragment(), "Passio coffee");
        orderAdapter_107.AddFragment(new FreshEasyFragment(), "Fresh & easy");

        viewPager_107.setAdapter(orderAdapter_107);
        tabLayout_107.setupWithViewPager(viewPager_107);
    }

    public void back_homepage(View view) {
        startActivity(new Intent(OrderActivity.this, HomeActivity.class));
        finish();
    }
}