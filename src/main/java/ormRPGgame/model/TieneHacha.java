package ormRPGgame.model;

public class TieneHacha {
    private int id_t;
    private String nombre_h;

    public TieneHacha(int id_t, String nombre_h) {
        this.id_t = id_t;
        this.nombre_h = nombre_h;
    }

    public int getId_t() {
        return id_t;
    }

    public String getNombre_h() {
        return nombre_h;
    }
}
