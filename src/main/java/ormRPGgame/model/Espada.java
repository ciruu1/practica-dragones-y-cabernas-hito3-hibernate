package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "espada")
public class Espada {
    @Id
    @Column(name = "nombre_e", nullable = false)
    private String nombre_e;
    
    @Column(name = "peso", nullable = false)
    private int peso;
    
    @Column(name = "damage", nullable = false)
    private int damage; // Daño

    public Espada(String nombre_e, int peso, int damage) {
        this.nombre_e = nombre_e;
        this.peso = peso;
        this.damage = damage;
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
}
