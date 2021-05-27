package com.example.realtimechatapp.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.realtimechatapp.Fragments.ChatsFragment;
import com.example.realtimechatapp.Fragments.FeedbackFragment;
import com.example.realtimechatapp.Fragments.DeveloperFragment;

public class FragmentsAdapter extends FragmentPagerAdapter {
    public FragmentsAdapter(@NonNull FragmentManager fm) {

        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0: return new ChatsFragment();
            case 1: return new DeveloperFragment();
            case 2: return new FeedbackFragment();

            default:return new ChatsFragment();

        }
    }

    @Override
    public int getCount() {

        return 3;
    }

    @NonNull
    @Override
    public CharSequence getPageTitle(int position) {
        String title;
        title = null;
        if (position==0){
            title = "CHATS";
        }

        if (position==1){
            title = "Developer";
        }

        if (position==2){
            title = "Feedback";
        }

        return title;
    }
}

