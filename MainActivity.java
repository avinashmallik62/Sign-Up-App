package com.avinash.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        
        Toast.makeText(MainActivity.this,"Sign-Up Successful", Toast.LENGTH_LONG).show();
        
        EditText myTextName =(EditText)findViewById(R.id.myTextName);
        EditText myTextEmail =(EditText)findViewById(R.id.myTextEmail);
        EditText myTextPassword =(EditText)findViewById(R.id.myTextPassword);


        Log.i("Info",  myTextName.getText().toString());
        Log.i("Info",  myTextEmail.getText().toString());
        Log.i("Info",  myTextPassword.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
