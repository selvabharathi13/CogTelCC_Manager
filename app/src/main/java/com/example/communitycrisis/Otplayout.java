package com.example.communitycrisis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Otplayout extends otpkey {

 Button click_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otplayout);

        click_submit = (Button) findViewById(R.id.submit);

        click_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                covidupdates();
            }
        });

    }

    private void covidupdates() {
        Intent intent = new Intent(this,covidupdates.class);
        startActivity(intent);
    }


}
