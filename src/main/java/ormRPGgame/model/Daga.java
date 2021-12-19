package ormRPGgame.model;

// @TODO completar las anotaciones de la clase
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "daga")
public class Daga {
    @Id
    @Column(name = "nombre_d", nullable = false, unique = true)
    private String nombre_d;

    @OneToOne
    @JoinColumn(name = "nombre_p")
    private Personaje nombre_p;

    public Daga(String nombre_d, Personaje nombre_p) {
        this.nombre_d = nombre_d;
        this.nombre_p = nombre_p;
    }

    public Daga() {

    }

    public String getNombre_d() {
        return nombre_d;
    }

    public void setNombre_d(String nombre_d) {
        this.nombre_d = nombre_d;
    }

    public Personaje getNombre_p() {
        return nombre_p;
    }

    public void setNombre_p(Personaje nombre_p) {
        this.nombre_p = nombre_p;
    }
}
