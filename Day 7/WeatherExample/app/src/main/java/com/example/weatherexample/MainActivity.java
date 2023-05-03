package com.example.weatherexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    EditText city, lat, lon, temp;
    Button search, get;

    final String API_KEY = "acd14973282eeb32c1b76934c77f652c";

    RequestQueue requestQueue;
    StringRequest stringRequest;
    String url = "https://api.openweathermap.org/geo/1.0/direct?limit=5&appid=" + API_KEY;
    String urlWeather = "https://api.openweathermap.org/data/2.5/weather?appid=" + API_KEY;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        city = findViewById(R.id.city);
        lat = findViewById(R.id.lat);
        lon = findViewById(R.id.lon);
        temp = findViewById(R.id.temperture);
        search = findViewById(R.id.search);
        get = findViewById(R.id.get);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cityName = city.getText().toString();
                url = url + "&q=" + cityName;
                requestQueue = Volley.newRequestQueue(MainActivity.this);
                stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if (response != null) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);
                                lat.setText(jsonObject.getString("lat"));
                                lon.setText(jsonObject.getString("lon"));
                            } catch (JSONException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("TAG", error.toString());
                    }
                }
                );
                requestQueue.add(stringRequest);
            }
        });

        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String latitude = lat.getText().toString();
                String longitude = lat.getText().toString();
                urlWeather = urlWeather + "&lat=" + latitude + "&lon=" + longitude;
                requestQueue = Volley.newRequestQueue(MainActivity.this);
                stringRequest = new StringRequest(Request.Method.GET, urlWeather, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if (response != null) {
                            try {
                                JSONObject jsonObject = new JSONObject(response);
                                JSONObject main = jsonObject.getJSONObject("main");
                                temp.setText(main.getString("temp"));
                            } catch (JSONException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("TAG", error.toString());
                    }
                }
                );
                requestQueue.add(stringRequest);
            }
        });

    }
}