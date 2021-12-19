package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "hacha")
public class Hacha {
    @Id
    @Column(name = "nombre_h", nullable = false)
    private String nombre_h;
    
    @Column(name = "peso", nullable = false)
    private int peso;
    
    @Column(name = "daño", nullable = false)
    private int damage; // Daño

    public Hacha(String nombre_h, int peso, int damage) {
        this.nombre_h = nombre_h;
        this.peso = peso;
        this.damage = damage;
    }

    public Hacha() {

    }

    public String getNombre_h() {
        return nombre_h;
    }

    public int getPeso() {
        return peso;
    }

    public int getDamage() {
        return damage;
    }

    public void setNombre_h(String nombre_h) {
        this.nombre_h = nombre_h;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
