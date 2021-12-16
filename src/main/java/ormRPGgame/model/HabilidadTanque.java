package ormRPGgame.model;

public class HabilidadTanque {
    private String nombre_ht;
    private String descripcion;

    public HabilidadTanque(String nombre_ht, String descripcion) {
        this.nombre_ht = nombre_ht;
        this.descripcion = descripcion;
    }

    public String getNombre_ht() {
        return nombre_ht;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
