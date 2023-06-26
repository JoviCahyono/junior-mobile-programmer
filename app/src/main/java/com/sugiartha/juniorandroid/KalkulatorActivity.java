package com.sugiartha.juniorandroid;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KalkulatorActivity extends AppCompatActivity {

    EditText angka1, angka2;
    Button btnHitung;
    TextView txtTambah, txtKurang, txtBagi, txtKali;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnHitung = (Button) findViewById(R.id.btnHitung);
        angka1 = (EditText) findViewById(R.id.angka1);
        angka2 = (EditText) findViewById(R.id.angka2);
        txtTambah = (TextView) findViewById(R.id.tambah);
        txtKurang = (TextView) findViewById(R.id.kurang);
        txtKali = (TextView) findViewById(R.id.kali);
        txtBagi = (TextView) findViewById(R.id.bagi);
        btnHitung.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                double angkasatu = Double.parseDouble(angka1.getText().toString());
                double angkadua = Double.parseDouble(angka2.getText().toString());
                double tambah = angkasatu + angkadua;
                txtTambah.setText("Pertambahan : " + tambah);
                double kurang = angkasatu - angkadua;
                txtKurang.setText("Pengurangan : " + kurang);
                double kali = angkasatu * angkadua;
                txtKali.setText("Perkalian : " + kali);
                double bagi = angkasatu / angkadua;
                txtBagi.setText("Pembagian : " + bagi);
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
