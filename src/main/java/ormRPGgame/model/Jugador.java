package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "jugador")
public class Jugador {
    @Id
    @Column(name = "nombre_j", nullable = false)
    private String nombre_j;
    
    @OneToMany(mappedBy = "jugador")
    private Set<Personaje> personajes;

    public Jugador(String nombre_j) {
        this.nombre_j = nombre_j;
    }

    public Jugador() {

    }

    public String getNombre_j() {
        return nombre_j;
    }

    public void setNombre_j(String nombre_j) {
        this.nombre_j = nombre_j;
    }
}
