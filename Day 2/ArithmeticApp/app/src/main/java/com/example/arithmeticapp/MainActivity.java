package com.example.arithmeticapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText n1, n2, op;
    Button plus, minus, into, divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.number1);
        n2 = findViewById(R.id.number2);
        op = findViewById(R.id.output);
        plus = findViewById(R.id.add);
        minus = findViewById(R.id.subtract);
        into = findViewById(R.id.multiply);
        divide = findViewById(R.id.division);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(n1.getText().toString());
                int num2 = Integer.parseInt(n2.getText().toString()); 
                int result = num1 + num2;
                op.setText(String.valueOf(result));
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(n1.getText().toString());
                int num2 = Integer.parseInt(n2.getText().toString());
                int result = num1 - num2;
                op.setText(String.valueOf(result));
            }
        });

        into.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(n1.getText().toString());
                int num2 = Integer.parseInt(n2.getText().toString());
                int result = num1 * num2;
                op.setText(String.valueOf(result));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(n1.getText().toString());
                int num2 = Integer.parseInt(n2.getText().toString());
                int result = num1 / num2;
                op.setText(String.valueOf(result));
            }
        });
    }
}