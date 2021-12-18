package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "poseeEsc")
public class PoseeEsc {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "nombre_p")
    private Personaje nombre_p;

    @ManyToOne
    @JoinColumn(name = "nombre_esc")
    private Escuadron nombre_esc;

    public PoseeEsc(Personaje nombre_p, Escuadron nombre_esc) {
        this.nombre_p = nombre_p;
        this.nombre_esc = nombre_esc;
    }

    public PoseeEsc() {

    }

    public Personaje getNombre_p() {
        return nombre_p;
    }

    public Escuadron getNombre_esc() {
        return nombre_esc;
    }

    public void setNombre_p(Personaje nombre_p) {
        this.nombre_p = nombre_p;
    }

    public void setNombre_esc(Escuadron nombre_esc) {
        this.nombre_esc = nombre_esc;
    }
}
