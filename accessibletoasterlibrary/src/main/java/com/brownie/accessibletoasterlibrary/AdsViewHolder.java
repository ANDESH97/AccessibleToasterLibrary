package com.brownie.accessibletoasterlibrary;


import com.brownie.accessibletoasterlibrary.databinding.CardAdBinding;
import com.brownie.accessibletoasterlibrary.models.Ads;

import androidx.recyclerview.widget.RecyclerView;

class AdsViewHolder extends RecyclerView.ViewHolder {

    private final CardAdBinding cardAdBinding;

    public AdsViewHolder(CardAdBinding cardAdBinding) {
        super(cardAdBinding.getRoot());
        this.cardAdBinding = cardAdBinding;
    }

    void bind(Ads ad) {
        cardAdBinding.setAdItem(ad);
        cardAdBinding.executePendingBindings();

    }
}
