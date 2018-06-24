package com.example.ahmed.buybuyapp.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ahmed.buybuyapp.Adapters.WishListAdapter;
import com.example.ahmed.buybuyapp.R;

public class MyWishList extends AppCompatActivity {

    RecyclerView wishLists;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_wish_list);
        wishLists=findViewById(R.id.wishLists);
        wishLists.setAdapter(new WishListAdapter(this));
        wishLists.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
}
