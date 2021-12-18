package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "habilidadTanque")
public class HabilidadTanque {
    @Id
    @Column(name = "nombre_ht", nullable = false)
    private String nombre_ht;
    
    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    public HabilidadTanque(String nombre_ht, String descripcion) {
        this.nombre_ht = nombre_ht;
        this.descripcion = descripcion;
    }

    public HabilidadTanque() {

    }

    public String getNombre_ht() {
        return nombre_ht;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre_ht(String nombre_ht) {
        this.nombre_ht = nombre_ht;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
