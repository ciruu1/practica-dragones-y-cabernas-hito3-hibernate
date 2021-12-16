package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "escuadron")
public class Escuadron {
    @Id
    @Column(name = "nombre_esc", nullable = false)
    private String nombre_esc;

    public Escuadron(String nombre_esc) {
        this.nombre_esc = nombre_esc;
    }

    public String getNombre_esc() {
        return nombre_esc;
    }
}
