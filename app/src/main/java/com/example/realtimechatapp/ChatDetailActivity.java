package com.example.realtimechatapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.realtimechatapp.databinding.ActivityChatDetailBinding;

public class ChatDetailActivity extends AppCompatActivity {

    ActivityChatDetailBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}