package com.example.tugas1luas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LuasSegitiga extends AppCompatActivity {

    private Button btnSiku, btnKaki, btnSisi, btnSembarang, btnKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);

        btnSiku = findViewById(R.id.btn_siku);
        btnKaki = findViewById(R.id.btn_samakaki);
        btnSisi = findViewById(R.id.btn_samasisi);
        btnSembarang = findViewById(R.id.btn_sembarang);
        btnKembali = findViewById(R.id.btn_kembali);

        btnSiku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(LuasSegitiga.this, SegitigaSiku.class);
                startActivity(moveIntent);
            }
        });

        btnKaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(LuasSegitiga.this, SegitigaSamaKaki.class);
                startActivity(moveIntent);
            }
        });

        btnSisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(LuasSegitiga.this, SegitigaSamaSisi.class);
                startActivity(moveIntent);
            }
        });

        btnSembarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(LuasSegitiga.this, SegitigaSembarang.class);
                startActivity(moveIntent);
            }
        });

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(LuasSegitiga.this, MainActivity.class);
                startActivity(moveIntent);
            }
        });

    }
}
