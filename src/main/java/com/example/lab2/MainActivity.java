package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.CalendarView;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Switch aSwitch;
    Button button;
    ConstraintLayout layout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button1);
        aSwitch=findViewById(R.id.switch1);
        layout=findViewById(R.id.layout);
        CalendarView cal=new CalendarView(this);
        layout.addView(cal);
        aSwitch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                if(aSwitch.isChecked())
                {
                    button.setEnabled(true);
                    layout.removeView(cal);
                    Toast.makeText(MainActivity.this,"button enabled",Toast.LENGTH_LONG).show();
                }
                else
                {
                    button.setEnabled(false);
                    layout.addView(cal);
                    Toast.makeText(MainActivity.this,"button disabled",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}