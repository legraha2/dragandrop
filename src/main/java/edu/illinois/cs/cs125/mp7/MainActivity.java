package edu.illinois.cs.cs125.mp7;


import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //variables
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "New Recipe", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    private void initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://cdn.pixabay.com/photo/2017/09/14/16/28/apple-pie-2749548_1280.jpg");
        mNames.add("Delicious Pie");

        mImageUrls.add("https://connectnigeria.com/articles/wp-content/uploads/2018/03/pancakes-2801960_1280-1000x600.jpg");
        mNames.add("Pancakes");

        mImageUrls.add("https://www.bbcgoodfood.com/sites/default/files/styles/recipe/public/recipe/recipe-image/2017/03/hedgehog-bread-roll.jpg?itok=xmDj8xMR");
        mNames.add("Hedgehog Rolls");

        mImageUrls.add("http://www.americangarden.us/wp-content/uploads/2017/05/Recipe_Homemade-pizza_AG-1.jpg");
        mNames.add("Pizza");

        mImageUrls.add("https://www.lanascooking.com/wp-content/uploads/2010/10/pumpkinbread_final_450.jpg");
        mNames.add("Pumpkin Bread");

        mImageUrls.add("https://www.cookingclassy.com/wp-content/uploads/2016/01/mexican_vegetable_soup5..jpg");
        mNames.add("Veggie Soup");

        mImageUrls.add("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/sour-cream-chocolate-chip-scones-1520272016.jpg");
        mNames.add("Chocolate Chip Scones");

        initRecyclerView();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}

















