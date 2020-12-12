package com.hlong.passiocoffe.model;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.hlong.passiocoffe.R;
import com.hlong.passiocoffe.activity.GiftActivity;
import com.hlong.passiocoffe.adapter.ViewPageAdapterFragmentSaved;

public class CardDetail extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mviewPager;
    private TextView mTv;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carddetail);

        mTabLayout = findViewById(R.id.tab_layout_saved);
        mviewPager = findViewById(R.id.view_pager_saved);

        mTv = findViewById(R.id.tv_xemcoupon);
        mTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }

            private void openActivity() {
                Intent intent = new Intent(CardDetail.this, GiftActivity.class);
                startActivity(intent);
            }
        });
        ViewPageAdapterFragmentSaved viewPageAdapterFragmentSaved= new ViewPageAdapterFragmentSaved(
                getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mviewPager.setAdapter(viewPageAdapterFragmentSaved);

        mTabLayout.setupWithViewPager(mviewPager);



    }

}
