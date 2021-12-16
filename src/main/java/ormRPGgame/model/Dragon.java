package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "dragon")
public class Dragon {
    @Id
    @Column(name = "nombre_dr", nullable = false)
    private String nombre_dr;
    
    @Column(name = "vida", nullable = false)
    private int vida;
    
    @Column(name = "recompensa", nullable = false)
    private int recompensa;

    public Dragon(String nombre_dr, int vida, int recompensa) {
        this.nombre_dr = nombre_dr;
        this.vida = vida;
        this.recompensa = recompensa;
    }

    public String getNombre_dr() {
        return nombre_dr;
    }

    public int getVida() {
        return vida;
    }

    public int getRecompensa() {
        return recompensa;
    }
}
