package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "desbloqueaDr")
public class DesbloqueaDr {
    @Id
    @Column(name = "nombre_dr", nullable = false)
    private String nombre_dr;

    public DesbloqueaDr(String nombre_dr) {
        this.nombre_dr = nombre_dr;
    }

    public String getNombre_dr() {
        return nombre_dr;
    }
    
}
