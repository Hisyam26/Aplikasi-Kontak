package com.example.paskontakview;

import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import javax.security.auth.callback.Callback;

public class Adapter extends  RecyclerView.Adapter<Adapter.ViewHolder> {
    private Callback callback;
    private ArrayList<Data> listdata;
    interface Callback{
        void onClick(int position);
    }
    public Adapter(ArrayList<Data> data, Callback callback) {
        this.listdata = data;
        this.callback = callback;
    }
    public Adapter (ArrayList<Data>listdata){
        this.listdata = listdata;}
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.itemlist, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Data Datalist = listdata.get(position);
        holder.textViewnama.setText(Datalist.getNama());
        holder.textViewpesan.setText(Datalist.getPesan());
        holder.gambar.setImageResource(Datalist.getGambar());
    }

    @Override
    public int getItemCount() { return (listdata != null) ? listdata.size() :0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView gambar;
        TextView  textViewpesan;
        TextView textViewnama;
        CardView cardView;
        public ViewHolder(View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.Image);
            textViewpesan = itemView.findViewById(R.id.textpesan);
            textViewnama = itemView.findViewById(R.id.textnama);
            cardView = itemView.findViewById(R.id.Cardview);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    callback.onClick(getAdapterPosition());
                }
            });
        }
    }


}
