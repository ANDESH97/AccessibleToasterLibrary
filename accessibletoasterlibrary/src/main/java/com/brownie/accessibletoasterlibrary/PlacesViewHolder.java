package com.brownie.accessibletoasterlibrary;

import com.brownie.accessibletoasterlibrary.databinding.CardPlacesBinding;
import com.brownie.accessibletoasterlibrary.models.Place;

import androidx.recyclerview.widget.RecyclerView;

class PlacesViewHolder extends RecyclerView.ViewHolder {

    private final CardPlacesBinding cardPlacesBinding;

    public PlacesViewHolder(CardPlacesBinding cardPlacesBinding) {
        super(cardPlacesBinding.getRoot());
        this.cardPlacesBinding = cardPlacesBinding;
    }

    void bind(Place place) {
        cardPlacesBinding.setPlaceItem(place);
        cardPlacesBinding.executePendingBindings();
    }
}
