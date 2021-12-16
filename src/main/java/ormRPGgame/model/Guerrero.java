package ormRPGgame.model;

public class Guerrero {
    private int id_g;
    private int mana;
    private int fuerza;
    private String nombre_p;

    public Guerrero(int id_g, int mana, int fuerza, String nombre_p) {
        this.id_g = id_g;
        this.mana = mana;
        this.fuerza = fuerza;
        this.nombre_p = nombre_p;
    }

    public int getId_g() {
        return id_g;
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
}
