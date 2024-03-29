package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "espectro")
public class Espectro {
    @Id
    @Column(name = "codigo_e", nullable = false)
    private int codigo_e;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Column(name = "vida", nullable = false)
    private int vida;
    
    @Column(name = "recompensa", nullable = false)
    private int recompensa;

    @ManyToMany
    @JoinColumn(name = "id_m")
    private Set<Mago> id_m;

    public Espectro(int codigo_e, String nombre, int vida, int recompensa) {
        this.codigo_e = codigo_e;
        this.nombre = nombre;
        this.vida = vida;
        this.recompensa = recompensa;
        this.id_m = new HashSet<>();
    }

    public Espectro() {
        this.id_m = new HashSet<>();
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

    public void setCodigo_e(int codigo_e) {
        this.codigo_e = codigo_e;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    public Set<Mago> getId_m() {
        return id_m;
    }

    public void addId_m(Mago id_m) {
        this.id_m.add(id_m);
    }
}
