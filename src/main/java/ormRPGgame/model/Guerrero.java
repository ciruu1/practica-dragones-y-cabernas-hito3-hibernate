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
    
    @Column(name = "nombre_p", nullable = false)
    private String nombre_p;

    public Guerrero(int id_g, int mana, int fuerza, String nombre_p) {
        this.id_g = id_g;
        this.mana = mana;
        this.fuerza = fuerza;
        this.nombre_p = nombre_p;
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

    public String getNombre_p() {
        return nombre_p;
    }
}
