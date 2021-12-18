package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "habilidad_guerrero")
public class HabilidadGuerrero {
    @Id
    @Column(name = "nombre_hg", nullable = false)
    private String nombre_hg;
    
    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    public HabilidadGuerrero(String nombre_hg, String descripcion) {
        this.nombre_hg = nombre_hg;
        this.descripcion = descripcion;
    }

    public HabilidadGuerrero() {

    }

    public String getNombre_hg() {
        return nombre_hg;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre_hg(String nombre_hg) {
        this.nombre_hg = nombre_hg;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
