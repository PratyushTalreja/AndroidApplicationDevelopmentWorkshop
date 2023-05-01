package com.example.crud_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteActivity extends AppCompatActivity {
    EditText roll;
    Button delete, back;
    DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        roll = findViewById(R.id.roll);
        delete = findViewById(R.id.delete);
        back = findViewById(R.id.back);
        db = new DBHelper(this);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = roll.getText().toString();
                db.deleteDetails(id);
                Toast.makeText(DeleteActivity.this, "Details deleted successfully", Toast.LENGTH_SHORT).show();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DeleteActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}