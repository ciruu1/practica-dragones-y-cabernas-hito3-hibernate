package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "goblin")
public class Goblin {
    @Id
    @Column(name = "codigo_g", nullable = false)
    private int codigo_g;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Column(name = "vida", nullable = false)
    private int vida;
    
    @Column(name = "recompensa", nullable = false)
    private int recompensa;

    public Goblin(int codigo_g, String nombre, int vida, int recompensa) {
        this.codigo_g = codigo_g;
        this.nombre = nombre;
        this.vida = vida;
        this.recompensa = recompensa;
    }

    public int getCodigo_g() {
        return codigo_g;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getRecompensa() {
        return recompensa;
    }
}
