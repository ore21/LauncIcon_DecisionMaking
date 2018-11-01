package com.example.bgonzalez526.launchiconsanddecisionmaking;

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
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        Button convertIt = findViewById(R.id.idConvertCurrency);
        final EditText convertnum = findViewById(R.id.idCurrencyNum);
        final RadioButton rbQToD = findViewById(R.id.idrbQToD);
        final RadioButton rbDToQ = findViewById(R.id.idrbDToQ);
        final TextView txtResult = findViewById(R.id.idResult);

        convertIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat tenth = new DecimalFormat("#.#");
                Double dbCurrency = Double.parseDouble(convertnum.getText().toString());
                Double conversionRate = 7.72;
                Double convertMeasureNum = 0.00;

                if (rbDToQ.isChecked()) { // if it's checked..
                    if (dbCurrency <= 10000) {
                        convertMeasureNum = dbCurrency * conversionRate;
                        txtResult.setText(tenth.format(convertMeasureNum) + " $Q");
                    } else {
                        Toast.makeText(MainActivity.this, "Dollars must be less then $10,000.00.", Toast.LENGTH_LONG).show(); // shows everything

                    }
                }

                if (rbQToD.isChecked()) { // if it's checked..
                    if (dbCurrency <= 10000) {
                        convertMeasureNum = dbCurrency / conversionRate;
                        txtResult.setText(tenth.format(convertMeasureNum) + " $D");
                    } else {
                        Toast.makeText(MainActivity.this, "Quetzales must be less then $10,000.00.", Toast.LENGTH_LONG).show(); // shows everything

                    }
                }
            }
        });
    }
}
