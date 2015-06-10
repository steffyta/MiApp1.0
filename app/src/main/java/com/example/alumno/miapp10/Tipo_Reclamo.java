package com.example.alumno.miapp10;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;


public class Tipo_Reclamo extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reclamo);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_reclamo, menu);
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
    public void onRadioButtonClicked(View view){

        boolean checked=((RadioButton) view).isChecked();
        switch(view.getId()){

            case R.id.rbtnVehiculo:
                if(checked)
                    break;
            case R.id.rbtnEscombros:
                if(checked)
                    break;
            case R.id.rbtnMicrobasural:
                if(checked)
                    break;
            case R.id.rbtnTrabajadores:
                if(checked)
                    break;
            case R.id.rbtnCalle:
                if(checked)
                    break;
            case R.id.rbtnResiduos:
                if(checked)
                    break;
            case R.id.rbtnSumideros:
                if(checked)
                    break;
        }
    }
}

