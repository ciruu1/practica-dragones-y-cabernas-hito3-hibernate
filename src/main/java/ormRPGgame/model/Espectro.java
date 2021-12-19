package ormRPGgame.model;

import javax.persistence.*;
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
    
    @ManyToMany()
    @JoinTable(name = "DerrotaEspectro")
    private Set<Mago> magos1;

    @ManyToOne
    @JoinColumn(name = "id_m")
    private Mago id_m;

    public Espectro(int codigo_e, String nombre, int vida, int recompensa) {
        this.codigo_e = codigo_e;
        this.nombre = nombre;
        this.vida = vida;
        this.recompensa = recompensa;
    }

    public Espectro() {

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

    public Mago getId_m() {
        return id_m;
    }

    public void setId_m(Mago id_m) {
        this.id_m = id_m;
    }
}
