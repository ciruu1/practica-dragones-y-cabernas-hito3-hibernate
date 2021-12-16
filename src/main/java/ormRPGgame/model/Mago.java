package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// @TODO completar las anotaciones de la clase

public class Mago {
    // @TODO completar las anotaciones de todos los atributos

    private int id_m;
    private int mana;
    private int fuerza;
    private String nombre_p;
    private Daga daga;

    public Mago(int id_m, int mana, int fuerza, String nombre_p, Daga daga) {
        this.id_m = id_m;
        this.mana = mana;
        this.fuerza = fuerza;
        this.nombre_p = nombre_p;
        this.daga = daga;
    }

    public int getId_m() {
        return id_m;
    }

    public int getMana() {
        return mana;
    }

    public int getFuerza() {
        return fuerza;
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public Daga getDaga() {
        return daga;
    }

}
