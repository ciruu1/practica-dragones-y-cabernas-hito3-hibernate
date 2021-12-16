package ormRPGgame.model;

public class PoseeT {
    private int id_t;
    private String nombre_ht;

    public PoseeT(int id_t, String nombre_ht) {
        this.id_t = id_t;
        this.nombre_ht = nombre_ht;
    }

    public int getId_t() {
        return id_t;
    }

    public String getNombre_ht() {
        return nombre_ht;
    }
}
