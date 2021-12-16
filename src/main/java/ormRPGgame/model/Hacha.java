package ormRPGgame.model;

public class Hacha {
    private String nombre_h;
    private int peso;
    private int damage; // Daño

    public Hacha(String nombre_h, int peso, int damage) {
        this.nombre_h = nombre_h;
        this.peso = peso;
        this.damage = damage;
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
}
