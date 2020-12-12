package com.hlong.passiocoffe.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hlong.passiocoffe.R;
import com.hlong.passiocoffe.activity.HomeActivity;
import com.hlong.passiocoffe.model.News;

import java.util.List;


public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
    Context context;
    List<News> news;

    public NewsAdapter(Context context, List<News> newsList) {
        this.context = context;
        this.news = newsList;
    }

    @NonNull
    @Override
    public NewsAdapter.NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.news_item, parent, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.NewsViewHolder holder, int position) {
        holder.img_banner_107.setImageResource(news.get(position).getImageUrl());
        holder.tv_title_107.setText(news.get(position).getTitle());
        holder.tv_des_107.setText(news.get(position).getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, HomeActivity.class);
                context.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {
        ImageView img_banner_107;
        TextView tv_title_107, tv_des_107;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            img_banner_107 = itemView.findViewById(R.id.img_banner_107);
            tv_title_107 = itemView.findViewById(R.id.tv_title_107);
            tv_des_107 = itemView.findViewById(R.id.tv_des_107);
        }
    }
}
