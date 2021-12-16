package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "forja")
public class Forja {
    @Id
    @Column(name = "nombre_f", nullable = false)
    private String nombre_f;
    
    @Column(name = "owner", nullable = false)
    private String owner; // Dueño
    
    @Column(name = "nombre_c", nullable = false)
    private String nombre_c;

    public Forja(String nombre_f, String owner, String nombre_c) {
        this.nombre_f = nombre_f;
        this.owner = owner;
        this.nombre_c = nombre_c;
    }

    public String getNombre_f() {
        return nombre_f;
    }

    public String getOwner() {
        return owner;
    }

    public String getNombre_c() {
        return nombre_c;
    }
}
