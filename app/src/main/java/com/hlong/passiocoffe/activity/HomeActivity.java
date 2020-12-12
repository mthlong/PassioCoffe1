package com.hlong.passiocoffe.activity;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.hlong.passiocoffe.R;
import com.hlong.passiocoffe.adapter.NewsAdapter;
import com.hlong.passiocoffe.adapter.SaleAdapter;
import com.hlong.passiocoffe.model.CardDetail;
import com.hlong.passiocoffe.model.News;

import java.util.ArrayList;
import java.util.List;


public class HomeActivity extends AppCompatActivity {
    RecyclerView saleCycle, newsCycle;
    SaleAdapter saleAdapter;
    NewsAdapter newsAdapter;
    ImageView img_noti_107, img_gift_107, img_getlocation_107,img_card_107;
    FloatingActionButton order;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        img_getlocation_107 = findViewById(R.id.img_location_107);
        img_gift_107 = findViewById(R.id.img_gift_107);
        img_noti_107 = findViewById(R.id.img_notif_107);
        img_card_107 = findViewById(R.id.img_card_107);

        img_card_107.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, CardDetail.class));
            }
        });
        order = findViewById(R.id.flt_order_107);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, OrderActivity.class));
            }
        });

        img_getlocation_107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, GoogleMap1.class));
            }
        });
        img_noti_107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, NotificationActivity.class));
            }
        });
        img_gift_107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, GiftActivity.class));
            }
        });
        hotsaleAdd();
        newsAdd();

    }

    private void hotsaleAdd() {
        List<Sale> saleItems = new ArrayList<>();
        saleItems.add(new Sale(R.drawable.img_sale));

        setSaleRecycler(saleItems);
    }

    private void setSaleRecycler(List<Sale> saleItems) {
        saleCycle = findViewById(R.id.hot_sale_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        saleCycle.setNestedScrollingEnabled(false);
        saleCycle.setLayoutManager(layoutManager);
        saleAdapter = new SaleAdapter(this, saleItems);
        saleCycle.setAdapter(saleAdapter);
    }

    private void newsAdd() {
        List<News> newsList = new ArrayList<>();
        newsList.add(new News("Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành", "Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành, mùa giáng sinh lại đến, dánh giấu sự ....", R.drawable.img_sale));
        newsList.add(new News("Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành", "Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành, mùa giáng sinh lại đến, dánh giấu sự ....", R.drawable.ic_news1));
        newsList.add(new News("Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành", "Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành, mùa giáng sinh lại đến, dánh giấu sự ....", R.drawable.ic_news2));
        newsList.add(new News("Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành", "Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành, mùa giáng sinh lại đến, dánh giấu sự ....", R.drawable.ic_news3));
        newsList.add(new News("Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành", "Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành, mùa giáng sinh lại đến, dánh giấu sự ....", R.drawable.ic_news4));
        newsList.add(new News("Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành", "Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành, mùa giáng sinh lại đến, dánh giấu sự ....", R.drawable.ic_news5));
        newsList.add(new News("Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành", "Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành, mùa giáng sinh lại đến, dánh giấu sự ....", R.drawable.ic_news6));
        newsList.add(new News("Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành", "Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành, mùa giáng sinh lại đến, dánh giấu sự ....", R.drawable.ic_news7));
        newsList.add(new News("Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành", "Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành, mùa giáng sinh lại đến, dánh giấu sự ....", R.drawable.img_sale));
        newsList.add(new News("Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành", "Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành, mùa giáng sinh lại đến, dánh giấu sự ....", R.drawable.ic_news1));
        newsList.add(new News("Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành", "Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành, mùa giáng sinh lại đến, dánh giấu sự ....", R.drawable.ic_news2));
        newsList.add(new News("Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành", "Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành, mùa giáng sinh lại đến, dánh giấu sự ....", R.drawable.ic_news3));
        newsList.add(new News("Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành", "Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành, mùa giáng sinh lại đến, dánh giấu sự ....", R.drawable.ic_news4));
        newsList.add(new News("Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành", "Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành, mùa giáng sinh lại đến, dánh giấu sự ....", R.drawable.ic_news5));
        newsList.add(new News("Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành", "Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành, mùa giáng sinh lại đến, dánh giấu sự ....", R.drawable.ic_news6));
        newsList.add(new News("Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành", "Green XMAS - Giáng Sinh Xanh, Giáng sinh an lành, mùa giáng sinh lại đến, dánh giấu sự ....", R.drawable.ic_news7));

        setNewsRecycler(newsList);
    }

    private void setNewsRecycler(List<News> newsList) {
        newsCycle = findViewById(R.id.news_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        saleCycle.setNestedScrollingEnabled(false);
        newsCycle.setLayoutManager(layoutManager);
        newsAdapter = new NewsAdapter(this, newsList);
        newsCycle.setAdapter(newsAdapter);
    }

    public void open_profile(View view) {
        startActivity(new Intent(HomeActivity.this, ProfileActivity.class));
    }
}