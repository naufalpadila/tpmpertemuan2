package com.example.tugas1luas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnSegitiga, btnJajargenjang;
    private TextView tvNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSegitiga = findViewById(R.id.btn_segitiga);
        btnJajargenjang = findViewById(R.id.btn_jajargenjang);
        tvNama = findViewById(R.id.tv_nama);


        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(MainActivity.this , LuasSegitiga.class);
                startActivity(moveIntent);
            }
        });

        btnJajargenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(MainActivity.this , LuasJajargenjang.class);
                startActivity(moveIntent);
            }
        });

    }

}
