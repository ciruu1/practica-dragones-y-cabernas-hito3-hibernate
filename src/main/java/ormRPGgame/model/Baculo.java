package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "baculo")
public class Baculo {
    @Id
    @Column(name = "nombre_b", nullable = false)
    private String nombre_b;

    @Column(name = "peso", nullable = false)
    private int peso;

    @Column(name = "daño", nullable = false)
    private int damage;

    public Baculo(String nombre_b, int peso, int damage) {
        this.nombre_b = nombre_b;
        this.peso = peso;
        this.damage = damage;
    }

    public String getNombre_b() {
        return nombre_b;
    }

    public int getPeso() {
        return peso;
    }

    public int getDamage() {
        return damage;
    }
}
