package ormRPGgame.model;

public class PerteneceG {
    private String nombre_esc;
    private int id_g;

    public PerteneceG(String nombre_esc, int id_g) {
        this.nombre_esc = nombre_esc;
        this.id_g = id_g;
    }

    public String getNombre_esc() {
        return nombre_esc;
    }

    public int getId_g() {
        return id_g;
    }
}
