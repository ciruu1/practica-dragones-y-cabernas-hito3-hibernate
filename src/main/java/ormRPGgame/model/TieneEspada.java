package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "tieneEspada")
public class TieneEspada {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_g")
    private Guerrero id_g;

    @ManyToOne
    @JoinColumn(name = "nombre_e")
    private Espada nombre_e;

    public TieneEspada(Guerrero id_g, Espada nombre_e) {
        this.id_g = id_g;
        this.nombre_e = nombre_e;
    }

    public TieneEspada() {

    }

    public Guerrero getId_g() {
        return id_g;
    }

    public Espada getNombre_e() {
        return nombre_e;
    }

    public void setId_g(Guerrero id_g) {
        this.id_g = id_g;
    }

    public void setNombre_e(Espada nombre_e) {
        this.nombre_e = nombre_e;
    }
}
