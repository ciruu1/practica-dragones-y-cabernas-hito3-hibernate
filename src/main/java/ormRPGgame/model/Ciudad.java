package ormRPGgame.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ciudad")
public class Ciudad {
    @Id
    @Column(name = "nombre_c", nullable = false, unique = true)
    private String nombre_c;

    public Ciudad(String nombre_c) {
        this.nombre_c = nombre_c;
    }

    public Ciudad() {

    }

    public String getNombre_c() {
        return nombre_c;
    }

    public void setNombre_c(String nombre_c) {
        this.nombre_c = nombre_c;
    }
}
