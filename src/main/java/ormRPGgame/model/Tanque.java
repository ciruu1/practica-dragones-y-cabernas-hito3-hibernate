package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "tanque")
public class Tanque {
    @Id
    @Column(name = "id_t", nullable = false)
    private int id_t;
    
    @Column(name = "mana", nullable = false)
    private int mana;
    
    @Column(name = "fuerza", nullable = false)
    private int fuerza;
    
    @ManyToMany(mappedBy = "tanques")
    private Set<Hacha> hachas;

    @ManyToOne
    @JoinColumn(name = "nombre_p")
    private Personaje nombre_p;

    public Tanque(int id_t, int mana, int fuerza, Personaje nombre_p) {
        this.id_t = id_t;
        this.mana = mana;
        this.fuerza = fuerza;
        this.nombre_p = nombre_p;
    }

    public Tanque() {

    }

    public int getId_t() {
        return id_t;
    }

    public int getMana() {
        return mana;
    }

    public int getFuerza() {
        return fuerza;
    }

    public Personaje getNombre_p() {
        return nombre_p;
    }

    public void setId_t(int id_t) {
        this.id_t = id_t;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setNombre_p(Personaje nombre_p) {
        this.nombre_p = nombre_p;
    }
}
