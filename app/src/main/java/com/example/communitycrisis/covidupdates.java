package com.example.communitycrisis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class covidupdates extends personal_details{

    Button coviddasjboard;

    Button covidheatmap;

    Button campcentres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.covidupdates);

        coviddasjboard = (Button) findViewById(R.id.coviddasjboard);
        coviddasjboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coviddashboard();
            }
        });

        covidheatmap = (Button) findViewById(R.id.covidheatmap);
        covidheatmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                covidheatmap();
            }
        });

        campcentres = (Button) findViewById(R.id.campcentres);
        campcentres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                campcentres();
            }
        });

    }




    public void coviddashboard() {

        Intent intent = new Intent(this,coviddashboardworld.class);
        startActivity(intent);
    }


    public void covidheatmap() {

        Intent intent = new Intent(this,coronaHeatMap.class);
        startActivity(intent);
    }

    public void campcentres() {

        Intent intent = new Intent(this,coronacamp.class);
        startActivity(intent);
    }

}
