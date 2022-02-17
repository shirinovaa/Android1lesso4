package com.example.android1lesso4.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android1lesso4.R;
import com.example.android1lesso4.data.model.BooksModel;

import java.util.ArrayList;
import java.util.List;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.BooksHolder>{
       ArrayList<BooksModel> list = new ArrayList<>();

    @SuppressLint("NotifyDataSetChanged")
    public BooksAdapter(ArrayList<BooksModel> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
        @Override
        public BooksAdapter.BooksHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_holder,parent,false);
            return new BooksHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull BooksHolder holder, int position) {
            holder.onBind(list.get(position));
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public class BooksHolder extends RecyclerView.ViewHolder {
            TextView tvValue;
            public BooksHolder(@NonNull View itemView) {
                super(itemView);
                tvValue = itemView.findViewById(R.id.tv_value);
            }

            public void onBind( BooksModel booksModel) {
                tvValue.setText(booksModel.getBooksName());

            }
        }
    }
    