package com.example.mapmarker;

import static android.preference.PreferenceManager.getDefaultSharedPreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import org.osmdroid.api.IMapController;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;

public class MainActivity extends AppCompatActivity {
    EditText lat, lon;
    Button draw;
    MapView mapView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context ctx = getApplicationContext();
        Configuration.getInstance().load(ctx, getDefaultSharedPreferences(ctx));
        setContentView(R.layout.activity_main);

        lat = findViewById(R.id.latitude);
        lon = findViewById(R.id.longitude);
        draw = findViewById(R.id.draw);
        mapView = findViewById(R.id.mapView);
        mapView.setTileSource(TileSourceFactory.MAPNIK);

        IMapController iMapController = mapView.getController();
        iMapController.setZoom(9.0);
        GeoPoint startPoint = new GeoPoint(19.07, 72.87);
        iMapController.setCenter(startPoint);

        GeoPoint markerLocation = new GeoPoint(20.9320, 77.7523);
        Marker marker = new Marker(mapView);
        marker.setPosition(markerLocation);
        marker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        mapView.getOverlays().add(marker);
    }
}