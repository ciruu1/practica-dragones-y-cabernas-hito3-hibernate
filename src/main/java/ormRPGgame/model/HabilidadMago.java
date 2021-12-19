package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "habilidad_mago")
public class HabilidadMago {
    @Id
    @Column(name = "nombre_hm", nullable = false)
    private String nombre_hm;
    
    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @ManyToMany()
    @JoinTable(name = "id_m")
    private Set<Mago> id_m;

    public HabilidadMago(String nombre_hm, String descripcion) {
        this.nombre_hm = nombre_hm;
        this.descripcion = descripcion;
        id_m = new HashSet<>();
    }

    public HabilidadMago() {
        id_m = new HashSet<>();
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

    public Set<Mago> getId_m() {
        return id_m;
    }

    public void addId_m(Mago id_m) {
        this.id_m.add(id_m);
    }
}
