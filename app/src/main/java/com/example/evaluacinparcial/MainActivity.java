package com.example.evaluacinparcial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtcorreo, txtpassword;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtcorreo = findViewById(R.id.edtcorreo);
        txtpassword = findViewById(R.id.edtpassword);
        btn1 = findViewById(R.id.btningresar);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String correo = "admin@gmail.com";
                //String clave = "123";
                String correo = txtcorreo.getText().toString();
                String password = txtpassword.getText().toString();
                    if(correo.equals("admin@gmail.com") && password.equals("123")){
                        Intent intent = new Intent(getApplicationContext(),examen.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(getApplicationContext(),"Datos Incorrectos", Toast.LENGTH_LONG).show();
                    }
                }

        });
    }

}