package ormRPGgame.model;

public class Tanque {
    private int id_t;
    private int mana;
    private int fuerza;
    private String nombre_p;

    public Tanque(int id_t, int mana, int fuerza, String nombre_p) {
        this.id_t = id_t;
        this.mana = mana;
        this.fuerza = fuerza;
        this.nombre_p = nombre_p;
    }

    public int getId_t() {
        return id_t;
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
