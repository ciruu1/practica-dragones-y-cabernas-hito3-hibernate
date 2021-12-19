package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "habilidad_mago")
public class HabilidadMago {
    @Id
    @Column(name = "nombre_hm", nullable = false)
    private String nombre_hm;
    
    @Column(name = "descripcion", nullable = false)
    private String descripcion;


    public HabilidadMago(String nombre_hm, String descripcion) {
        this.nombre_hm = nombre_hm;
        this.descripcion = descripcion;
    }

    public HabilidadMago() {

    }

    public String getNombre_hm() {
        return nombre_hm;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre_hm(String nombre_hm) {
        this.nombre_hm = nombre_hm;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
