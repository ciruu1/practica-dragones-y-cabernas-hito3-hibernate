package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "habilidadMago")
public class HabilidadMago {
    @Id
    @Column(name = "nombre_hm", nullable = false)
    private String nombre_hm;
    
    @Column(name = "descripcion, nullable = false)
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
