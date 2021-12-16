package ormRPGgame.model;

public class Goblin {
    private int codigo_g;
    private String nombre;
    private int vida;
    private int recompensa;

    public Goblin(int codigo_g, String nombre, int vida, int recompensa) {
        this.codigo_g = codigo_g;
        this.nombre = nombre;
        this.vida = vida;
        this.recompensa = recompensa;
    }

    public int getCodigo_g() {
        return codigo_g;
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
}
