package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "espectro")
public class Espectro {
    @Id
    @Column(name = "codigo_e", nullable = false)
    private int codigo_e;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Column(name = "vida", nullable = false)
    private int vida;
    
    @Column(name = "recompensa", nullable = false)
    private int recompensa;

    public Espectro(int codigo_e, String nombre, int vida, int recompensa) {
        this.codigo_e = codigo_e;
        this.nombre = nombre;
        this.vida = vida;
        this.recompensa = recompensa;
    }

    public int getCodigo_e() {
        return codigo_e;
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
