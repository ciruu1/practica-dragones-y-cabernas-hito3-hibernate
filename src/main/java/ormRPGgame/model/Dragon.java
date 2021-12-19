package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "dragon")
public class Dragon {
    @Id
    @Column(name = "nombre_dr", nullable = false, unique = true)
    private String nombre_dr;
    
    @Column(name = "vida", nullable = false)
    private int vida;
    
    @Column(name = "recompensa", nullable = false)
    private int recompensa;

    @ManyToMany
    @JoinColumn(name = "nombre_esc")
    private Set<Escuadron> nombre_esc;

    public Dragon(String nombre_dr, int vida, int recompensa) {
        this.nombre_dr = nombre_dr;
        this.vida = vida;
        this.recompensa = recompensa;
        this.nombre_esc = new HashSet<>();
    }

    public Dragon() {
        this.nombre_esc = new HashSet<>();
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

    public void setNombre_dr(String nombre_dr) {
        this.nombre_dr = nombre_dr;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    public Set<Escuadron> getNombre_esc() {
        return nombre_esc;
    }

    public void addNombre_esc(Escuadron escuadron) {
        this.nombre_esc.add(escuadron);
    }
}
