package org.techtown.priceofcafe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CafeAdapter extends RecyclerView.Adapter<CafeAdapter.ViewHolder> implements OnCafeItemClickListener{
    ArrayList<Cafe> items = new ArrayList<Cafe>();
    OnCafeItemClickListener listener;


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.cafe_item, parent, false);
        return new ViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Cafe item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    public void addItem(Cafe item){
        items.add(item);
    }
    public void setItems(ArrayList<Cafe> items){
        this.items = items;
    }
    public Cafe getItem(int position){
        return items.get(position);
    }
    public void setItem(int position,Cafe item){
        items.set(position,item);
    }

    @Override
    public void onItemClick(ViewHolder holder, View view, int position) {
        if(listener != null){
            listener.onItemClick(holder, view, position);
        }
    }
    public void setOnItemClickListener(OnCafeItemClickListener listener){
        this.listener = listener;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textName;
        TextView textNote;

        public ViewHolder(View itemView, final OnCafeItemClickListener listener){
            super(itemView);
            textName = itemView.findViewById(R.id.textName);
            textNote = itemView.findViewById(R.id.textNoti);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if(listener != null){
                        listener.onItemClick(ViewHolder.this, view,position);
                    }
                }
            });
        }

        public void setItem(Cafe item){
            textNote.setText(item.getNotification());
            textName.setText(item.getName());
        }
    }
}