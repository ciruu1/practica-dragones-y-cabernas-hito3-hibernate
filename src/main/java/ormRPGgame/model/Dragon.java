package ormRPGgame.model;

public class Dragon {
    private String nombre_dr;
    private int vida;
    private int recompensa;

    public Dragon(String nombre_dr, int vida, int recompensa) {
        this.nombre_dr = nombre_dr;
        this.vida = vida;
        this.recompensa = recompensa;
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
}
