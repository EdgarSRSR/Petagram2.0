package com.solrom.edgar.petagram20;

/**
 * Created by edgarsr on 08/09/17.
 */

public class Mascota {
    private String nombre;
    private int numlikes;
    private int foto;

    public Mascota(String nombre, int numlikes, int foto){
        this.nombre = nombre;
        this.numlikes = numlikes;
        this.foto = foto;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getNumlikes() {
        return numlikes;
    }

    public void setNumlikes(int numlikes) {
        this.numlikes = numlikes;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
