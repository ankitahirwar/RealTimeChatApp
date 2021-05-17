package com.example.realtimechatapp.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.realtimechatapp.Fragments.ChatsFragment;

public class FragmentsAdapter extends FragmentPagerAdapter {
    public FragmentsAdapter(@NonNull FragmentManager fm) {

        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            default : return new ChatsFragment();

        }
    }

    @Override
    public int getCount() {

        return 0;
    }

    @NonNull
    @Override
    public CharSequence getPageTitle(int position) {
        String title;
        title = null;
        if (position==0){
            title = "CHATS";
        }

        return title;
    }
}

