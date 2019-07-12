package com.example.watersupply_kathmandu.AdapterPackage;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.watersupply_kathmandu.Models.OrderModel;
import com.example.watersupply_kathmandu.Models.UserModel;

import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderAdapterHolder> {

    private Context context;
    private List<OrderModel> orderModels;

    public OrderAdapter(Context context, List<OrderModel> orderModels) {
        this.context = context;
        this.orderModels = orderModels;
    }

    @NonNull
    @Override
    public OrderAdapterHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

      View view-LayoutInflater.from(viewGroup.getContext()).inflate();
      return new OrderAdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderAdapterHolder orderAdapterHolder, int i) {
    OrderModel orderModel=orderModels.get(i);
    }

    @Override
    public int getItemCount() {
        return orderModels.size();
    }

    public class OrderAdapterHolder extends RecyclerView.ViewHolder {

        public OrderAdapterHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
