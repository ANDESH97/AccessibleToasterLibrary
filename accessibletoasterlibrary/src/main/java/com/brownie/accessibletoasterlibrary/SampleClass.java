package com.brownie.accessibletoasterlibrary;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.brownie.accessibletoasterlibrary.databinding.CardAdBinding;
import com.brownie.accessibletoasterlibrary.databinding.CardFoodBinding;
import com.brownie.accessibletoasterlibrary.databinding.CardNewsBinding;
import com.brownie.accessibletoasterlibrary.databinding.CardPlacesBinding;
import com.brownie.accessibletoasterlibrary.databinding.CardSongsBinding;
import com.brownie.accessibletoasterlibrary.models.Ads;
import com.brownie.accessibletoasterlibrary.models.Food;
import com.brownie.accessibletoasterlibrary.models.Item;
import com.brownie.accessibletoasterlibrary.models.News;
import com.brownie.accessibletoasterlibrary.models.Place;
import com.brownie.accessibletoasterlibrary.models.Song;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class SampleClass {

    public static RecyclerView.ViewHolder getRelevantViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        switch(viewType) {
            case 0: {
                CardNewsBinding cardNewsBinding = CardNewsBinding.inflate(layoutInflater, parent, false);
                return new NewsViewHolder(cardNewsBinding);
            }
            case 1:  {
                CardAdBinding cardAdBinding = CardAdBinding.inflate(layoutInflater, parent, false);
                return new AdsViewHolder(cardAdBinding);
            }
            case 2: {
                CardFoodBinding cardFoodBinding = CardFoodBinding.inflate(layoutInflater, parent, false);
                return new FoodsViewHolder(cardFoodBinding);
            }
            case 3: {
                CardSongsBinding cardSongsBinding = CardSongsBinding.inflate(layoutInflater, parent, false);
                return new SongsViewHolder(cardSongsBinding);
            }
            case 4: {
                CardPlacesBinding cardPlacesBinding = CardPlacesBinding.inflate(layoutInflater, parent, false);
                return new PlacesViewHolder(cardPlacesBinding);
            }
        }

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_default, parent, false);
        return new DefaultViewHolder(view);
    }

    public static void inflateRelevantData(@NonNull RecyclerView.ViewHolder holder, int position, List<Item> allItems) {

        switch (allItems.get(position).getType()) {
            case 0: {
                News news = (News) allItems.get(position).getObject();

                ((NewsViewHolder) holder).bind(news);
            }
            break;
            case 1: {
                Ads ad = (Ads) allItems.get(position).getObject();
                ((AdsViewHolder) holder).bind(ad);
            }
            break;
            case 2: {
                Food food = (Food) allItems.get(position).getObject();
                ((FoodsViewHolder) holder).bind(food);
            }
            break;
            case 3: {
                Song song = (Song) allItems.get(position).getObject();
                ((SongsViewHolder) holder).bind(song);
            }
            break;
            case 4: {
                Place place = (Place) allItems.get(position).getObject();
                ((PlacesViewHolder) holder).bind(place);
            }
            break;
        }
    }
}
