package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "guerrero")
public class Guerrero {
    @Id
    @Column(name = "id_g", nullable = false)
    private int id_g;
    
    @Column(name = "mana", nullable = false)
    private int mana;
    
    @Column(name = "fuerza", nullable = false)
    private int fuerza;

    @OneToOne
    @JoinColumn(name = "nombre_p")
    private Personaje nombre_p;

    @OneToMany
    @JoinColumn(name = "nombre_e")
    private Set<Espada> nombre_e;

    @OneToMany
    @JoinColumn(name = "codigo_g")
    private Set<Goblin> codigo_g;

    @OneToMany
    @JoinColumn(name = "nombre_hg")
    private Set<HabilidadGuerrero> nombre_hg;

    @OneToMany
    @JoinColumn(name = "nombre_esc")
    private Set<Escuadron> nombre_esc;

    public Guerrero(int id_g, int mana, int fuerza, Personaje nombre_p) {
        this.id_g = id_g;
        this.mana = mana;
        this.fuerza = fuerza;
        this.nombre_p = nombre_p;
        this.nombre_e = new HashSet<>();
        this.codigo_g = new HashSet<>();
        this.nombre_hg = new HashSet<>();
        nombre_esc = new HashSet<>();
    }

    public Guerrero() {
        this.nombre_e = new HashSet<>();
        this.codigo_g = new HashSet<>();
        this.nombre_hg = new HashSet<>();
        nombre_esc = new HashSet<>();
    }

    public int getId_g() {
        return id_g;
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

    public void setId_g(int id_g) {
        this.id_g = id_g;
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

    public Set<Espada> getNombre_e() {
        return nombre_e;
    }

    public void addNombre_e(Espada nombre_e) {
        this.nombre_e.add(nombre_e);
    }

    public Set<Goblin> getCodigo_g() {
        return codigo_g;
    }

    public void addCodigo_g(Goblin codigo_g) {
        this.codigo_g.add(codigo_g);
    }

    public Set<HabilidadGuerrero> getNombre_hg() {
        return nombre_hg;
    }

    public void addNombre_hg(HabilidadGuerrero nombre_hg) {
        this.nombre_hg.add(nombre_hg);
    }

    public Set<Escuadron> getNombre_esc() {
        return nombre_esc;
    }

    public void addNombre_esc(Escuadron nombre_esc) {
        this.nombre_esc.add(nombre_esc);
    }
}
