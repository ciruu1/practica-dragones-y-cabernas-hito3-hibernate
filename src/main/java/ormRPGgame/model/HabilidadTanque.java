package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "habilidad_tanque")
public class HabilidadTanque {
    @Id
    @Column(name = "nombre_ht", nullable = false)
    private String nombre_ht;
    
    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @ManyToMany()
    @JoinTable(name = "id_t")
    private Set<Tanque> id_t;

    public HabilidadTanque(String nombre_ht, String descripcion) {
        this.nombre_ht = nombre_ht;
        this.descripcion = descripcion;
        id_t = new HashSet<>();
    }

    public HabilidadTanque() {
        id_t = new HashSet<>();
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

    public Set<Tanque> getId_t() {
        return id_t;
    }

    public void addId_m(Tanque id_t) {
        this.id_t.add(id_t);
    }
}
