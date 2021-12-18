package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "derrotaEspectro")
public class DerrotaEspectro {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_m")
    private Mago id_m;

    @ManyToOne
    @JoinColumn(name = "codigo_e")
    private Espectro codigo_e;

    public DerrotaEspectro(Mago id_m, Espectro codigo_e) {
        this.id_m = id_m;
        this.codigo_e = codigo_e;
    }

    public DerrotaEspectro() {

    }

    public Mago getId_m() {
        return id_m;
    }

    public Espectro getCodigo_e() {
        return codigo_e;
    }

    public void setId_m(Mago id_m) {
        this.id_m = id_m;
    }

    public void setCodigo_e(Espectro codigo_e) {
        this.codigo_e = codigo_e;
    }
}
