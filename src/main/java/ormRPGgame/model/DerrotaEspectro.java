package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "derrotaEspectro")
public class DerrotaEspectro {
    @Id
    @Column(name = "id_m", nullable = false)
    private int id_m;
    
    @Column(name = "codigo_e", nullable = false)
    private int codigo_e;

    public DerrotaEspectro(int id_m, int codigo_e) {
        this.id_m = id_m;
        this.codigo_e = codigo_e;
    }

    public int getId_m() {
        return id_m;
    }

    public int getCodigo_e() {
        return codigo_e;
    }
}
