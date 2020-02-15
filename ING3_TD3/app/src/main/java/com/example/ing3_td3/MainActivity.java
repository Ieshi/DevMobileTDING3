package com.example.ing3_td3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

   List<JeuVideo> mesJeux;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //CREER ICI UNE LISTE DE JEUX VIDEO NOMMEE mesJeux ET REMPLISSEZ LA DE JeuxVideo
            List<JeuVideo> mesJeux = new ArrayList<JeuVideo>();

            for(int i =0; i<1000; i++){
                Random r = new Random();
                int price = 1 + r.nextInt(5000);
                mesJeux.add(new JeuVideo("nom"+i, price));
            }

            RecyclerView myRecyclerView = findViewById(R.id.myRecyclerView);
            //myRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
            //myRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
            myRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));

            myRecyclerView.setAdapter( new MyVideosGamesAdapter(mesJeux));
        }

}
