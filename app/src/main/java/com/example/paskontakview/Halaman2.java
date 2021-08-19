package com.example.paskontakview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Halaman2 extends AppCompatActivity {
    String title,  pesan2, img;
    Bundle bundle;
    TextView tvnama, tvpesan;
    ImageView tvimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
        tvnama = (TextView) findViewById(R.id.nama);
        tvpesan = (TextView) findViewById(R.id.telepon);
        tvimg = (ImageView) findViewById(R.id.gambar);
        bundle = getIntent().getExtras();
        if (bundle != null) {
            title = bundle.getString("nama");
            pesan2 = bundle.getString("pesan");
            img = bundle.getString("gambar");
            tvnama.setText(title);
            tvpesan.setText(pesan2);
            Picasso.get()
                    .load(img)
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher_round)
                    .into(tvimg);
        }
    }
}