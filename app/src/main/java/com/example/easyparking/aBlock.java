package com.example.easyparking;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class aBlock extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
    static int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0,a10=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_block);

        button1 = findViewById(R.id.a1);
        if (a1 == 0){ button1.setBackgroundColor(Color.GREEN);} else {button1.setBackgroundColor(Color.RED);}
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.a2);
        if (a2 == 0){ button2.setBackgroundColor(Color.GREEN);} else {button2.setBackgroundColor(Color.RED);}
        button2.setOnClickListener(this);
        button3 = findViewById(R.id.a3);
        if (a3 == 0){ button3.setBackgroundColor(Color.GREEN);} else {button3.setBackgroundColor(Color.RED);}
        button3.setOnClickListener(this);
        button4 = findViewById(R.id.a4);
        if (a4 == 0){ button4.setBackgroundColor(Color.GREEN);} else {button4.setBackgroundColor(Color.RED);}
        button4.setOnClickListener(this);
        button5 = findViewById(R.id.a5);
        if (a5 == 0){ button5.setBackgroundColor(Color.GREEN);} else {button5.setBackgroundColor(Color.RED);}
        button5.setOnClickListener(this);
        button6 = findViewById(R.id.a6);
        if (a6 == 0){ button6.setBackgroundColor(Color.GREEN);} else {button6.setBackgroundColor(Color.RED);}
        button6.setOnClickListener(this);
        button7 = findViewById(R.id.a7);
        if (a7 == 0){ button7.setBackgroundColor(Color.GREEN);} else {button7.setBackgroundColor(Color.RED);}
        button7.setOnClickListener(this);
        button8 = findViewById(R.id.a8);
        if (a8 == 0){ button8.setBackgroundColor(Color.GREEN);} else {button8.setBackgroundColor(Color.RED);}
        button8.setOnClickListener(this);
        button9 = findViewById(R.id.a9);
        if (a9 == 0){ button9.setBackgroundColor(Color.GREEN);} else {button9.setBackgroundColor(Color.RED);}
        button9.setOnClickListener(this);
        button10 = findViewById(R.id.a10);
        if (a10 == 0){ button10.setBackgroundColor(Color.GREEN);} else {button10.setBackgroundColor(Color.RED);}
        button10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.a1:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(aBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else {
                    button1.setBackgroundColor(Color.RED);
                        a1=1;
                        Menu_Activity.bkd[Menu_Activity.booked-1] = "A1";
                        Toast.makeText(aBlock.this, "A1 slot is reserved successfully",Toast.LENGTH_SHORT).show();}
                break;
            case R.id.a2:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(aBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else{
                    button2.setBackgroundColor(Color.RED);
                    a2=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "A2";
                    Toast.makeText(aBlock.this, "A2 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.a3:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(aBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else{
                    button3.setBackgroundColor(Color.RED);
                    a3=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "A3";
                    Toast.makeText(aBlock.this, "A3 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.a4:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(aBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else{
                    button4.setBackgroundColor(Color.RED);
                    a4=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "A4";
                    Toast.makeText(aBlock.this, "A4 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.a5:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(aBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else{
                    button5.setBackgroundColor(Color.RED);
                    a5=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "A5";
                    Toast.makeText(aBlock.this, "A5 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.a6:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(aBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else{
                    button6.setBackgroundColor(Color.RED);
                    a6=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "A6";
                    Toast.makeText(aBlock.this, "A6 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.a7:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(aBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                } else{
                    button7.setBackgroundColor(Color.RED);
                    a7=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "A7";
                    Toast.makeText(aBlock.this, "A7 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.a8:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(aBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                } else{
                    button8.setBackgroundColor(Color.RED);
                    a8=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "A8";
                    Toast.makeText(aBlock.this, "A8 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.a9:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(aBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                } else{
                    button9.setBackgroundColor(Color.RED);
                    a9=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "A9";
                    Toast.makeText(aBlock.this, "A9 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.a10:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(aBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                } else{
                    button10.setBackgroundColor(Color.RED);
                    a10=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "A10";
                    Toast.makeText(aBlock.this, "A10 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;

        }
    }
}