package com.example.alumno.miapp10;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;


public class Sugerencia extends ActionBarActivity implements View.OnClickListener {
    Button btnEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugerencia);
        init();
    }

    public void init()
    {
        btnEnviar = (Button)findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sugerencia, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Importante");
        builder.setMessage("Su mensaje a sido enviado exitosamente");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener(){
            //función onClick para volver al Menu_Principal luego de apretar 'OK' en el AlertDialog
            @Override
            public void onClick(DialogInterface dialog, int which){
                Intent intent = new Intent(getBaseContext(), Menu_Principal.class);
                startActivity(intent);
            }
        });
        builder.create();
        builder.show();
    }

    public void onRadioButtonClicked(View view){

        boolean checked=((RadioButton) view).isChecked();
        switch(view.getId()){

            case R.id.rbtnSugerencia:
                if(checked)
                break;
            case R.id.rbtnFelicitacion:
                if(checked)
                break;
        }
    }
}