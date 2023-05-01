package com.example.crud_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateActivity extends AppCompatActivity {
    EditText roll, id, name, mobile;
    Button search, update, back;
    DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        roll = findViewById(R.id.roll);
        id = findViewById(R.id.id);
        name = findViewById(R.id.name);
        mobile = findViewById(R.id.mobile);
        search = findViewById(R.id.search);
        update = findViewById(R.id.update);
        back = findViewById(R.id.back);
        db = new DBHelper(this);
        id.setEnabled(false);
        name.setEnabled(false);
        mobile.setEnabled(false);
        update.setEnabled(false);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idVal = roll.getText().toString();
                Cursor cursor = db.getDetail(idVal);
                if (cursor.moveToFirst()) {
                    id.setText(cursor.getString(0));
                    name.setText(cursor.getString(1));
                    mobile.setText(cursor.getString(2));
                    name.setEnabled(true);
                    mobile.setEnabled(true);
                    update.setEnabled(true);
                }
                else {
                    Toast.makeText(UpdateActivity.this, "Details for roll number " + idVal + " does not exist", Toast.LENGTH_SHORT).show();
                }
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idVal = id.getText().toString();
                String nameVal = name.getText().toString();
                String mobileVal = mobile.getText().toString();
                db.updateDetails(idVal, nameVal, mobileVal);
                Toast.makeText(UpdateActivity.this, "Details updated successfully", Toast.LENGTH_SHORT).show();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UpdateActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}