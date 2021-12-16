package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "mejoraHacha")
public class MejoraHacha {
    @Id
    @Column(name = "nombre_f", nullable = false)
    private String nombre_f;
    
    @Column(name = "nombre_h", nullable = false)
    private String nombre_h;
    
    @Column(name = "nombre_p", nullable = false)
    private String nombre_p;

    public MejoraHacha(String nombre_f, String nombre_h, String nombre_p) {
        this.nombre_f = nombre_f;
        this.nombre_h = nombre_h;
        this.nombre_p = nombre_p;
    }

    public String getNombre_f() {
        return nombre_f;
    }

    public String getNombre_h() {
        return nombre_h;
    }

    public String getNombre_p() {
        return nombre_p;
    }
    
}
