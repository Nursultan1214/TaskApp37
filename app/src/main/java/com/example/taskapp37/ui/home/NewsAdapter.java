package com.example.taskapp37.ui.home;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taskapp37.databinding.ItemNewsBinding;
import com.example.taskapp37.models.News;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<ViewHolder> {

    private ArrayList<News> list;

    public  NewsAdapter(){
        list = new ArrayList <>();
    }
    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemNewsBinding.inflate(LayoutInflater.from(parent.getContext())));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {
   holder.bind(list.get(position));


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder( ItemNewsBinding ItemView) {
            super(ItemView.getRoot());
            ;
        }

        public void bind(News news) {
        }
    }

