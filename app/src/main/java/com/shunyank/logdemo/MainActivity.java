package com.shunyank.logdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.shunyank.simplelog.Log;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    public String TAG ="MAINACTIVITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void stringLog(View view) {
      Log.e("STRING LOG","Normal String Message");
    }

    public void stringIntLog(View view) {
        Log.e("INT STRING LOG",100," string & int message");

    }

    public void stringBoolLog(View view) {
        Log.e("BOOL STRING LOG",true," string & boolean message");
    }

    public void stringArrayIntLog(View view) {

        Log.e("STRING ARRAY INT LOG",2,new String[]{"  message 1 "," Message 2 "," Message 3"});


    }

    public void stringArrayLog(View view) {
        Log.e("STRING ARRAY  LOG",new String[]{"  message 1 "," Message 2 "," Message 3"});

    }

    public void boolLog(View view) {
        Log.e("BOOL  LOG",true);

    }

    public void intLog(View view) {
        Log.e("INT  LOG",1);

    }

    public void stringMapLog(View view) {
        Map<String,String> logValues = new HashMap<String, String>();
        logValues.put("TAG 1","Message 1");
        logValues.put("TAG 2","Message 2");
        logValues.put("TAG 3","Message 3");
        logValues.put("TAG 4","Message 4");
        Log.e(logValues);

    }
}