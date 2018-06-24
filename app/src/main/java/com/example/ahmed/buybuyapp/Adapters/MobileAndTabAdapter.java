package com.example.ahmed.buybuyapp.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.ahmed.buybuyapp.R;

/**
 * Created by abdelmageed on 4/4/18.
 */

public class MobileAndTabAdapter extends RecyclerView.Adapter<MobileAndTabAdapter.ViewHolder> {

    Context context;
    int shape;

    public MobileAndTabAdapter(Context context, int shape) {

        this.context = context;
        this.shape = shape;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.mobile_item, parent, false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        if (shape == 1) {
            holder.listShape.setVisibility(View.VISIBLE);
            holder.gridShape.setVisibility(View.GONE);
            holder.tabShape.setVisibility(View.GONE);
        }else if (shape == 2) {
            holder.listShape.setVisibility(View.GONE);
            holder.gridShape.setVisibility(View.VISIBLE);
            holder.tabShape.setVisibility(View.GONE);
        }

    }

    @Override
    public int getItemCount() {
        return 7;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout listShape, tabShape, gridShape;

        public ViewHolder(View itemView) {
            super(itemView);
            listShape = itemView.findViewById(R.id.listShape);
            tabShape = itemView.findViewById(R.id.tabShape);
            gridShape = itemView.findViewById(R.id.gridShape);
        }
    }


}
