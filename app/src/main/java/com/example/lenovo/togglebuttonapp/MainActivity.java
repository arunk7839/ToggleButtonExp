package com.example.lenovo.togglebuttonapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ToggleButton toggle = (ToggleButton) findViewById(R.id.toggle_btn);

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    // The toggle is enabled
                    toggle.setBackgroundColor(Color.GREEN);
                    Toast.makeText(getApplicationContext(), "ToggleButton is ON   ", Toast.LENGTH_LONG).show();
                } else {
                    // The toggle is disabled
                    toggle.setBackgroundColor(Color.RED);
                    Toast.makeText(getApplicationContext(), "ToggleButton is OFF   ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
