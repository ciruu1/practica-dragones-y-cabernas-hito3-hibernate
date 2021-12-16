package ormRPGgame.model;

// @TODO completar las anotaciones de la clase
import javax.persistence.*;

@Entity
@Table(name = "daga")
public class Daga {
    @Id
    @Column(name = "nombre_d", nullable = false)
    private String nombre_d;

    public Daga(String nombre_d) {
        this.nombre_d = nombre_d;
    }

    public String getNombre_d() {
        return nombre_d;
    }
}
