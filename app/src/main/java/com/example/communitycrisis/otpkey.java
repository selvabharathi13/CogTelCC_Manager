package com.example.communitycrisis;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.communitycrisis.MainActivity;



public class otpkey extends MainActivity{
    Button click_sendOTP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sendotp);

        click_sendOTP = (Button) findViewById(R.id.SendOTP);

        click_sendOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                otplayout();
            }
        });

    }


       public void otplayout(){
            Intent intent = new Intent(this,Otplayout.class);
            startActivity(intent);

       }


        }






