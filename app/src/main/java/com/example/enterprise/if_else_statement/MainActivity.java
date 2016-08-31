package com.example.enterprise.if_else_statement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
    public void buttonOnClick(View v) {
// do something when the button is clicked
          Button button=(Button) v;
        ((Button) v).setText("oke");

       int number = 20;

       if (number == 10) {
           Toast.makeText(getApplicationContext(), "correct", Toast.LENGTH_SHORT).show();
       }else if (number < 10) {
           Toast.makeText(getApplicationContext(), "Too low", Toast.LENGTH_SHORT).show();
       }else{
           Toast.makeText(getApplicationContext(), "Too high", Toast.LENGTH_SHORT).show();
    }

    }

}

