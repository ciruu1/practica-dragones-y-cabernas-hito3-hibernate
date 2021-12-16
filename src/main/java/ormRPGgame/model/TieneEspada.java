package ormRPGgame.model;

public class TieneEspada {
    private int id_g;
    private String nombre_e;

    public TieneEspada(int id_g, String nombre_e) {
        this.id_g = id_g;
        this.nombre_e = nombre_e;
    }

    public int getId_g() {
        return id_g;
    }

    public String getNombre_e() {
        return nombre_e;
    }
}
