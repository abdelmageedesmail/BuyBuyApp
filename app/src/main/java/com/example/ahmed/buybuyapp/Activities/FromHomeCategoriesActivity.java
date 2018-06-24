package com.example.ahmed.buybuyapp.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.ahmed.buybuyapp.Adapters.MobileAndTabAdapter;
import com.example.ahmed.buybuyapp.R;
import com.example.ahmed.buybuyapp.Utilties.SimpleDividerItemDecoration;

public class FromHomeCategoriesActivity extends AppCompatActivity {

    RecyclerView MobileTabletsList;
    ImageView shape;
    View viewLine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_home_categories);
        MobileTabletsList=findViewById(R.id.MobileTabletsList);
        shape=findViewById(R.id.shape);
        viewLine=findViewById(R.id.viewLine);
        viewLine.setVisibility(View.VISIBLE);

        MobileTabletsList.setAdapter(new MobileAndTabAdapter(this,2));
        MobileTabletsList.setLayoutManager(new GridLayoutManager(this,2));
        MobileTabletsList.addItemDecoration(new SimpleDividerItemDecoration(FromHomeCategoriesActivity.this));
        shape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shape.setImageResource(0);
                shape.setImageResource(R.mipmap.group);
                MobileTabletsList.setAdapter(new MobileAndTabAdapter(FromHomeCategoriesActivity.this,1));
                MobileTabletsList.setLayoutManager(new LinearLayoutManager(FromHomeCategoriesActivity.this,LinearLayoutManager.VERTICAL,false));
                MobileTabletsList.addItemDecoration(new SimpleDividerItemDecoration(FromHomeCategoriesActivity.this));
                viewLine.setVisibility(View.GONE);
            }
        });
    }
}
