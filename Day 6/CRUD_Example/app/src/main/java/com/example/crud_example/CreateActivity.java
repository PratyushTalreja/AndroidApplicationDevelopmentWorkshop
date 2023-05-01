package com.example.crud_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateActivity extends AppCompatActivity {
    EditText roll, name, mobile;
    Button insert, back;

    DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        roll = findViewById(R.id.roll);
        name = findViewById(R.id.name);
        mobile = findViewById(R.id.mobile);
        insert = findViewById(R.id.insert);
        back = findViewById(R.id.back);
        db = new DBHelper(this);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rollNumber = roll.getText().toString();
                String nameVal = name.getText().toString();
                String mobileVal = mobile.getText().toString();
                db.insertDetails(rollNumber, nameVal, mobileVal);
                Toast.makeText(CreateActivity.this, "Data inserted successfully", Toast.LENGTH_SHORT).show();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CreateActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}