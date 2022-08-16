package com.example.easyparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

public class Menu_Activity extends AppCompatActivity implements View.OnClickListener {

    ImageButton booking_btn, your_profile_btn, your_booked_btn, log_out_btn;

    static int booked = 0;
    static String[] bkd = {null,null,null,null,null};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        booking_btn = (ImageButton) findViewById(R.id.booking_btn);
        booking_btn.setOnClickListener(this);

        your_booked_btn = (ImageButton) findViewById(R.id.your_booked_btn);
        your_booked_btn.setOnClickListener(this);

        your_profile_btn = (ImageButton) findViewById(R.id.your_profile_btn);
        your_profile_btn.setOnClickListener(this);

        log_out_btn = (ImageButton) findViewById(R.id.Log_out_btn);
        log_out_btn.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        return;}

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.booking_btn:
                startActivity(new Intent(Menu_Activity.this, TimeAndDate.class));
                break;
            case R.id.your_profile_btn:
                startActivity(new Intent(Menu_Activity.this, YourProfile.class));
                break;
            case R.id.your_booked_btn:
                startActivity(new Intent(Menu_Activity.this, Your_Booked.class));
                break;
            case R.id.Log_out_btn:
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(Menu_Activity.this, MainActivity.class));
                break;
        }
    }
}