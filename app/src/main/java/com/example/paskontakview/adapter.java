package com.example.paskontakview;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
public class adapter extends RecyclerView.Adapter<adapter.ViewHolder> {
    private Callback callback;
    private ArrayList<Model> listdata;

    public adapter(ArrayList<Model> listdata, Callback callback) {
        this.listdata = listdata;
        this.callback = callback;
    }

    interface Callback{
        void halo(int position);
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.view, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model Datalist = listdata.get(position);
        holder.judul.setText(Datalist.getJudul());
        holder.bahasa.setText(Datalist.getTanggal());
        Picasso.get()
                .load(listdata.get(position).getGambar())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher_round)
                .into(holder.gambar);
    }

    @Override
    public int getItemCount()
    {
        return listdata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView bahasa, judul;
        ImageView gambar;
        LinearLayout linearLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.Image);
            bahasa = itemView.findViewById(R.id.tvbahasa);
            judul = itemView.findViewById(R.id.tvjudul);
            linearLayout = itemView.findViewById(R.id.linear);
            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    callback.halo(getAdapterPosition());
                }

            });
        }
    }
}
