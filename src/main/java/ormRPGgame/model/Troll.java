package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "troll")
public class Troll {
    @Id
    @Column(name = "codigo_t", nullable = false)
    private int codigo_t;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Column(name = "vida", nullable = false)
    private int vida;
    
    @Column(name = "recompensa", nullable = false)
    private int recompensa;

    public Troll(int codigo_t, String nombre, int vida, int recompensa) {
        this.codigo_t = codigo_t;
        this.nombre = nombre;
        this.vida = vida;
        this.recompensa = recompensa;
    }

    public Troll() {

    }

    public int getCodigo_t() {
        return codigo_t;
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

    public void setCodigo_t(int codigo_t) {
        this.codigo_t = codigo_t;
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
