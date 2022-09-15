package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void greet(View v){
        Log.w("MainActivity", "v = " + v);
        TextView msgBox = (TextView) findViewById(R.id.msg);
        msgBox.setText("Hello World!");
    }
}