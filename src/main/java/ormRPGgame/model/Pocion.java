package ormRPGgame.model;

public class Pocion {
    private int codigo_po;
    private int mana;
    private int vida;

    public Pocion(int codigo_po, int mana, int vida) {
        this.codigo_po = codigo_po;
        this.mana = mana;
        this.vida = vida;
    }

    public int getCodigo_po() {
        return codigo_po;
    }

    public int getMana() {
        return mana;
    }

    public int getVida() {
        return vida;
    }
}
