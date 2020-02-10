package com.estate.real.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.estate.real.R;

import java.util.List;

public class ParentRecyclerAdapter extends RecyclerView.Adapter<ParentRecyclerAdapter.MyViewHolder> {

    private List<ParentItem> itemsList;
    private RecyclerAdapter.OnItemClickListener childListener;
    private OnItemClickListener mListener;

    public ParentRecyclerAdapter(List<ParentItem> itemsList,
                                 RecyclerAdapter.OnItemClickListener listener){
        this.itemsList = itemsList;
        childListener = listener;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.parent_recyclerview_item, parent, false);
        return new MyViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        ParentItem item = itemsList.get(position);

        holder.tvCategory.setText(item.getCategoryTitle());

        RecyclerAdapter adapter = new RecyclerAdapter(item.getItems());
        adapter.setOnItemClickListener(childListener);

        holder.recyclerView.setAdapter(adapter);

        holder.btnViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onViewAllClick(view, position);
            }
        });
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;
    }

    @Override
    public int getItemCount() {
        return itemsList == null ? 0 : itemsList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvCategory;
        private Button btnViewAll;
        private RecyclerView recyclerView;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvCategory = itemView.findViewById(R.id.category_title);
            btnViewAll = itemView.findViewById(R.id.btnViewAll);
            recyclerView = itemView.findViewById(R.id.recyclerList);
        }
    }

    public interface OnItemClickListener {
        void onViewAllClick(View v, int listPosition);
    }
}
