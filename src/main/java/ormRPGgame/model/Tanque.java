package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tanque")
public class Tanque {
    @Id
    @Column(name = "id_t", nullable = false)
    private int id_t;
    
    @Column(name = "mana", nullable = false)
    private int mana;
    
    @Column(name = "fuerza", nullable = false)
    private int fuerza;

    @ManyToOne
    @JoinColumn(name = "nombre_p")
    private Personaje nombre_p;

    @ManyToMany
    @JoinColumn(name = "codigo_t")
    private Set<Troll> codigo_t;

    @ManyToMany
    @JoinColumn(name = "nombre_ht")
    private Set<HabilidadTanque> nombre_ht;

    @ManyToMany
    @JoinColumn(name = "nombre_h")
    private Set<Hacha> nombre_h;

    @ManyToMany
    @JoinColumn(name = "nombre_esc")
    private Set<Escuadron> nombre_esc;

    public Tanque(int id_t, int mana, int fuerza, Personaje nombre_p) {
        this.id_t = id_t;
        this.mana = mana;
        this.fuerza = fuerza;
        this.nombre_p = nombre_p;
        codigo_t = new HashSet<>();
        nombre_ht = new HashSet<>();
        nombre_h = new HashSet<>();
        nombre_esc = new HashSet<>();
    }

    public Tanque() {
        codigo_t = new HashSet<>();
        nombre_ht = new HashSet<>();
        nombre_h = new HashSet<>();
        nombre_esc = new HashSet<>();
    }

    public int getId_t() {
        return id_t;
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

    public void setId_t(int id_t) {
        this.id_t = id_t;
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

    public Set<Troll> getCodigo_t() {
        return codigo_t;
    }

    public void addCodigo_t(Troll codigo_t) {
        this.codigo_t.add(codigo_t);
    }

    public Set<HabilidadTanque> getNombre_ht() {
        return nombre_ht;
    }

    public void addNombre_ht(HabilidadTanque nombre_ht) {
        this.nombre_ht.add(nombre_ht);
    }

    public Set<Hacha> getNombre_h() {
        return nombre_h;
    }

    public void addNombre_h(Hacha nombre_h) {
        this.nombre_h.add(nombre_h);
    }

    public Set<Escuadron> getNombre_esc() {
        return nombre_esc;
    }

    public void addNombre_esc(Escuadron nombre_esc) {
        this.nombre_esc.add(nombre_esc);
    }
}
