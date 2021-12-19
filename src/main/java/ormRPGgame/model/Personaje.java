package ormRPGgame.model;

import javax.persistence.*;
import java.util.Date;

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
    private Jugador jugador;
    
    @Column(name = "vida", nullable = false)
    private int vida;
    
    @Column(name = "ultima_conexion", nullable = false)
    private Date ultima_conexion;

    public Personaje(String nombre_p, int nivel, int peso, String apariencia, int oroacumulado, Daga nombre_d, Jugador nombre_j, int vida, Date ultima_conexion) {
        this.nombre_p = nombre_p;
        this.nivel = nivel;
        this.peso = peso;
        this.apariencia = apariencia;
        this.oroacumulado = oroacumulado;
        this.nombre_d = nombre_d;
        this.nombre_j = nombre_j;
        this.vida = vida;
        this.ultima_conexion = ultima_conexion;
    }

    public Personaje() {

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

    public Date getUltima_conexion() {
        return ultima_conexion;
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

    public void setUltima_conexion(Date ultima_conexion) {
        this.ultima_conexion = ultima_conexion;
    }
}
