package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "derrota_troll")
public class DerrotaTroll {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @OneToMany(mappedBy="id_t")
    @JoinColumn(name = "id_t")
    private Tanque id_t;

    @OneToMany(mappedBy="codigo_t")
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
