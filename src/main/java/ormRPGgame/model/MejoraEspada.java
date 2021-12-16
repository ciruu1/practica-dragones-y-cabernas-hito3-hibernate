package ormRPGgame.model;

public class MejoraEspada {
    private String nombre_f;
    private String nombre_e;
    private String nombre_p;

    public MejoraEspada(String nombre_f, String nombre_e, String nombre_p) {
        this.nombre_f = nombre_f;
        this.nombre_e = nombre_e;
        this.nombre_p = nombre_p;
    }

    public String getNombre_f() {
        return nombre_f;
    }

    public String getNombre_e() {
        return nombre_e;
    }

    public String getNombre_p() {
        return nombre_p;
    }
}
