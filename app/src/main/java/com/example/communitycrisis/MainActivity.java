package com.example.communitycrisis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button existingUser_button ;
    Button signUp_button ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        existingUser_button = (Button) findViewById(R.id.existinguser);
        existingUser_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            optkey();
            }
        });

        signUp_button = (Button) findViewById(R.id.signup);
        signUp_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                personal_details();
            }
        });
    }

    public void optkey(){
            Intent intent = new Intent(this,otpkey.class);
            startActivity(intent);

        }

    public void personal_details(){

        Intent intent = new Intent(this,personal_details.class);
        startActivity(intent);

    }

    }


