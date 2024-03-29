package ormRPGgame.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "espada")
public class Espada {
    @Id
    @Column(name = "nombre_e", nullable = false)
    private String nombre_e;
    
    @Column(name = "peso", nullable = false)
    private int peso;
    
    @Column(name = "daño", nullable = false)
    private int damage; // Daño

    @OneToOne
    @JoinColumn(name = "id_g")
    private Guerrero id_g;

    public Espada(String nombre_e, int peso, int damage) {
        this.nombre_e = nombre_e;
        this.peso = peso;
        this.damage = damage;
    }

    public Espada() {

    }

    public String getNombre_e() {
        return nombre_e;
    }

    public int getPeso() {
        return peso;
    }

    public int getDamage() {
        return damage;
    }

    public void setNombre_e(String nombre_e) {
        this.nombre_e = nombre_e;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Guerrero getId_g() {
        return id_g;
    }

    public void setId_g(Guerrero id_g) {
        this.id_g = id_g;
    }
}
