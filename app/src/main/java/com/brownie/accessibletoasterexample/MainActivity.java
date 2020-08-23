package com.brownie.accessibletoasterexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.brownie.accessibletoasterlibrary.models.Ads;
import com.brownie.accessibletoasterlibrary.models.Food;
import com.brownie.accessibletoasterlibrary.models.Item;
import com.brownie.accessibletoasterlibrary.models.News;
import com.brownie.accessibletoasterlibrary.models.Place;
import com.brownie.accessibletoasterlibrary.models.Song;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    SampleLayoutBinding sampleLayoutBinding;

    RecyclerView mRecyclerView;

    MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


//        sampleLayoutBinding = SampleLayoutBinding.inflate(getLayoutInflater());
//
//        View view = sampleLayoutBinding.getRoot();
//
//        setContentView(view);
//
//        sampleLayoutBinding.name.setText("Ankit");
//        sampleLayoutBinding.button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ToasterMessage.s(MainActivity.this, "Hello Ankit");
//            }
//        });

        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.samplerv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setHasFixedSize(true);

        List<Item> items = new ArrayList<>();

        News news = new News("This is a news", "World is going to end soon.");
        items.add(new Item(0, news));

        Ads ad = new Ads("This is a Ad", R.drawable.advertisement);
        items.add(new Item(1, ad));

        Food food = new Food("This is a food", "this is very tasty", R.drawable.chole_bhature);
        items.add(new Item(2, food));

        Song song = new Song("This is a Song", "Album Title", 1000, 123456, R.drawable.tb_ganesha);
        items.add(new Item(3, song));

        Place place = new Place("This is a place","This is a very nice place.", R.drawable.the_taj_mahal_agra);
        items.add(new Item(4, place));

        mainAdapter = new MainAdapter(items);
        mRecyclerView.setAdapter(mainAdapter);

    }
}