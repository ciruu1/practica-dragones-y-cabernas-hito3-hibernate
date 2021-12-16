package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "habilidadGuerrero")
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

    public String getNombre_hg() {
        return nombre_hg;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
