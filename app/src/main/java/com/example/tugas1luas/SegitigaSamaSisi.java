package com.example.tugas1luas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SegitigaSamaSisi extends AppCompatActivity {

    private Button btnHasil, btnKembali;
    private EditText etTinggi, etSisi;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga_sama_sisi);

        btnHasil = findViewById(R.id.btn_hasil);
        btnKembali = findViewById(R.id.btn_kembali);
        etSisi = findViewById(R.id.et_sisi);
        etTinggi = findViewById(R.id.et_tinggi);
        tvHasil = findViewById(R.id.tv_hasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String sSisi = etSisi.getText().toString();
                    String sTinggi = etTinggi.getText().toString();

                    double sisi = Double.parseDouble(sSisi);
                    double tinggi = Double.parseDouble(sTinggi);

                    double hasil = sisi*tinggi;

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
                Intent moveIntent = new Intent(SegitigaSamaSisi.this, LuasSegitiga.class);
                startActivity(moveIntent);
            }
        });
    }
}
