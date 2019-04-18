package com.color;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txvR,txvG,txvB,txv;
    String text="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvR = findViewById(R.id.textView3);
        txvG = findViewById(R.id.textView4);
        txvB = findViewById(R.id.textView5);
        txv = findViewById(R.id.textView6);
    }

    public void changeClor(View v){
        Random x = new Random();

        int red = x.next
    }
}
