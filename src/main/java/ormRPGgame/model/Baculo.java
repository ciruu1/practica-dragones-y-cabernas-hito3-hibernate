package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "baculo")
public class Baculo {
    @Id
    @Column(name = "nombre_b", nullable = false, unique = true)
    private String nombre_b;

    @Column(name = "peso", nullable = false)
    private int peso;

    @Column(name = "daño", nullable = false)
    private int damage;

    @OneToOne()
    @JoinTable(name = "id_m")
    private Mago id_m;

    public Baculo(String nombre_b, int peso, int damage) {
        this.nombre_b = nombre_b;
        this.peso = peso;
        this.damage = damage;
    }

    public Baculo() {

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

    public void setNombre_b(String nombre_b) {
        this.nombre_b = nombre_b;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Mago getId_m() {
        return id_m;
    }

    public void setId_m(Mago id_m) {
        this.id_m = id_m;
    }
}
