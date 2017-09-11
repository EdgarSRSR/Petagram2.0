package com.solrom.edgar.petagram20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miactionbar);
        setSupportActionBar(miActionBar);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();

    }

    public AdaptadorMascotas adaptador;
    public void inicializarAdaptador(){
        adaptador = new AdaptadorMascotas(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public void onMenuItemClick(MenuItem item) {
        if (item.getItemId() == R.id.menu_action_favoritas) {
            irAFavoritas();
        }
    }
    public void irAFavoritas() {
        Intent intent = new Intent(this, MascotasFavoritas.class);
        startActivity(intent);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Hachiko", 0, R.drawable.shibainu));
        mascotas.add(new Mascota("Pilón", 0, R.drawable.schnauzer_black));
        mascotas.add(new Mascota("Toby", 0, R.drawable.schnauzer_blackandpepper));
        mascotas.add(new Mascota("Kiby", 0, R.drawable.hamster));
        mascotas.add(new Mascota("Mu", 0, R.drawable.mouse));
        mascotas.add(new Mascota("Cochon", 0, R.drawable.french_bulldog));



    }
}
