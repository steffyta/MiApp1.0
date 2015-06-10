package com.example.alumno.miapp10;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;


public class Reclamo extends ActionBarActivity implements OnClickListener{

    Button btn;
    ImageView img;
    Intent i;
    Bitmap bmp;
    final static int cons = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reclamo);
        init();
    }

    public void init()
    {
        btn = (Button)findViewById(R.id.btnCamara);
        btn.setOnClickListener(this);

        img = (ImageView)findViewById(R.id.viewFoto);

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

    @Override
    public void onClick(View v) {
        int id;
        id= v.getId();
        switch (id)
        {
            case R.id.btnCamara:
                i= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,cons);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,Intent data)
    {
        super.onActivityResult(requestCode,resultCode, data);
        if(resultCode == Activity.RESULT_OK)
        {
            Bundle ext = data.getExtras();
            bmp =(Bitmap)ext.get("data");
            img.setImageBitmap(bmp);
        }
    }
}
