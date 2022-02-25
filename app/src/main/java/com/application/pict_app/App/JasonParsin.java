package com.application.pict_app.App;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

import com.application.pict_app.App.View.Movie_Room.MovieListView;
import com.application.pict_app.App.View.RetrofitList.RetrofitView;
import com.application.pict_app.R;

public class JasonParsin extends MainActivity {

    private Button Heros;
    private Button MovieL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parsin_jason);
        Heros = findViewById(R.id.heros );
        MovieL = findViewById(R.id.moviel);

        Heros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentheros = new Intent(JasonParsin.this, RetrofitView.class);
                startActivity(intentheros);
            }
        }
        );

        MovieL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmoviel = new Intent(JasonParsin.this, MovieListView.class);
                startActivity(intentmoviel);
            }
        });


    }
}
