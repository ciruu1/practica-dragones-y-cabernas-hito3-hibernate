package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// @TODO completar las anotaciones de la clase
@Entity
@Table(name = "mago")
public class Mago {
    // @TODO completar las anotaciones de todos los atributos
    
    @Id
    @Column(name = "id_m", nullable = false)
    private int id_m;
    
    @Column(name = "mana", nullable = false)
    private int mana;
    
    @Column(name = "fuerza", nullable = false)
    private int fuerza;
    
    @ManyToMany(mappedBy = "magos")
    private Set<Baculo> baculos;
    
    @ManyToMany(mappedBy = "magos1")
    private Set<Espectro> espectros;
    
    @ManyToOne
    @JoinColumn(name = "nombre_p")
    private Personaje nombre_p;

    public Mago(int id_m, int mana, int fuerza, Personaje nombre_p) {
        this.id_m = id_m;
        this.mana = mana;
        this.fuerza = fuerza;
        this.nombre_p = nombre_p;
    }

    public Mago() {

    }

    public int getId_m() {
        return id_m;
    }

    public int getMana() {
        return mana;
    }

    public int getFuerza() {
        return fuerza;
    }

    public Personaje getNombre_p() {
        return nombre_p;
    }

    public void setId_m(int id_m) {
        this.id_m = id_m;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setNombre_p(Personaje nombre_p) {
        this.nombre_p = nombre_p;
    }
}
