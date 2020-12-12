package com.hlong.passiocoffe.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hlong.passiocoffe.R;
import com.hlong.passiocoffe.activity.HomeActivity;
import com.hlong.passiocoffe.activity.Sale;

import java.util.List;



public class SaleAdapter extends RecyclerView.Adapter<SaleAdapter.SaleViewHolder> {
    Context context_107;
    List<Sale> saleList_107;

    public SaleAdapter(Context context, List<Sale> saleItem) {
        this.context_107 = context;
        this.saleList_107 = saleItem;
    }

    @NonNull
    @Override
    public SaleAdapter.SaleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context_107).inflate(R.layout.sale_item, parent, false);
        return new SaleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SaleAdapter.SaleViewHolder holder, int position) {
        holder.saleImage_107.setImageResource(saleList_107.get(position).getImg());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context_107, HomeActivity.class);
                context_107.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return saleList_107.size();
    }

    public class SaleViewHolder extends RecyclerView.ViewHolder {
        ImageView saleImage_107;
        public SaleViewHolder(@NonNull View itemView) {
            super(itemView);
            saleImage_107 = itemView.findViewById(R.id.sale_image_107);
        }
    }
}
