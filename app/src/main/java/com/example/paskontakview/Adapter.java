package com.example.paskontakview;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
public class Adapter extends  RecyclerView.Adapter<Adapter.ViewHolder> {
    private Callback callback;
    private ArrayList<Data> listdata;
    private Context context;
    interface Callback{
        void onClick(int position);
    }
    public Adapter(ArrayList<Data> data1, Context context, Callback callback) {
        this.listdata = data1;
        this.callback = callback;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.itemlist, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Data Datalist = listdata.get(position);
        holder.judul.setText(Datalist.getJudul());
        holder.bahasa.setText(Datalist.getBahasa());
        Picasso.get()
                .load(listdata.get(position).getGambar())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher_round)
                .into(holder.gambar);
    }
    @Override
    public int getItemCount() {
        return listdata.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView  bahasa, judul;
        ImageView gambar;
        CardView cardView;
        public ViewHolder(View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.Image);
            bahasa = itemView.findViewById(R.id.tvbahasa);
            judul = itemView.findViewById(R.id.tvjudul);
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
