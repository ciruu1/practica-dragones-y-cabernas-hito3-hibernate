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
    
    @ManyToOne
    @JoinColumn(name = "nombre_p")
    private Personaje nombre_p;

    @OneToMany
    @JoinColumn(name = "codigo_e")
    private Set<Espectro> codigo_e;

    @OneToMany
    @JoinColumn(name = "nombre_hm")
    private Set<HabilidadMago> nombre_hm;

    @OneToMany
    @JoinColumn(name = "nombre_b")
    private Set<Baculo> nombre_b;

    @OneToMany
    @JoinColumn(name = "nombre_esc")
    private Set<Escuadron> nombre_esc;

    public Mago(int id_m, int mana, int fuerza, Personaje nombre_p) {
        this.id_m = id_m;
        this.mana = mana;
        this.fuerza = fuerza;
        this.nombre_p = nombre_p;
        codigo_e = new HashSet<>();
        nombre_hm = new HashSet<>();
        nombre_b = new HashSet<>();
        nombre_esc = new HashSet<>();
    }

    public Mago() {
        codigo_e = new HashSet<>();
        nombre_hm = new HashSet<>();
        nombre_b = new HashSet<>();
        nombre_esc = new HashSet<>();
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

    public Set<Espectro> getCodigo_e() {
        return codigo_e;
    }

    public void addCodigo_e(Espectro codigo_e) {
        this.codigo_e.add(codigo_e);
    }

    public Set<HabilidadMago> getNombre_hm() {
        return nombre_hm;
    }

    public void addNombre_hm(HabilidadMago nombre_hm) {
        this.nombre_hm.add(nombre_hm);
    }

    public Set<Baculo> getNombre_b() {
        return nombre_b;
    }

    public void addNombre_b(Baculo nombre_b) {
        this.nombre_b.add(nombre_b);
    }

    public Set<Escuadron> getNombre_esc() {
        return nombre_esc;
    }

    public void addNombre_esc(Escuadron nombre_esc) {
        this.nombre_esc.add(nombre_esc);
    }
}
