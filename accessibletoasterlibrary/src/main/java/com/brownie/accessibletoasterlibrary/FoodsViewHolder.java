package com.brownie.accessibletoasterlibrary;

import com.brownie.accessibletoasterlibrary.databinding.CardFoodBinding;
import com.brownie.accessibletoasterlibrary.models.Food;
import androidx.recyclerview.widget.RecyclerView;

 class FoodsViewHolder extends RecyclerView.ViewHolder {

    private final CardFoodBinding cardFoodBinding;

     public FoodsViewHolder(CardFoodBinding cardFoodBinding) {
         super(cardFoodBinding.getRoot());
         this.cardFoodBinding = cardFoodBinding;
     }

     void bind(Food food) {
         cardFoodBinding.setFoodItem(food);
         cardFoodBinding.executePendingBindings();
     }
 }
