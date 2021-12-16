package ormRPGgame.model;

public class Troll {
    private int codigo_t;
    private String nombre;
    private int vida;
    private int recompensa;

    public Troll(int codigo_t, String nombre, int vida, int recompensa) {
        this.codigo_t = codigo_t;
        this.nombre = nombre;
        this.vida = vida;
        this.recompensa = recompensa;
    }

    public int getCodigo_t() {
        return codigo_t;
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
