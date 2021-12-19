package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "derrota_troll")
public class DerrotaTroll {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_t")
    private Tanque id_t;

    @OneToMany
    @JoinColumn(name = "codigo_t")
    private Set<Troll> codigo_t;

    public DerrotaTroll(Tanque id_t, Troll codigo_t) {
        this.codigo_t = new HashSet<>();
        this.codigo_t.add(codigo_t);
        this.id_t = id_t;
    }

    public DerrotaTroll() {
        this.codigo_t = new HashSet<>();
    }

    public Tanque getId_t() {
        return id_t;
    }

    public Set<Troll> getCodigo_t() {
        return codigo_t;
    }

    public void setId_t(Tanque id_t) {
        this.id_t = id_t;
    }

    public void addCodigo_t(Troll codigo_t) {
        this.codigo_t.add(codigo_t);
    }
}
