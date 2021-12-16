package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// @TODO completar las anotaciones de la clase
@Entity
@Table(name = "mago")
public class Mago {
    // @TODO completar las anotaciones de todos los atributos

    @Id
    @Column(name = "id_m", nullable = false)
    private int id_m;
    
    @Column(name = "mana", nullable = false)
    private int mana;
    
    @Column(name = "fuerza", nullable = false)
    private int fuerza;
    
    @Column(name = "nombre_p", nullable = false)
    private String nombre_p;
    
    @Column(name = "daga", nullable = false)
    private Daga daga;

    public Mago(int id_m, int mana, int fuerza, String nombre_p, Daga daga) {
        this.id_m = id_m;
        this.mana = mana;
        this.fuerza = fuerza;
        this.nombre_p = nombre_p;
        this.daga = daga;
    }

    public int getId_m() {
        return id_m;
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

    public Daga getDaga() {
        return daga;
    }

}
