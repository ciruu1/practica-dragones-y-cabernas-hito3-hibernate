package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "pertenece_m")
public class PerteneceM {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "nombre_esc")
    private Escuadron nombre_esc;

    @ManyToOne
    @JoinColumn(name = "id_m")
    private Mago id_m;

    public PerteneceM(Escuadron nombre_esc, Mago id_m) {
        this.nombre_esc = nombre_esc;
        this.id_m = id_m;
    }

    public PerteneceM() {

    }

    public Escuadron getNombre_esc() {
        return nombre_esc;
    }

    public Mago getId_m() {
        return id_m;
    }

    public void setNombre_esc(Escuadron nombre_esc) {
        this.nombre_esc = nombre_esc;
    }

    public void setId_m(Mago id_m) {
        this.id_m = id_m;
    }
}
