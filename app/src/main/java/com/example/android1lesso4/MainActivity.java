package com.example.android1lesso4;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android1lesso4.adapter.BooksAdapter;
import com.example.android1lesso4.data.BooksClient;
import com.example.android1lesso4.data.model.BooksModel;
import com.example.android1lesso4.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    ArrayList<BooksModel> list = new ArrayList<>();
    private BooksAdapter booksAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initi();
    }

    private void initi() {
      list = BooksClient.getBooks();
      booksAdapter = new BooksAdapter(list);
        binding.recyclerView.setAdapter(booksAdapter);
    }
}