package com.sugiartha.juniorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    ListView lvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        lvResult = (ListView) findViewById(R.id.lvResult);

        String[][] dataNegara = new String[][]{{"Indonesia", "ASIA", "indonesia"},
                {"Malaysia", "ASIA", "malaysia"}, {"Singapore", "ASIA", "singapore"},
                {"Italia", "EROPA", "italia"}, {"Inggris", "EROPA", "inggris"},
                {"Belanda", "EROPA", "belanda"}, {"Argentina", "AMERIKA", "argentina"},
                {"Chile", "AMERIKA", "chile"}, {"Mesir", "AFRIKA", "mesir"},
                {"Uganda", "AFRIKA", "uganda"}};

        NegaraAdapter adapter = new NegaraAdapter(ListViewActivity.this, dataNegara);
        lvResult.setAdapter(adapter);
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
