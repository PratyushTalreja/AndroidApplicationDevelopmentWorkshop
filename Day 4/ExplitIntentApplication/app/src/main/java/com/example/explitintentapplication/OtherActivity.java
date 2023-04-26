package com.example.explitintentapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OtherActivity extends AppCompatActivity {
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        back = findViewById(R.id.back);

        Bundle extras = getIntent().getExtras();
        String valueFromMain = extras.getString("val");
        Toast.makeText(this, valueFromMain, Toast.LENGTH_SHORT).show();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OtherActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
