package ormRPGgame.model;

public class HabilidadMago {
    private String nombre_hm;
    private String descripcion;

    public HabilidadMago(String nombre_hm, String descripcion) {
        this.nombre_hm = nombre_hm;
        this.descripcion = descripcion;
    }

    public String getNombre_hm() {
        return nombre_hm;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
