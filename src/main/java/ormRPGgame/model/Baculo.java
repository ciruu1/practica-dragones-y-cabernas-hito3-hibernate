package ormRPGgame.model;

public class Baculo {
    private String nombre_b;m
    private int peso;
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
