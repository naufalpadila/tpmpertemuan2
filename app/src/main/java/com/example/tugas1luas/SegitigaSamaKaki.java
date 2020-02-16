package com.example.tugas1luas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SegitigaSamaKaki extends AppCompatActivity {

    private Button btnHasil, btnKembali;
    private EditText etTinggi, etAlas;
    private TextView tvHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga_sama_kaki);

        btnHasil = findViewById(R.id.btn_hasil);
        btnKembali = findViewById(R.id.btn_kembali);
        etAlas = findViewById(R.id.et_alas);
        etTinggi = findViewById(R.id.et_tinggi);
        tvHasil = findViewById(R.id.tv_hasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String sAlas = etAlas.getText().toString();
                    String sTinggi = etTinggi.getText().toString();

                    double alas = Double.parseDouble(sAlas);
                    double tinggi = Double.parseDouble(sTinggi);

                    double hasil = alas*tinggi;

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(SegitigaSamaKaki.this, LuasSegitiga.class);
                startActivity(moveIntent);
            }
        });
    }
}
