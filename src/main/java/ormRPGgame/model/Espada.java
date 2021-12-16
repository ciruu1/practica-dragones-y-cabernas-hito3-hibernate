package ormRPGgame.model;

public class Espada {
    private String nombre_e;
    private int peso;
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
