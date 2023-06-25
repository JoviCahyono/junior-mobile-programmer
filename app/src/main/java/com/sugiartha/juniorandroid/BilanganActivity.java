package com.sugiartha.juniorandroid;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BilanganActivity extends AppCompatActivity {

    Button proses;
    EditText angka;
    TextView bilangan, prima;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilangan);
        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        proses = (Button) findViewById(R.id.proses);
        angka = (EditText) findViewById(R.id.angka);
        bilangan = (TextView) findViewById(R.id.bilangan);
        prima = (TextView) findViewById(R.id.prima);
        proses.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilai = Integer.parseInt(angka.getText().toString());
                if ((nilai % 2) == 0) {
                    bilangan.setText("Bilangan Genap");
                } else {
                    bilangan.setText("Bilangan Ganjil");
                }
                if (nilai >= 2) {
                    prima.setText("Bilangan Prima");
                    for (int x = 2; x < nilai; x++) {
                        if (nilai % x == 0) {
                            prima.setText("Bukan Bilangan Prima");
                            break;
                        }
                    }
                }
                bilangan.setText(nilai + " Termasuk " + bilangan.getText().toString() + " dan " + prima.getText().toString());
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
