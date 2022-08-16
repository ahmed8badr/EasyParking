package com.example.easyparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.jaredrummler.materialspinner.MaterialSpinner;

import java.util.ArrayList;

public class TimeAndDate extends AppCompatActivity {

    MaterialSpinner spinner, spinner2;
    Button confirm_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_and_date);

        spinner = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner2);

        ArrayList<String> time = new ArrayList<>();
       // time.add("From");
        time.add("12 Pm");
        time.add("1 Pm");
        time.add("2 Pm");
        time.add("3 Pm");
        time.add("4 Pm");
        time.add("5 Pm");
        time.add("6 Pm");
        time.add("7 Pm");
        time.add("8 Pm");
        time.add("9 Pm");
        time.add("10 Pm");
        time.add("11 Pm");
        spinner.setItems(time);

        spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, Object item) {
                Toast.makeText(TimeAndDate.this, " Your Booking From: " + time.get(position), Toast.LENGTH_LONG).show();

            }
        });

        ArrayList<String> time2 = new ArrayList<>();
        //time2.add("To");
        time2.add("1 Pm");
        time2.add("2 Pm");
        time2.add("3 Pm");
        time2.add("4 Pm");
        time2.add("5 Pm");
        time2.add("6 Pm");
        time2.add("7 Pm");
        time2.add("8 Pm");
        time2.add("9 Pm");
        time2.add("10 Pm");
        time2.add("11 Pm");
        spinner2.setItems(time2);

        spinner2.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, Object item) {
                Toast.makeText(TimeAndDate.this, " Your Booking To: " + time2.get(position), Toast.LENGTH_LONG).show();

            }
        });


        confirm_btn = (Button) findViewById(R.id.confirm_btn);
        confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TimeAndDate.this, Booking.class));
            }
        });

    }
}