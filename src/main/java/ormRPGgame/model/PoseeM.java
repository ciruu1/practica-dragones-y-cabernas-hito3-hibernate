package ormRPGgame.model;

public class PoseeM {
    private int id_m;
    private String nombre_hm;

    public PoseeM(int id_m, String nombre_hm) {
        this.id_m = id_m;
        this.nombre_hm = nombre_hm;
    }

    public int getId_m() {
        return id_m;
    }

    public String getNombre_hm() {
        return nombre_hm;
    }
}
