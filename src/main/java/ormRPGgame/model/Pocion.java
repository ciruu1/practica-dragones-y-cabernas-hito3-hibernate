package ormRPGgame.model;

import javax.persistence.*;
import java.util.Set;

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

    @ManyToOne
    @JoinColumn(name = "nombre_p")
    private Personaje nombre_p;

    public Pocion(int codigo_po, int mana, int vida) {
        this.codigo_po = codigo_po;
        this.mana = mana;
        this.vida = vida;
    }

    public Pocion() {

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

    public void setCodigo_po(int codigo_po) {
        this.codigo_po = codigo_po;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Personaje getNombre_p() {
        return nombre_p;
    }

    public void setNombre_p(Personaje nombre_p) {
        this.nombre_p = nombre_p;
    }
}
