package com.hlong.passiocoffe.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.hlong.passiocoffe.R;
import com.hlong.passiocoffe.adapter.PaperAdapter;
import com.hlong.passiocoffe.fragment.ExpiredFragment;
import com.hlong.passiocoffe.fragment.HaventUseFragment;
import com.hlong.passiocoffe.fragment.UsedFragment;


public class GiftActivity extends AppCompatActivity {
    private TabLayout tabLayout_107;
    private ViewPager viewPager_107;
    private PaperAdapter paperAdapter;
    private ImageView img_back_home_107;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(Intent.ACTION_MAIN);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift);

        tabLayout_107 = findViewById(R.id.coupon_tab_107);
        viewPager_107 = findViewById(R.id.viewPager_107);
        paperAdapter = new PaperAdapter(getSupportFragmentManager());


        paperAdapter.AddFragment(new HaventUseFragment(), "Chưa từng sử dụng");
        paperAdapter.AddFragment(new UsedFragment(), "Đã sử dụng");
        paperAdapter.AddFragment(new ExpiredFragment(), "Đã hết hạn");
        tabLayout_107.setupWithViewPager(viewPager_107);
        viewPager_107.setAdapter(paperAdapter);
        img_back_home_107 =findViewById(R.id.img_back_107);


    }

    public void back_homepage(View view) {
        startActivity(new Intent(GiftActivity.this, HomeActivity.class));
    }
}