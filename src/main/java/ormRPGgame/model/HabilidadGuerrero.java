package ormRPGgame.model;

public class HabilidadGuerrero {
    private String nombre_hg;
    private String descripcion;

    public HabilidadGuerrero(String nombre_hg, String descripcion) {
        this.nombre_hg = nombre_hg;
        this.descripcion = descripcion;
    }

    public String getNombre_hg() {
        return nombre_hg;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
