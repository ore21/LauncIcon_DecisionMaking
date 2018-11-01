package com.example.bgonzalez526.inclassexample2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //For editText for password and text
        String holdText = "";
        EditText holdPassword = findViewById(R.id.idPassword);
        holdText = holdPassword.getText().toString(); // get information from that specific box

        //For EditText for numbers
//        int holdNumber = 0;
//        EditText hold2digit = findViewById(R.id.idNumber);
//        holdNumber = Integer.parseInt(String.valueOf(hold2digit.getText()));
//
//        String holdET = "";
//        holdET = hold2digit.getText().toString();
//        holdNumber = Integer.parseInt(holdET);
    }
}
