package ormRPGgame.model;

public class MejoraBaculo {
    private String nombre_f;
    private String nombre_b;
    private String nombre_p;

    public MejoraBaculo(String nombre_f, String nombre_b, String nombre_p) {
        this.nombre_f = nombre_f;
        this.nombre_b = nombre_b;
        this.nombre_p = nombre_p;
    }

    public String getNombre_f() {
        return nombre_f;
    }

    public String getNombre_b() {
        return nombre_b;
    }

    public String getNombre_p() {
        return nombre_p;
    }
}
