package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "tieneEspada")
public class TieneEspada {
    @Id
    @Column(name = "id_g", nullable = false)
    private int id_g;
    
    @Column(name = "nombre_e", nullable = false)
    private String nombre_e;

    public TieneEspada(int id_g, String nombre_e) {
        this.id_g = id_g;
        this.nombre_e = nombre_e;
    }

    public int getId_g() {
        return id_g;
    }

    public String getNombre_e() {
        return nombre_e;
    }
}
