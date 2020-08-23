package com.brownie.accessibletoasterexample;

import android.view.ViewGroup;

import com.brownie.accessibletoasterlibrary.SampleClass;
import com.brownie.accessibletoasterlibrary.models.Item;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Item> allItems;

    public MainAdapter(List<Item> allItems) {
        this.allItems = allItems;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return SampleClass.getRelevantViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        SampleClass.inflateRelevantData(holder, position, allItems);
    }

    @Override
    public int getItemViewType(int position) {
        return allItems.get(position).getType();
    }

    @Override
    public int getItemCount() {
        return allItems.size();
    }
}
