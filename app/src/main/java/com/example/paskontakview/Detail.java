package com.example.paskontakview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Detail extends AppCompatActivity {
    String title,  pesan2, img;
    Bundle bundle;
    TextView tvnama, tvpesan;
    ImageView tvimg;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvnama = (TextView) findViewById(R.id.nama);
        tvpesan = (TextView) findViewById(R.id.telepon);
        tvimg = (ImageView) findViewById(R.id.gambar);
        bundle = getIntent().getExtras();
        if (bundle != null) {
            title = bundle.getString("nama");
            pesan2 = bundle.getString("desk");
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