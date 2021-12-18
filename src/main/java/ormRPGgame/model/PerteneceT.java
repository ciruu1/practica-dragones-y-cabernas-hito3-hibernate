package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "perteneceT")
public class PerteneceT {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "nombre_esc")
    private Escuadron nombre_esc;

    @ManyToOne
    @JoinColumn(name = "id_t")
    private Tanque id_t;

    public PerteneceT(Escuadron nombre_esc, Tanque id_t) {
        this.nombre_esc = nombre_esc;
        this.id_t = id_t;
    }

    public PerteneceT() {

    }

    public Escuadron getNombre_esc() {
        return nombre_esc;
    }

    public Tanque getId_t() {
        return id_t;
    }

    public void setNombre_esc(Escuadron nombre_esc) {
        this.nombre_esc = nombre_esc;
    }

    public void setId_t(Tanque id_t) {
        this.id_t = id_t;
    }
}
