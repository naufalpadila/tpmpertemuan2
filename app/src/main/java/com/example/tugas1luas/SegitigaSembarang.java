package com.example.tugas1luas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SegitigaSembarang extends AppCompatActivity {

    private Button btnHasil, btnKembali;
    private EditText etSisi1, etSisi2, etSisi3;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga_sembarang);

        btnHasil = findViewById(R.id.btn_hasil);
        btnKembali = findViewById(R.id.btn_kembali);
        etSisi1 = findViewById(R.id.et_sisi1);
        etSisi2 = findViewById(R.id.et_sisi2);
        etSisi3 = findViewById(R.id.et_sisi3);
        tvHasil = findViewById(R.id.tv_hasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String sSisi1 = etSisi1.getText().toString();
                    String sSisi2 = etSisi2.getText().toString();
                    String sSisi3 = etSisi3.getText().toString();

                    double sisi1 = Double.parseDouble(sSisi1);
                    double sisi2 = Double.parseDouble(sSisi2);
                    double sisi3 = Double.parseDouble(sSisi3);

                    double hasil = (sisi1 + sisi2 + sisi3)/2;

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(SegitigaSembarang.this, LuasSegitiga.class);
                startActivity(moveIntent);
            }
        });

    }
}
