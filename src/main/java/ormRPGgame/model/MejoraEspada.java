package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "mejoraEspada")
public class MejoraEspada {
    @Id
    @Column(name = "nombre_f", nullable = false)
    private String nombre_f;
    
    @Column(name = "nombre_e", nullable = false)
    private String nombre_e;
    
    @Column(name = "nombre_p", nullable = false)
    private String nombre_p;

    public MejoraEspada(String nombre_f, String nombre_e, String nombre_p) {
        this.nombre_f = nombre_f;
        this.nombre_e = nombre_e;
        this.nombre_p = nombre_p;
    }

    public String getNombre_f() {
        return nombre_f;
    }

    public String getNombre_e() {
        return nombre_e;
    }

    public String getNombre_p() {
        return nombre_p;
    }
}
