package ormRPGgame.model;

public class PoseeEsc {
    private String nombre_p;
    private String nombre_esc;

    public PoseeEsc(String nombre_p, String nombre_esc) {
        this.nombre_p = nombre_p;
        this.nombre_esc = nombre_esc;
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public String getNombre_esc() {
        return nombre_esc;
    }
}
