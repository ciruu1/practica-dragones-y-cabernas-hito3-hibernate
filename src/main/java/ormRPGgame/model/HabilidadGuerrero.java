package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "habilidad_guerrero")
public class HabilidadGuerrero {
    @Id
    @Column(name = "nombre_hg", nullable = false)
    private String nombre_hg;
    
    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @ManyToMany()
    @JoinTable(name = "id_g")
    private Set<Guerrero> id_g;

    public HabilidadGuerrero(String nombre_hg, String descripcion) {
        this.nombre_hg = nombre_hg;
        this.descripcion = descripcion;
        id_g = new HashSet<>();
    }

    public HabilidadGuerrero() {
        id_g = new HashSet<>();
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

    public Set<Guerrero> getId_g() {
        return id_g;
    }

    public void addId_g(Guerrero id_g) {
        this.id_g.add(id_g);
    }
}
