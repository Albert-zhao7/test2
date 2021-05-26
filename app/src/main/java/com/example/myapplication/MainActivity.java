package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView tv_one = findViewById(R.id.tv_one);
//        tv_one.setText("Leo");
        Log.v("data","onCreate");
        Log.d(TAG,"onCreate");
        Log.i(TAG,"onCreate");
        Log.w(TAG,"onCreate");
        Log.e(TAG,"onCreate");
    }
}
