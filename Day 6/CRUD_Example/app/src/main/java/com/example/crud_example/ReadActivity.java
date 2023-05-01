package com.example.crud_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ReadActivity extends AppCompatActivity {
    Button back;
    ListView listView;

    DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        back = findViewById(R.id.back);
        listView = findViewById(R.id.listView);
        db = new DBHelper(this);

        ArrayList<String> arrayList = db.getDetails();
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ReadActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}