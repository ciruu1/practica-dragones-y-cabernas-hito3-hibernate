package ormRPGgame.model;

public class MejoraHacha {
    private String nombre_f;
    private String nombre_h;
    private String nombre_p;

    public MejoraHacha(String nombre_f, String nombre_h, String nombre_p) {
        this.nombre_f = nombre_f;
        this.nombre_h = nombre_h;
        this.nombre_p = nombre_p;
    }

    public String getNombre_f() {
        return nombre_f;
    }

    public String getNombre_h() {
        return nombre_h;
    }

    public String getNombre_p() {
        return nombre_p;
    }
}
