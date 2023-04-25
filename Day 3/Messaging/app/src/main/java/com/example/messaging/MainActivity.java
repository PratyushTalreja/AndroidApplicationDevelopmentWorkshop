package com.example.messaging;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ph, text;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ph = findViewById(R.id.number);
        text = findViewById(R.id.message);
        send = findViewById(R.id.send);

        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.SEND_SMS}, 1);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = ph.getText().toString();
                String value = text.getText().toString();
                if (num.length() != 10) {
                    Toast.makeText(MainActivity.this, "Mobile number must have 10 digits", Toast.LENGTH_LONG).show();
                }
                else if (value.length() == 0 || value == null) {
                    Toast.makeText(MainActivity.this, "Please write a non empty message", Toast.LENGTH_LONG).show();
                }
                try {
                    SmsManager sms = SmsManager.getDefault();
                    sms.sendTextMessage(num, null, value, null, null);
                    Toast.makeText(MainActivity.this, "SMS sent successfully!", Toast.LENGTH_LONG).show();
                    ph.setText("");
                    text.setText("");
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
