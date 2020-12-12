package com.hlong.passiocoffe.adapter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.hlong.passiocoffe.R;

public class Fragmentbac extends Fragment {
    View myFragment;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myFragment = inflater.inflate(R.layout.activity_carddetail3, container, false);
        return myFragment;
    }
}
