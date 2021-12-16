package ormRPGgame.model;

import java.util.Date;

public class Personaje {
    private String nombre_p;
    private int nivel;
    private int peso;
    private String apariencia;
    private int oroacumulado;
    private String nombre_d;
    private String nombre_j;
    private int vida;
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
