package ormRPGgame.model;

public class Tienda {
    private String nombre_t;
    private String nombre_c;

    public Tienda(String nombre_t, String nombre_c) {
        this.nombre_t = nombre_t;
        this.nombre_c = nombre_c;
    }

    public String getNombre_t() {
        return nombre_t;
    }

    public String getNombre_c() {
        return nombre_c;
    }
}
