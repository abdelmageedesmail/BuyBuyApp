package com.example.ahmed.buybuyapp.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ahmed.buybuyapp.Models.RecycleModel;
import com.example.ahmed.buybuyapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abdelmageed on 4/4/18.
 */

public class TobDealsAdapter extends RecyclerView.Adapter<TobDealsAdapter.ViewHolder> {

    Context context;

    public TobDealsAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.top_deals_item, parent, false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

    }

    @Override
    public int getItemCount() {
        return 7;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView im;


        public ViewHolder(View itemView) {
            super(itemView);
            im = (ImageView) itemView.findViewById(R.id.imag);


        }
    }


}
