package com.example.paskontakview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.ArrayList;

public class Halaman2 extends AppCompatActivity {
    String title,  pesan2;
    Integer img;
    Bundle bundle;
    TextView tvnama, tvpesan;
    ImageView tvimg;
    ArrayList<Data>listdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
        tvnama = (TextView) findViewById(R.id.nama);
        tvpesan = (TextView) findViewById(R.id.telepon);
        tvimg = (CircularImageView) findViewById(R.id.Image2);
        bundle = getIntent().getExtras();
        if (bundle != null) {
            title = bundle.getString("nama");
            pesan2 = bundle.getString("pesan");
            img = bundle.getInt("gambar");
        }
        tvnama.setText(title);
        tvpesan.setText(pesan2);
        tvimg.setImageResource(img);
    }

    }