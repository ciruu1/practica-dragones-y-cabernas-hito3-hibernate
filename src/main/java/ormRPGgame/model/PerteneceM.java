package ormRPGgame.model;

public class PerteneceM {
    private String nombre_esc;
    private int id_m;

    public PerteneceM(String nombre_esc, int id_m) {
        this.nombre_esc = nombre_esc;
        this.id_m = id_m;
    }

    public String getNombre_esc() {
        return nombre_esc;
    }

    public int getId_m() {
        return id_m;
    }
}
