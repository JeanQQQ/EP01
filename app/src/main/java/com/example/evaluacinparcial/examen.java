package com.example.evaluacinparcial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class examen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.corazon:
                Toast.makeText(this, "Corazón", Toast.LENGTH_SHORT).show();
            case R.id.search:
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
            case R.id.Item1:
                Toast.makeText(this, "BIENVENIDO ITEM 01", Toast.LENGTH_SHORT).show();
            case R.id.Item2:
                Toast.makeText(this, "BIENVENIDO ITEM 02", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}