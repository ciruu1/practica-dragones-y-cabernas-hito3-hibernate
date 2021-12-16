package ormRPGgame.model;

public class Lucha {
    private String nombre_dr;
    private String nombre_esc;

    public Lucha(String nombre_dr, String nombre_esc) {
        this.nombre_dr = nombre_dr;
        this.nombre_esc = nombre_esc;
    }

    public String getNombre_dr() {
        return nombre_dr;
    }

    public String getNombre_esc() {
        return nombre_esc;
    }
}
