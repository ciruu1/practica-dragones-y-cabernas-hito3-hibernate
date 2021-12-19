package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "dragon")
public class Dragon {
    @Id
    @Column(name = "nombre_dr", nullable = false, unique = true)
    private String nombre_dr;
    
    @Column(name = "vida", nullable = false)
    private int vida;
    
    @Column(name = "recompensa", nullable = false)
    private int recompensa;
    
    @Column(name = "desbloquea_dr", nullable = false)
    private String desbloquea_dr;
    
    @ManyToMany()
    @JoinTable(name = "lucha")
    private Set<Escuadron> escuadrones;
    

    public Dragon(String nombre_dr, int vida, int recompensa, String desbloquea_dr) {
        this.nombre_dr = nombre_dr;
        this.vida = vida;
        this.recompensa = recompensa;
        this.desbloquea_dr = desbloquea_dr;
        
    }

    public Dragon() {

    }

    public String getNombre_dr() {
        return nombre_dr;
    }

    public int getVida() {
        return vida;
    }

    public int getRecompensa() {
        return recompensa;
    }
    
    public String getDesbloquea_dr() {
        return desbloquea_dr;
    }

    public void setNombre_dr(String nombre_dr) {
        this.nombre_dr = nombre_dr;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }
    
    public void setDesbloquea_dr(String desbloquea_dr) {
        this.desbloquea_dr = desbloquea_dr;
}
