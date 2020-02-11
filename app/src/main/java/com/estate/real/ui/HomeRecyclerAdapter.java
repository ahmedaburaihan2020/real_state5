package com.estate.real.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.estate.real.R;

import java.util.ArrayList;

public class HomeRecyclerAdapter extends RecyclerView.Adapter<HomeRecyclerAdapter.dataholder> {
    private Context context;
    private ArrayList<HomeRecyclerViewData> list;

    public HomeRecyclerAdapter(Context context, ArrayList<HomeRecyclerViewData> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public dataholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_recyclerview_item,parent,false);

        return new dataholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull dataholder holder, int position) {
        HomeRecyclerViewData data = list.get(position);
        ImageView imageView = holder.image;
        TextView textView = holder.text;
        imageView.setImageResource(data.getImage());
        textView.setText(data.getText());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class dataholder extends RecyclerView.ViewHolder{
        private ImageView image;
        private TextView text;
        public dataholder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageview);
            text  = itemView.findViewById(R.id.textView);
        }
    }
}
