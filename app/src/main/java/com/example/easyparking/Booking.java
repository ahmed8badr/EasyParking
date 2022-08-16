package com.example.easyparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Booking extends AppCompatActivity implements View.OnClickListener {

    ImageButton aBlock_btn, bBlock_btn, cBlock_btn, dBlock_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        aBlock_btn= (ImageButton) findViewById(R.id.aBlock_btn);
        aBlock_btn.setOnClickListener(this);

        bBlock_btn= (ImageButton) findViewById(R.id.bBlock_btn);
        bBlock_btn.setOnClickListener(this);

        cBlock_btn= (ImageButton) findViewById(R.id.cBlock_btn);
        cBlock_btn.setOnClickListener(this);

        dBlock_btn= (ImageButton) findViewById(R.id.dBlock_btn);
        dBlock_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.aBlock_btn:
                startActivity(new Intent(this,aBlock.class));
                break;
            case R.id.bBlock_btn:
                startActivity(new Intent(this,bBlock.class));
                break;
            case R.id.cBlock_btn:
                startActivity(new Intent(this,cBlock.class));
                break;
            case R.id.dBlock_btn:
                startActivity(new Intent(this,dBlock.class));
                break;

        }
    }
}