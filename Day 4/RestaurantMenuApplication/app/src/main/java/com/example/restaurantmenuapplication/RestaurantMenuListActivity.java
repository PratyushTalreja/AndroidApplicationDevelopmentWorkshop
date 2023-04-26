package com.example.restaurantmenuapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class RestaurantMenuListActivity extends AppCompatActivity {
    ListView listView;
    String[] items;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_menu_list);

        back = findViewById(R.id.back);
        listView = findViewById(R.id.menulist);

        Bundle extras = getIntent().getExtras();
        String restaurantName = extras.getString("restaurant");
        if (restaurantName.equals("Taj")) {
            items = getResources().getStringArray(R.array.tajmenu);
        }
        else if (restaurantName.equals("Hyatt")) {
            items = getResources().getStringArray(R.array.hyattmenu);
        }
        else if (restaurantName.equals("JWMarriott")) {
            items = getResources().getStringArray(R.array.jwmarriottmenu);
        }
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, items);
        listView.setAdapter(adapter);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RestaurantMenuListActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}