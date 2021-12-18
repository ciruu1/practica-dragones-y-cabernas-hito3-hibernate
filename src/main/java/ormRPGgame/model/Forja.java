package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "forja")
public class Forja {
    @Id
    @Column(name = "nombre_f", nullable = false)
    private String nombre_f;
    
    @Column(name = "dueño", nullable = false)
    private String owner; // Dueño

    @ManyToOne
    @JoinColumn(name = "nombre_c")
    private Ciudad nombre_c;

    public Forja(String nombre_f, String owner, Ciudad nombre_c) {
        this.nombre_f = nombre_f;
        this.owner = owner;
        this.nombre_c = nombre_c;
    }

    public Forja() {

    }

    public String getNombre_f() {
        return nombre_f;
    }

    public String getOwner() {
        return owner;
    }

    public Ciudad getNombre_c() {
        return nombre_c;
    }

    public void setNombre_f(String nombre_f) {
        this.nombre_f = nombre_f;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setNombre_c(Ciudad nombre_c) {
        this.nombre_c = nombre_c;
    }
}
