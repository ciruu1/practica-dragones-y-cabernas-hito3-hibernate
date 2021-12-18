package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "mejora_baculo")
public class MejoraBaculo {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "nombre_f")
    private Forja nombre_f;

    @ManyToOne
    @JoinColumn(name = "nombre_b")
    private Baculo nombre_b;

    @ManyToOne
    @JoinColumn(name = "nombre_p")
    private Personaje nombre_p;

    public MejoraBaculo(Forja nombre_f, Baculo nombre_b, Personaje nombre_p) {
        this.nombre_f = nombre_f;
        this.nombre_b = nombre_b;
        this.nombre_p = nombre_p;
    }

    public MejoraBaculo() {

    }

    public Forja getNombre_f() {
        return nombre_f;
    }

    public Baculo getNombre_b() {
        return nombre_b;
    }

    public Personaje getNombre_p() {
        return nombre_p;
    }

    public void setNombre_f(Forja nombre_f) {
        this.nombre_f = nombre_f;
    }

    public void setNombre_b(Baculo nombre_b) {
        this.nombre_b = nombre_b;
    }

    public void setNombre_p(Personaje nombre_p) {
        this.nombre_p = nombre_p;
    }
}
