package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "jugador")
public class Jugador {
    @Id
    @Column(name = "nombre_j", nullable = false)
    private String nombre_j;

    public Jugador(String nombre_j) {
        this.nombre_j = nombre_j;
    }

    public String getNombre_j() {
        return nombre_j;
    }
}
