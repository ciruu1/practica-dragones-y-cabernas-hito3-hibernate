package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "guerrero")
public class Guerrero {
    @Id
    @Column(name = "id_g", nullable = false)
    private int id_g;
    
    @Column(name = "mana", nullable = false)
    private int mana;
    
    @Column(name = "fuerza", nullable = false)
    private int fuerza;
    
    @ManyToMany(mappedBy = "guerreros")
    private Set<Espada> espadas;
    
    @ManyToMany(mappedBy = "guerr")
    private Set<Goblin> goblins;

    @ManyToOne
    @JoinColumn(name = "nombre_p")
    private Personaje nombre_p;

    public Guerrero(int id_g, int mana, int fuerza, Personaje nombre_p) {
        this.id_g = id_g;
        this.mana = mana;
        this.fuerza = fuerza;
        this.nombre_p = nombre_p;
    }

    public Guerrero() {

    }

    public int getId_g() {
        return id_g;
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

    public void setId_g(int id_g) {
        this.id_g = id_g;
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
