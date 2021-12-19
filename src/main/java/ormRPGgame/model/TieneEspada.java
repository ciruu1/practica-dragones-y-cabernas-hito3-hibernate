package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tiene_espada")
public class TieneEspada {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_g")
    private Guerrero id_g;

    @OneToMany
    @JoinColumn(name = "nombre_e")
    private Set<Espada> nombre_e;

    public TieneEspada(Guerrero id_g, Espada nombre_e) {
        this.id_g = id_g;
        this.nombre_e = new HashSet<>();
        this.nombre_e.add(nombre_e);
    }

    public TieneEspada() {
        this.nombre_e = new HashSet<>();
    }

    public Guerrero getId_g() {
        return id_g;
    }

    public Set<Espada> getNombre_e() {
        return nombre_e;
    }

    public void setId_g(Guerrero id_g) {
        this.id_g = id_g;
    }

    public void addNombre_e(Espada nombre_e) {
        this.nombre_e.add(nombre_e);
    }
}
