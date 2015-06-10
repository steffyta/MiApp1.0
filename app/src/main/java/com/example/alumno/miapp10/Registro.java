package com.example.alumno.miapp10;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Registro extends ActionBarActivity implements View.OnClickListener {
    Button us_Login;
    EditText us_Nombres,us_Apellidos,us_Rut;

    protected void OnCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        us_Nombres=(EditText) findViewById(R.id.us_Nombres);
        us_Apellidos =(EditText) findViewById(R.id.us_Apellidos);
        us_Rut= (EditText) findViewById(R.id.us_Rut);
        us_Login=(Button) findViewById(R.id.us_Login);

        us_Login.setOnClickListener(this);

    }
    public void onClick(View v) {
        Intent intent = new Intent(Registro.this, Menu.class);
        startActivity(intent);
    }
}