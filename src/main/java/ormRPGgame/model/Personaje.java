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
    
    @Column(name = "nombre_d", nullable = false)
    private String nombre_d;
    
    @Column(name = "nombre_j", nullable = false)
    private String nombre_j;
    
    @Column(name = "vida", nullable = false)
    private int vida;
    
    @Column(name = "ultima_conexion", nullable = false)
    private Date ultima_conexion;

    public Personaje(String nombre_p, int nivel, int peso, String apariencia, int oroacumulado, String nombre_d, String nombre_j, int vida, Date ultima_conexion) {
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

    public String getNombre_d() {
        return nombre_d;
    }

    public String getNombre_j() {
        return nombre_j;
    }

    public int getVida() {
        return vida;
    }

    public Date getUltima_conexion() {
        return ultima_conexion;
    }
}
