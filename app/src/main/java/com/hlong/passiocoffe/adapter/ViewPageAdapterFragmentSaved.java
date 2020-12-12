package com.hlong.passiocoffe.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPageAdapterFragmentSaved extends FragmentStatePagerAdapter {


    public ViewPageAdapterFragmentSaved(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Fragmentbac();
            case 1:
                return new Fragmentvang();
            case 2:
                return new Fragmentbk();

            default:
                return new Fragmentbac();

        }


    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String tittle= "";
        switch (position) {
            case 0:
                tittle = "Silver";
                break;
            case 1:
                tittle = "Gold";
                break;
            case 2:
                tittle = "Platium";
                break;
        }
        return tittle;
    }
}
