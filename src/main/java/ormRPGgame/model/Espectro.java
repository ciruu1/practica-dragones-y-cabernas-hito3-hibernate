package ormRPGgame.model;

public class Espectro {
    private int codigo_e;
    private String nombre;
    private int vida;
    private int recompensa;

    public Espectro(int codigo_e, String nombre, int vida, int recompensa) {
        this.codigo_e = codigo_e;
        this.nombre = nombre;
        this.vida = vida;
        this.recompensa = recompensa;
    }

    public int getCodigo_e() {
        return codigo_e;
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
