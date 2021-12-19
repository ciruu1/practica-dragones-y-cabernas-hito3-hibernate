package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "derrota_espectro")
public class DerrotaEspectro {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_m")
    private Mago id_m;

    @OneToMany
    @JoinColumn(name = "codigo_e")
    private Set<Espectro> codigo_e;

    public DerrotaEspectro(Mago id_m, Espectro codigo_e) {
        this.codigo_e = new HashSet<>();
        this.codigo_e.add(codigo_e);
        this.id_m = id_m;
    }

    public DerrotaEspectro() {
        this.codigo_e = new HashSet<>();
    }

    public Mago getId_m() {
        return id_m;
    }

    public Set<Espectro> getCodigo_e() {
        return codigo_e;
    }

    public void setId_m(Mago id_m) {
        this.id_m = id_m;
    }

    public void addCodigo_e(Espectro codigo_e) {
        this.codigo_e.add(codigo_e);
    }
}
