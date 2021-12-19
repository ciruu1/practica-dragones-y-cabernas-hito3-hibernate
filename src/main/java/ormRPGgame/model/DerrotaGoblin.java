package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "derrota_goblin")
public class DerrotaGoblin {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_g")
    private Guerrero id_g;

    @OneToMany
    @JoinColumn(name = "codigo_g")
    private Set<Goblin> codigo_g;

    public DerrotaGoblin(Guerrero id_g, Goblin codigo_g) {
        this.codigo_g = new HashSet<>();
        this.codigo_g.add(codigo_g);
        this.id_g = id_g;
    }

    public DerrotaGoblin() {
        this.codigo_g = new HashSet<>();
    }

    public Guerrero getId_g() {
        return id_g;
    }

    public Set<Goblin> getCodigo_g() {
        return codigo_g;
    }

    public void setId_g(Guerrero id_g) {
        this.id_g = id_g;
    }

    public void setCodigo_g(Goblin codigo_g) {
        this.codigo_g.add(codigo_g);
    }
}
