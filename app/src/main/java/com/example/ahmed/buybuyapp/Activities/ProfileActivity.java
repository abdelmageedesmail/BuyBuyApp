package com.example.ahmed.buybuyapp.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ahmed.buybuyapp.R;

public class ProfileActivity extends AppCompatActivity {

    TextView tvMyOrder,tvMyWishList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        tvMyOrder=findViewById(R.id.tvMyOrder);
        tvMyWishList=findViewById(R.id.tvMyWishList);

        tvMyOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfileActivity.this,MyOrdersActivity.class));
            }
        });


        tvMyWishList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfileActivity.this,MyWishList.class));
            }
        });

    }
}
