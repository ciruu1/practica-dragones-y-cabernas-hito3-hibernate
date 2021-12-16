package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "poseeEsc")
public class PoseeEsc {
    @Id
    @Column(name = "nombre_p", nullable = false)
    private String nombre_p;
    
    @Column(name = "nombre_esc", nullable = false)
    private String nombre_esc;

    public PoseeEsc(String nombre_p, String nombre_esc) {
        this.nombre_p = nombre_p;
        this.nombre_esc = nombre_esc;
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public String getNombre_esc() {
        return nombre_esc;
    }
}
