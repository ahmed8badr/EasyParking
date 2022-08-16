package com.example.easyparking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Your_Booked extends AppCompatActivity {

    TextView booked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String output = "No booked slots yet";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your__booked);

        booked = findViewById(R.id.bookedView);
        for (int i=0; i<5;i++) {
            while (Menu_Activity.bkd[i] != null) {
                if (i==0)
                output = Menu_Activity.bkd[i];
                else
                    output += " "+ Menu_Activity.bkd[i];
                break;
            }
        }

        booked.setText(output);
    }
}