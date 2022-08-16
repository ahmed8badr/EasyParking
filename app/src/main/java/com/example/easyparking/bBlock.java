package com.example.easyparking;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class bBlock extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
    static int b1=0,b2=0,b3=0,b4=0,b5=0,b6=0,b7=0,b8=0,b9=0,b10=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_block);

        button1 = findViewById(R.id.b1);
        if (b1 == 0){ button1.setBackgroundColor(Color.GREEN);} else {button1.setBackgroundColor(Color.RED);}
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.b2);
        if (b2 == 0){ button2.setBackgroundColor(Color.GREEN);} else {button2.setBackgroundColor(Color.RED);}
        button2.setOnClickListener(this);
        button3 = findViewById(R.id.b3);
        if (b3 == 0){ button3.setBackgroundColor(Color.GREEN);} else {button3.setBackgroundColor(Color.RED);}
        button3.setOnClickListener(this);
        button4 = findViewById(R.id.b4);
        if (b4 == 0){ button4.setBackgroundColor(Color.GREEN);} else {button4.setBackgroundColor(Color.RED);}
        button4.setOnClickListener(this);
        button5 = findViewById(R.id.b5);
        if (b5 == 0){ button5.setBackgroundColor(Color.GREEN);} else {button5.setBackgroundColor(Color.RED);}
        button5.setOnClickListener(this);
        button6 = findViewById(R.id.b6);
        if (b6 == 0){ button6.setBackgroundColor(Color.GREEN);} else {button6.setBackgroundColor(Color.RED);}
        button6.setOnClickListener(this);
        button7 = findViewById(R.id.b7);
        if (b7 == 0){ button7.setBackgroundColor(Color.GREEN);} else {button7.setBackgroundColor(Color.RED);}
        button7.setOnClickListener(this);
        button8 = findViewById(R.id.b8);
        if (b8 == 0){ button8.setBackgroundColor(Color.GREEN);} else {button8.setBackgroundColor(Color.RED);}
        button8.setOnClickListener(this);
        button9 = findViewById(R.id.b9);
        if (b9 == 0){ button9.setBackgroundColor(Color.GREEN);} else {button9.setBackgroundColor(Color.RED);}
        button9.setOnClickListener(this);
        button10 = findViewById(R.id.b10);
        if (b10 == 0){ button10.setBackgroundColor(Color.GREEN);} else {button10.setBackgroundColor(Color.RED);}
        button10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.b1:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(bBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else { button1.setBackgroundColor(Color.RED);
                    b1=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "B1";
                    Toast.makeText(bBlock.this, "B1 slot is reserved successfully",Toast.LENGTH_SHORT).show();}
                break;
            case R.id.b2:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(bBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else{
                    button2.setBackgroundColor(Color.RED);
                    b2=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "B2";
                    Toast.makeText(bBlock.this, "B2 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.b3:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(bBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else{
                    button3.setBackgroundColor(Color.RED);
                    b3=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "B3";
                    Toast.makeText(bBlock.this, "B3 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.b4:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(bBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else{
                    button4.setBackgroundColor(Color.RED);
                    b4=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "B4";
                    Toast.makeText(bBlock.this, "B4 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.a5:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(bBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else{
                    button5.setBackgroundColor(Color.RED);
                    b5=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "B5";
                    Toast.makeText(bBlock.this, "B5 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.b6:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(bBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                }else{
                    button6.setBackgroundColor(Color.RED);
                    b6=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "B6";
                    Toast.makeText(bBlock.this, "B6 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.b7:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(bBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                } else{
                    button7.setBackgroundColor(Color.RED);
                    b7=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "B7";
                    Toast.makeText(bBlock.this, "B7 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.b8:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(bBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                } else{
                    button8.setBackgroundColor(Color.RED);
                    b8=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "B8";
                    Toast.makeText(bBlock.this, "B8 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.b9:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(bBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                } else{
                    button9.setBackgroundColor(Color.RED);
                    b9=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "B9";
                    Toast.makeText(bBlock.this, "B9 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.b10:
                Menu_Activity.booked++;
                if (Menu_Activity.booked > 5){Menu_Activity.booked--;
                    Toast.makeText(bBlock.this, "You can't book more than 5 slots",Toast.LENGTH_LONG).show();
                } else{
                    button10.setBackgroundColor(Color.RED);
                    b10=1;
                    Menu_Activity.bkd[Menu_Activity.booked-1] = "B10";
                    Toast.makeText(bBlock.this, "B10 slot is reserved successfully",Toast.LENGTH_SHORT).show();
                }
                break;

        }
    }
}