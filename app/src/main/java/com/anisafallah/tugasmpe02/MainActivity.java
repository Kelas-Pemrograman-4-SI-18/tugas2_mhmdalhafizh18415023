package com.anisafallah.tugasmpe02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.anisafallah.tugasmpe02.R;

public class MainActivity extends AppCompatActivity {

    EditText edtNIlaiA, edtNilaiB;
    Button btnTambah, btnKurang, btnKali, btnBagi;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNIlaiA = (EditText) findViewById(R.id.edtNilaiA);
        edtNilaiB = (EditText) findViewById(R.id.edtNilaiB);
        txtHasil = (TextView) findViewById(R.id.txtHasil);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(edtNIlaiA.getText().toString());
                int nilaiB = Integer.parseInt(edtNilaiB.getText().toString());

                int hasil = nilaiA + nilaiB;
                txtHasil.setText(String.valueOf(hasil));
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(edtNIlaiA.getText().toString());
                int nilaiB = Integer.parseInt(edtNilaiB.getText().toString());

                int hasil = nilaiA - nilaiB;
                txtHasil.setText(String.valueOf(hasil));
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(edtNIlaiA.getText().toString());
                int nilaiB = Integer.parseInt(edtNilaiB.getText().toString());

                int hasil = nilaiA * nilaiB;
                txtHasil.setText(String.valueOf(hasil));
            }
        });


        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(edtNIlaiA.getText().toString());
                int nilaiB = Integer.parseInt(edtNilaiB.getText().toString());

                int hasil = nilaiA / nilaiB;
                txtHasil.setText(String.valueOf(hasil));
            }
        });
    }
}