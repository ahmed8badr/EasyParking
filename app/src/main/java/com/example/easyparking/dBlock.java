package com.example.easyparking;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class dBlock extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
    static int d1=0,d2=0,d3=0,d4=0,d5=0,d6=0,d7=0,d8=0,d9=0,d10=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_block);

        button1 = findViewById(R.id.d1);
        if (d1 == 0){ button1.setBackgroundColor(Color.GREEN);} else {button1.setBackgroundColor(Color.RED);}
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.d2);
        if (d2 == 0){ button2.setBackgroundColor(Color.GREEN);} else {button2.setBackgroundColor(Color.RED);}
        button2.setOnClickListener(this);
        button3 = findViewById(R.id.d3);
        if (d3 == 0){ button3.setBackgroundColor(Color.GREEN);} else {button3.setBackgroundColor(Color.RED);}
        button3.setOnClickListener(this);
        button4 = findViewById(R.id.d4);
        if (d4 == 0){ button4.setBackgroundColor(Color.GREEN);} else {button4.setBackgroundColor(Color.RED);}
        button4.setOnClickListener(this);
        button5 = findViewById(R.id.d5);
        if (d5 == 0){ button5.setBackgroundColor(Color.GREEN);} else {button5.setBackgroundColor(Color.RED);}
        button5.setOnClickListener(this);
        button6 = findViewById(R.id.d6);
        if (d6 == 0){ button6.setBackgroundColor(Color.GREEN);} else {button6.setBackgroundColor(Color.RED);}
        button6.setOnClickListener(this);
        button7 = findViewById(R.id.d7);
        if (d7 == 0){ button7.setBackgroundColor(Color.GREEN);} else {button7.setBackgroundColor(Color.RED);}
        button7.setOnClickListener(this);
        button8 = findViewById(R.id.d8);
        if (d8 == 0){ button8.setBackgroundColor(Color.GREEN);} else {button8.setBackgroundColor(Color.RED);}
        button8.setOnClickListener(this);
        button9 = findViewById(R.id.d9);
        if (d9 == 0){ button9.setBackgroundColor(Color.GREEN);} else {button9.setBackgroundColor(Color.RED);}
        button9.setOnClickListener(this);
        button10 = findViewById(R.id.d10);
        if (d10 == 0){ button10.setBackgroundColor(Color.GREEN);} else {button10.setBackgroundColor(Color.RED);}
        button10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.d1:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(dBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else { button1.setBackgroundColor(Color.RED);
                    d1=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "D1";
                    Toast.makeText(dBlock.this, "D1 slot is reserved successfully",Toast.LENGTH_SHORT).show();}
                break;
            case R.id.d2:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(dBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else{
                    button2.setBackgroundColor(Color.RED);
                    d2=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "D2";
                    Toast.makeText(dBlock.this, "D2 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.d3:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(dBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else{
                    button3.setBackgroundColor(Color.RED);
                    d3=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "D3";
                    Toast.makeText(dBlock.this, "D3 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.d4:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(dBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else{
                    button4.setBackgroundColor(Color.RED);
                    d4=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "D4";
                    Toast.makeText(dBlock.this, "D4 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.d5:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(dBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else{
                    button5.setBackgroundColor(Color.RED);
                    d5=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "D5";
                    Toast.makeText(dBlock.this, "D5 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.d6:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(dBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else{
                    button6.setBackgroundColor(Color.RED);
                    d6=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "D6";
                    Toast.makeText(dBlock.this, "D6 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.d7:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(dBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                } else{
                    button7.setBackgroundColor(Color.RED);
                    d7=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "D7";
                    Toast.makeText(dBlock.this, "D7 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.d8:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(dBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                } else{
                    button8.setBackgroundColor(Color.RED);
                    d8=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "D8";
                    Toast.makeText(dBlock.this, "D8 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.d9:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(dBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                } else{
                    button9.setBackgroundColor(Color.RED);
                    d9=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "D9";
                    Toast.makeText(dBlock.this, "D9 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.d10:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(dBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                } else{
                    button10.setBackgroundColor(Color.RED);
                    d10=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "D10";
                    Toast.makeText(dBlock.this, "D10 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;

        }
    }
}