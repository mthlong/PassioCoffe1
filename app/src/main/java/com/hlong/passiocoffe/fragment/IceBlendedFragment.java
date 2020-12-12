package com.hlong.passiocoffe.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hlong.passiocoffe.R;
import com.hlong.passiocoffe.adapter.RecyclerOrderAdapter;
import com.hlong.passiocoffe.model.Drink;

import java.util.ArrayList;
import java.util.List;


public class IceBlendedFragment extends Fragment {
    View v;
    private RecyclerView recyclerView;
    private List<Drink> drinkList;
    public IceBlendedFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        drinkList = new ArrayList<>();
        drinkList.add(new Drink("Passiopuchino", 36000L, R.drawable.ic_passiopuccino));
        drinkList.add(new Drink("Iced Chocolate", 44000L, R.drawable.ic_drink_lady_iced_tea));
        drinkList.add(new Drink("Matcha Green Tea", 39000L, R.drawable.ic_passiopuccino));
        drinkList.add(new Drink("Passio Choco", 42000L, R.drawable.ic_passio_choco));
        drinkList.add(new Drink("Passiopucchino With Caramel", 46000L, R.drawable.ic_passiopuccino));
        drinkList.add(new Drink("Cookie'n Cream", 36000L, R.drawable.ic_passio_choco));
        drinkList.add(new Drink("Matcha Green Tea", 39000L, R.drawable.ic_passiopuccino));
        drinkList.add(new Drink("Passio Choco", 42000L, R.drawable.ic_passio_choco));
        drinkList.add(new Drink("Passiopucchino With Caramel", 46000L, R.drawable.ic_passiopuccino));
        drinkList.add(new Drink("Matcha Green Tea", 39000L, R.drawable.ic_passiopuccino));
        drinkList.add(new Drink("Passio Choco", 42000L, R.drawable.ic_passio_choco));
        drinkList.add(new Drink("Passiopucchino With Caramel", 46000L, R.drawable.ic_passiopuccino));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_ice_blended, container, false);
        recyclerView = v.findViewById(R.id.iceblended_recyclerview);
        RecyclerOrderAdapter recyclerOrderAdapter = new RecyclerOrderAdapter(getContext(), drinkList);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(recyclerOrderAdapter);

        return v;
    }
}