package com.hlong.passiocoffe.adapter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.hlong.passiocoffe.R;

public class Fragmentvang extends Fragment {
    private View myFragment;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myFragment = inflater.inflate(R.layout.activity_carddetail2, container, false);
        return myFragment;
    }
}
