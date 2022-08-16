package com.example.easyparking;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class cBlock extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
    static int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,c10=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_block);

        button1 = findViewById(R.id.c1);
        if (c1 == 0){ button1.setBackgroundColor(Color.GREEN);} else {button1.setBackgroundColor(Color.RED);}
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.c2);
        if (c2 == 0){ button2.setBackgroundColor(Color.GREEN);} else {button2.setBackgroundColor(Color.RED);}
        button2.setOnClickListener(this);
        button3 = findViewById(R.id.c3);
        if (c3 == 0){ button3.setBackgroundColor(Color.GREEN);} else {button3.setBackgroundColor(Color.RED);}
        button3.setOnClickListener(this);
        button4 = findViewById(R.id.c4);
        if (c4 == 0){ button4.setBackgroundColor(Color.GREEN);} else {button4.setBackgroundColor(Color.RED);}
        button4.setOnClickListener(this);
        button5 = findViewById(R.id.c5);
        if (c5 == 0){ button5.setBackgroundColor(Color.GREEN);} else {button5.setBackgroundColor(Color.RED);}
        button5.setOnClickListener(this);
        button6 = findViewById(R.id.c6);
        if (c6 == 0){ button6.setBackgroundColor(Color.GREEN);} else {button6.setBackgroundColor(Color.RED);}
        button6.setOnClickListener(this);
        button7 = findViewById(R.id.c7);
        if (c7 == 0){ button7.setBackgroundColor(Color.GREEN);} else {button7.setBackgroundColor(Color.RED);}
        button7.setOnClickListener(this);
        button8 = findViewById(R.id.c8);
        if (c8 == 0){ button8.setBackgroundColor(Color.GREEN);} else {button8.setBackgroundColor(Color.RED);}
        button8.setOnClickListener(this);
        button9 = findViewById(R.id.c9);
        if (c9 == 0){ button9.setBackgroundColor(Color.GREEN);} else {button9.setBackgroundColor(Color.RED);}
        button9.setOnClickListener(this);
        button10 = findViewById(R.id.c10);
        if (c10 == 0){ button10.setBackgroundColor(Color.GREEN);} else {button10.setBackgroundColor(Color.RED);}
        button10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.c1:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(cBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else { button1.setBackgroundColor(Color.RED);
                    c1=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "C1";
                    Toast.makeText(cBlock.this, "C1 slot is reserved successfully",Toast.LENGTH_SHORT).show();}
                break;
            case R.id.c2:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(cBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else{
                    button2.setBackgroundColor(Color.RED);
                    c2=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "C2";
                    Toast.makeText(cBlock.this, "C2 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.c3:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(cBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else{
                    button3.setBackgroundColor(Color.RED);
                    c3=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "C3";
                    Toast.makeText(cBlock.this, "C3 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.c4:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(cBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else{
                    button4.setBackgroundColor(Color.RED);
                    c4=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "C4";
                    Toast.makeText(cBlock.this, "C4 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.c5:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(cBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else{
                    button5.setBackgroundColor(Color.RED);
                    c5=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "C5";
                    Toast.makeText(cBlock.this, "C5 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.c6:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(cBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else{
                    button6.setBackgroundColor(Color.RED);
                    c6=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "C6";
                    Toast.makeText(cBlock.this, "C6 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.c7:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(cBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                } else{
                    button7.setBackgroundColor(Color.RED);
                    c7=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "C7";
                    Toast.makeText(cBlock.this, "C7 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.c8:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(cBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                } else{
                    button8.setBackgroundColor(Color.RED);
                    c8=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "C8";
                    Toast.makeText(cBlock.this, "C8 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.c9:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(cBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                } else{
                    button9.setBackgroundColor(Color.RED);
                    c9=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "C9";
                    Toast.makeText(cBlock.this, "C9 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.c10:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(cBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                } else{
                    button10.setBackgroundColor(Color.RED);
                    c10=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "C10";
                    Toast.makeText(cBlock.this, "C10 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;

        }
    }
}