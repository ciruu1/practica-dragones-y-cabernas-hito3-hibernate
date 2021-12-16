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
    
    @Column(name = "nombre_p", nullable = false)
    private String nombre_p;

    public Tanque(int id_t, int mana, int fuerza, String nombre_p) {
        this.id_t = id_t;
        this.mana = mana;
        this.fuerza = fuerza;
        this.nombre_p = nombre_p;
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

    public String getNombre_p() {
        return nombre_p;
    }
}
