package com.example.implicitintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText url;
    Button go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        url = findViewById(R.id.url);
        go = findViewById(R.id.visit);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = url.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(val));
                startActivity(i);
            }
        });

    }
}