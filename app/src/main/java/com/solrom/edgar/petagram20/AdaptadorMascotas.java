package com.solrom.edgar.petagram20;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edgarsr on 08/09/17.
 */

public class AdaptadorMascotas extends RecyclerView.Adapter<AdaptadorMascotas.AdaptadorViewHolder>{

    List<Mascota> mascotas;
    Activity activity;

    public AdaptadorMascotas(List mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;

    }

    public AdaptadorMascotas(List mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public AdaptadorViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas, parent,false);
        return new AdaptadorViewHolder(v);

    }

    @Override
    public void onBindViewHolder(AdaptadorViewHolder mascotaViewHolder,int position){
        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.tvNombreMascota.setText(mascota.getNombre());
        mascotaViewHolder.numLikesMascota.setText(Integer.toString(mascota.getNumlikes()));
        mascotaViewHolder.imgMascota.setImageResource(mascota.getFoto());
        mascotaViewHolder.btnLike.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(activity, "Diste like a " + mascota.getNombre(), Toast.LENGTH_SHORT).show();
            }

        });
    }

    @Override
    public int getItemCount(){
        return mascotas.size();
    }

    public static class AdaptadorViewHolder extends RecyclerView.ViewHolder{
        private TextView tvNombreMascota;
        private TextView numLikesMascota;
        private ImageView imgMascota;
        private ImageButton btnLike;

        public AdaptadorViewHolder(View itemView){
            super(itemView);
            imgMascota = (ImageView) itemView.findViewById(R.id.imgMascota);
            tvNombreMascota = (TextView) itemView.findViewById(R.id.tvNombreMascota);
            numLikesMascota = (TextView) itemView.findViewById(R.id.numLikesMascota);
            btnLike = (ImageButton) itemView.findViewById(R.id.btnlike);
        }
    }
}
