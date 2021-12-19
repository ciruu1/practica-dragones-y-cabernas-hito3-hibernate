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

    @ManyToMany()
    @JoinTable(name = "DerrotaGoblin")
    private Set<Guerrero> guerr;
    
    public Goblin(int codigo_g, String nombre, int vida, int recompensa) {
        this.codigo_g = codigo_g;
        this.nombre = nombre;
        this.vida = vida;
        this.recompensa = recompensa;
    }

    public Goblin() {

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

    public void setCodigo_g(int codigo_g) {
        this.codigo_g = codigo_g;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }
}
