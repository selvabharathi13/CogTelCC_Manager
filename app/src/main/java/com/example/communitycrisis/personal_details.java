package com.example.communitycrisis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.communitycrisis.personal_details;
public class personal_details extends MainActivity {


    Button click_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_details);

        click_register =(Button) findViewById(R.id.register);


        click_register.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Registered Successfull",
                        Toast.LENGTH_LONG)
                        .show();

                covidupdates();
            }
        }));


        }

    private void covidupdates() {

        Intent intent = new Intent(this,covidupdates.class);
        startActivity(intent);

    }

    ;




}
