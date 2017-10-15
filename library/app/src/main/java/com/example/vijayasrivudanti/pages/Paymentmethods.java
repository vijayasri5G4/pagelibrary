package com.example.vijayasrivudanti.pages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Paymentmethods extends AppCompatActivity {

    Button credit,bank,wallet,split;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentmethods);
        credit = (Button) findViewById(R.id.button2);
        credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(Paymentmethods.this,Credit.class);
                startActivity(c);
            }
        });
        bank = (Button) findViewById(R.id.button3);
        bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b= new Intent(Paymentmethods.this,Bank.class);
                startActivity(b);
            }
        });
        wallet = (Button) findViewById(R.id.button6);
        wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w= new Intent(Paymentmethods.this,Wallet.class);
                startActivity(w);
            }
        });
        split = (Button) findViewById(R.id.button4);
        split.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s= new Intent(Paymentmethods.this,Split.class);
                startActivity(s);
            }
        });

    }

}
