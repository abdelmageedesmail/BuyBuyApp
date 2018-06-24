package com.example.ahmed.buybuyapp.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ahmed.buybuyapp.Adapters.MyOrdersAdapter;
import com.example.ahmed.buybuyapp.R;

public class MyOrdersActivity extends AppCompatActivity {

    RecyclerView myOrderLists;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_orders);
        myOrderLists=findViewById(R.id.myOrderLists);
        myOrderLists.setAdapter(new MyOrdersAdapter(this));
        myOrderLists.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        myOrderLists.setNestedScrollingEnabled(false);
    }
}
