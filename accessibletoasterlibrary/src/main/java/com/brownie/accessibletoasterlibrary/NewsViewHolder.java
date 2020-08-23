package com.brownie.accessibletoasterlibrary;

import com.brownie.accessibletoasterlibrary.databinding.CardNewsBinding;
import com.brownie.accessibletoasterlibrary.models.News;

import androidx.recyclerview.widget.RecyclerView;

 class NewsViewHolder extends RecyclerView.ViewHolder {

     private final CardNewsBinding cardNewsBinding;

     public NewsViewHolder(CardNewsBinding cardNewsBinding) {
         super(cardNewsBinding.getRoot());
         this.cardNewsBinding = cardNewsBinding;
     }

     void bind(News news) {
         cardNewsBinding.setNewsItem(news);
         cardNewsBinding.executePendingBindings();
     }
 }
