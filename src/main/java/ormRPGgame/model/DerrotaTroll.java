package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "derrotaTroll")
public class DerrotaTroll {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_t")
    private Tanque id_t;

    @ManyToOne
    @JoinColumn(name = "codigo_t")
    private Troll codigo_t;

    public DerrotaTroll(Tanque id_t, Troll codigo_t) {
        this.id_t = id_t;
        this.codigo_t = codigo_t;
    }

    public DerrotaTroll() {

    }

    public Tanque getId_t() {
        return id_t;
    }

    public Troll getCodigo_t() {
        return codigo_t;
    }

    public void setId_t(Tanque id_t) {
        this.id_t = id_t;
    }

    public void setCodigo_t(Troll codigo_t) {
        this.codigo_t = codigo_t;
    }
}
