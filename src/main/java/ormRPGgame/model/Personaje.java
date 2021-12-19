package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "personaje")
public class Personaje {
    @Id
    @Column(name = "nombre_p", nullable = false)
    private String nombre_p;
    
    @Column(name = "nivel", nullable = false)
    private int nivel;
    
    @Column(name = "peso", nullable = false)
    private int peso;
    
    @Column(name = "apariencia", nullable = false)
    private String apariencia;
    
    @Column(name = "oroacumulado", nullable = false)
    private int oroacumulado;

    @ManyToOne
    @JoinColumn(name = "nombre_d")
    private Daga nombre_d;

    @ManyToOne
    @JoinColumn(name = "nombre_j")
    private Jugador nombre_j;
    
    @Column(name = "vida", nullable = false)
    private int vida;

    @OneToMany
    @JoinColumn(name = "codigo_po")
    private Set<Pocion> codigo_po;

    @OneToMany
    @JoinColumn(name = "nombre_npc")
    private Set<NPC> nombre_npc;

    public Personaje(String nombre_p, int nivel, int peso, String apariencia, int oroacumulado, Daga nombre_d, Jugador nombre_j, int vida) {
        this.nombre_p = nombre_p;
        this.nivel = nivel;
        this.peso = peso;
        this.apariencia = apariencia;
        this.oroacumulado = oroacumulado;
        this.nombre_d = nombre_d;
        this.nombre_j = nombre_j;
        this.vida = vida;
        nombre_npc = new HashSet<>();
        codigo_po = new HashSet<>();
    }

    public Personaje() {
        nombre_npc = new HashSet<>();
        codigo_po = new HashSet<>();
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPeso() {
        return peso;
    }

    public String getApariencia() {
        return apariencia;
    }

    public int getOroacumulado() {
        return oroacumulado;
    }

    public Daga getNombre_d() {
        return nombre_d;
    }

    public Jugador getNombre_j() {
        return nombre_j;
    }

    public int getVida() {
        return vida;
    }

    public void setNombre_p(String nombre_p) {
        this.nombre_p = nombre_p;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setApariencia(String apariencia) {
        this.apariencia = apariencia;
    }

    public void setOroacumulado(int oroacumulado) {
        this.oroacumulado = oroacumulado;
    }

    public void setNombre_d(Daga nombre_d) {
        this.nombre_d = nombre_d;
    }

    public void setNombre_j(Jugador nombre_j) {
        this.nombre_j = nombre_j;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Set<Pocion> getCodigo_po() {
        return codigo_po;
    }

    public void addCodigo_po(Pocion codigo_po) {
        this.codigo_po.add(codigo_po);
    }

    public Set<NPC> getNombre_npc() {
        return nombre_npc;
    }

    public void addNombre_npc(NPC nombre_npc) {
        this.nombre_npc.add(nombre_npc);
    }
}
