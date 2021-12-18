package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "derrotaGoblin")
public class DerrotaGoblin {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_g")
    private Guerrero id_g;

    @ManyToOne
    @JoinColumn(name = "codigo_g")
    private Goblin codigo_g;

    public DerrotaGoblin(Guerrero id_g, Goblin codigo_g) {
        this.id_g = id_g;
        this.codigo_g = codigo_g;
    }

    public DerrotaGoblin() {

    }

    public Guerrero getId_g() {
        return id_g;
    }

    public Goblin getCodigo_g() {
        return codigo_g;
    }

    public void setId_g(Guerrero id_g) {
        this.id_g = id_g;
    }

    public void setCodigo_g(Goblin codigo_g) {
        this.codigo_g = codigo_g;
    }
}
