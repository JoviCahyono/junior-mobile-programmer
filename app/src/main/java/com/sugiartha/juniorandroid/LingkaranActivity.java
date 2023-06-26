package com.sugiartha.juniorandroid;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LingkaranActivity extends AppCompatActivity {

    Button hitung;
    EditText jari2;
    TextView luas, keliling;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        hitung = (Button) findViewById(R.id.hitung);
        jari2 = (EditText) findViewById(R.id.jari2);
        luas = (TextView) findViewById(R.id.txtluas);
        keliling = (TextView) findViewById(R.id.txtkeliling);

        hitung.setOnClickListener(new Button.OnClickListener() {
            @Override public void onClick(View v) {
                double jari = Double.parseDouble(jari2.getText().toString());
                double phi = 3.14;
                double Luas = phi*jari*jari;
                double Keliling = 2*phi*jari;
                luas.setText("Luas Lingkaran : " + Double.toString(Luas));
                keliling.setText("Keliling Lingkaran : " + Double.toString(Keliling));
            }});
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
