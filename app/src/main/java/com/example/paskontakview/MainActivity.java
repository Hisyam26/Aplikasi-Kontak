package com.example.paskontakview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<Data> data;
    LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycleview);
        recyclerView.setHasFixedSize(true);
        addData();
        adapter = new Adapter(data, new Adapter.Callback() {
            @Override
            public void onClick(int position) {
                Data Operator = data.get(position);
                Toast.makeText(MainActivity.this,"Kontak" +position, Toast.LENGTH_SHORT).show();
                Intent move = new Intent(getApplicationContext(),Halaman2.class);
                move.putExtra("gambar", Operator.getGambar());
                move.putExtra("nama", Operator.getNama());
                move.putExtra("pesan", Operator.getPesan());
                startActivity(move);
            }
        });

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    public void addData(){
        data = new ArrayList<>();
        data.add(new Data("Amanda Manopo", "08676748484884", R.drawable.amanda));
        data.add(new Data("Anya Geraldine", "0844747474747", R.drawable.anya));
        data.add(new Data("Rizki Bilar", "082627362746", R.drawable.bilar));
        data.add(new Data("Nagita Slavina", "083632627363", R.drawable.nagita));
        data.add(new Data("Raisa", "0827362763", R.drawable.raisa));
        data.add(new Data("Rafi Ahmad", "08362864736437", R.drawable.rafi));
        data.add(new Data("Rizki Febian", "0826736263723626", R.drawable.riski));
    }
}