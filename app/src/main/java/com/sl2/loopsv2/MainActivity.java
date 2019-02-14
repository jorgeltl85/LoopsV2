package com.sl2.loopsv2;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void cuentaAdelante(View v){
        Log.i(TAG,"Entrando en cuenta adelante");

        for(int x= 0;x < 10;x++){
            Log.i("Adelante","Adelante"+x);
        }
    }

    private void cuentaAtras(View v){
        Log.i(TAG,"Entrando en cuenta atras");
        for(int x= 10;x > 0;x--){
            Log.i("Atras","Atras"+x);
        }
    }

    private void cuentaDoble(View v){
        Log.i(TAG,"Entrando en cuenta doble");
        for(int x= 0;x < 10;x++){
            for(int y= 10;y > 0;y--){
                Log.i("Adelante","Adelante"+x);
                Log.i("Atras","Atras"+y);

            }
          }
    }


}
