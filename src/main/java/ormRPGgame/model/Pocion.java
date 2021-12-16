package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "pocion")
public class Pocion {
    @Id
    @Column(name = "codigo_po", nullable = false)
    private int codigo_po;
    
    @Column(name = "mana", nullable = false)
    private int mana;
    
    @Column(name = "vida", nullable = false)
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
