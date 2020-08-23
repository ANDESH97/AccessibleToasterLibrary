package com.brownie.accessibletoasterlibrary;


import com.brownie.accessibletoasterlibrary.databinding.CardSongsBinding;
import com.brownie.accessibletoasterlibrary.models.Song;

import androidx.recyclerview.widget.RecyclerView;

 class SongsViewHolder extends RecyclerView.ViewHolder {


    private final CardSongsBinding cardSongsBinding;

     public SongsViewHolder(CardSongsBinding cardSongsBinding) {
         super(cardSongsBinding.getRoot());
         this.cardSongsBinding = cardSongsBinding;
     }

     void bind(Song song) {
         cardSongsBinding.setSongItem(song);
         cardSongsBinding.executePendingBindings();
     }
 }
