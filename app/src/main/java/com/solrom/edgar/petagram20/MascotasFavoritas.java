package com.solrom.edgar.petagram20;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by edgarsr on 08/09/17.
 */

public class MascotasFavoritas extends AppCompatActivity{
    private List mascotas;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void  onCreate(Bundle savedInstanceState){
     super.onCreate(savedInstanceState);
        setContentView(R.layout.mascotas_favoritas);
        Toolbar actionBar = (Toolbar) findViewById(R.id.miactionbar);
        setSupportActionBar(actionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        inicializaMascotas();

        this.recyclerView = (RecyclerView) findViewById(R.id.rvfavoritas);
        this.recyclerView.setHasFixedSize(true);
        this.layoutManager = new LinearLayoutManager(this);
        this.recyclerView.setLayoutManager(this.layoutManager);
        this.adapter = new AdaptadorMascotas(this.mascotas);
        this.recyclerView.setAdapter(this.adapter);

    }

    private void inicializaMascotas(){
        this.mascotas = new ArrayList();
        this.mascotas.add(new Mascota("Hachiko", 0, R.drawable.shibainu));
        this.mascotas.add(new Mascota("Pilón", 0, R.drawable.schnauzer_black));
        this.mascotas.add(new Mascota("Toby", 0, R.drawable.schnauzer_blackandpepper));
        this.mascotas.add(new Mascota("Kiby", 0, R.drawable.hamster));
        this.mascotas.add(new Mascota("Mu", 0, R.drawable.mouse));
    }

}
