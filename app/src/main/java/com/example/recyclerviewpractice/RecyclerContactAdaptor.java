package com.example.recyclerviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdaptor extends RecyclerView.Adapter< RecyclerContactAdaptor.ViewHolder> {



    Context context;
    ArrayList<ContactModel> arrContact;
    RecyclerContactAdaptor(Context context  , ArrayList<ContactModel> arrContact){
        this.context = context;
        this.arrContact = arrContact;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view = LayoutInflater.from(context).inflate(R.layout.contect_row , parent , false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.iwImgContect.setImageResource(arrContact.get(position).iwImgContect);
        holder.tvContactName.setText(arrContact.get(position).tvContactName);
        holder.tvContactDescription.setText(arrContact.get(position).tvContactDescription);
    }

    @Override
    public int getItemCount() {
        return arrContact.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView  tvContactDescription , tvContactName;
        ImageView iwImgContect;
        public ViewHolder(View itemView){
                super(itemView);
            tvContactDescription = itemView.findViewById(R.id.tvContactDescription);
            tvContactName = itemView.findViewById(R.id.tvContactName);
            iwImgContect = itemView.findViewById(R.id.iwImgContect);

        }
    }
}
