package ormRPGgame.model;

public class Forja {
    private String nombre_f;
    private String owner; // Dueño
    private String nombre_c;

    public Forja(String nombre_f, String owner, String nombre_c) {
        this.nombre_f = nombre_f;
        this.owner = owner;
        this.nombre_c = nombre_c;
    }

    public String getNombre_f() {
        return nombre_f;
    }

    public String getOwner() {
        return owner;
    }

    public String getNombre_c() {
        return nombre_c;
    }
}
