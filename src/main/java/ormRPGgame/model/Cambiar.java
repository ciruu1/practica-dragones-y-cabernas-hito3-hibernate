package ormRPGgame.model;

public class Cambiar {
    private String nombre_t;
    private String nombre_p;
    private String nombre_d;

    public Cambiar(String nombre_t, String nombre_p, String nombre_d) {
        this.nombre_t = nombre_t;
        this.nombre_p = nombre_p;
        this.nombre_d = nombre_d;
    }

    public String getNombre_t() {
        return nombre_t;
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public String getNombre_d() {
        return nombre_d;
    }
}
