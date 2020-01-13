package com.myappcompany.shravya.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {

        EditText amount = (EditText) findViewById(R.id.amount);

        double amountDoubled = Double.parseDouble(amount.getText().toString());

        double amountInRupees = amountDoubled * 70.95;

        Toast.makeText(this, "$" + amount.getText().toString() + " is " + String.format("%.2f", amountInRupees) + " rupees.", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
