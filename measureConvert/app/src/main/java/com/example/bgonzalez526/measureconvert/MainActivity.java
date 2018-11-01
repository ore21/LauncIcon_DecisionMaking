package com.example.bgonzalez526.measureconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true); // displays icon in home
        getSupportActionBar().setLogo(R.mipmap.ic_launcher); // gets your icon and puts it in the top bar
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button convertIt = findViewById(R.id.idConvertMeasure);
        final EditText convertnum = findViewById(R.id.idMeasureNum);
        final RadioButton rbIntToCm = findViewById(R.id.idrbInToCm);
        final RadioButton rbCmToIn = findViewById(R.id.idrbCmToIn);
        final TextView txtResult = findViewById(R.id.idResult);

        convertIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat tenth = new DecimalFormat("#.#");
                Double dbMeasure = Double.parseDouble(convertnum.getText().toString());
                Double conversionRate = 2.54;
                Double convertMeasureNum = 0.00;

                if (rbIntToCm.isChecked()) { // if it's checked..
                    if (dbMeasure <= 72) {
                        convertMeasureNum = dbMeasure * conversionRate;
                        txtResult.setText(tenth.format(convertMeasureNum) + "cm");
                    } else {
                        Toast.makeText(MainActivity.this, "Inches must be less then 72.", Toast.LENGTH_LONG).show(); // shows everything

                    }
                }

                if (rbCmToIn.isChecked()) { // if it's checked..
                    if (dbMeasure <= 185) {
                        convertMeasureNum = dbMeasure / conversionRate;
                        txtResult.setText(tenth.format(convertMeasureNum) + "in");
                    } else {
                        Toast.makeText(MainActivity.this, "Centimeters must be less then 185.", Toast.LENGTH_LONG).show(); // shows everything

                    }
                }
            }
        });
    }
}

