package ormRPGgame.model;

public class PoseeG {
    private int id_g;
    private String nombre_hg;

    public PoseeG(int id_g, String nombre_hg) {
        this.id_g = id_g;
        this.nombre_hg = nombre_hg;
    }

    public int getId_g() {
        return id_g;
    }

    public String getNombre_hg() {
        return nombre_hg;
    }
}
