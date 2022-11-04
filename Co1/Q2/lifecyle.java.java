package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String tag ="Lifecycle Events";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast= Toast.makeText(getApplicationContext(),"onCreate invoked",Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag,"onCreate invoked");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast toast= Toast.makeText(getApplicationContext(),"onStart invoked",Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag,"onStart invoked");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Toast toast= Toast.makeText(getApplicationContext(),"onResume invoked",Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag,"onResume invoked");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast toast= Toast.makeText(getApplicationContext(),"onPause invoked",Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag,"onPause invoked");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast toast= Toast.makeText(getApplicationContext(),"onStop invoked",Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag,"onStop invoked");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast toast= Toast.makeText(getApplicationContext(),"onRestart invoked",Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag,"onRestart invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast= Toast.makeText(getApplicationContext(),"onDestroy invoked",Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag,"onDestroy invoked");
    }
}