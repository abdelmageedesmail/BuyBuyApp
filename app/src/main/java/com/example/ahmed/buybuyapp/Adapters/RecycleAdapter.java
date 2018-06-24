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
 * Created by ahmed on 6/17/2017.
 */

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {

    OnItemClickListener onItemClickListener;
    Context context;
    List<RecycleModel> notification;

    public RecycleAdapter(Context context, ArrayList<RecycleModel> notification) {
        this.context = context;
        this.notification = notification;
    }


    public interface OnItemClickListener {
        void onclick(int position);
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.mobil_tablet_item, parent, false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        RecycleModel modelRecycleClubs = notification.get(position);
        holder.im.setBackgroundResource(modelRecycleClubs.getImage());


//        holder.card.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (onItemClickListener != null) {
//                    onItemClickListener.onclick(position);
//                }
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return notification.size();
    }

    public void setOnClickListener(OnItemClickListener onClickListener) {
        this.onItemClickListener = onClickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView im;


        public ViewHolder(View itemView) {
            super(itemView);
            im = (ImageView) itemView.findViewById(R.id.imag);


        }
    }


}
