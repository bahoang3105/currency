package com.example.currency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String valueInput = "0";
    private String valueConverted = "0";
    private TextView inputCurrency;
    private String currencyUnit1;
    private String currencyUnit2;
    private double[] currencyValueList = {20.235, 1, 30.125, 3.57, 6.72};
    private Spinner spinner1;
    private Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputCurrency = findViewById(R.id.value1);
        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
    }

    public void inputCurrency(View button) {
        Button b = (Button) button;
        if(valueInput == "0") {
            valueInput = b.getText().toString();
        } else {
            valueInput = valueInput + b.getText().toString();
        }
        inputCurrency.setText(valueInput);
    }

    public void reset(View button) {
        valueInput = "0";
        inputCurrency.setText("0");
    }

    public void delete(View button) {
        valueInput = valueInput.substring(0, valueInput.length() - 1);
        inputCurrency.setText(valueInput);
    }

    public void setupSpinner() {
        spinner1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("as", i + "    " + l);
            }
        });
    }

}