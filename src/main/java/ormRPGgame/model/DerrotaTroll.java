package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "derrotaTroll")
public class DerrotaTroll {
    @Id
    @Column(name = "id_t", nullable = false)
    private int id_t;
    
    @Column(name = "codigo_t", nullable = false)
    private int codigo_t;

    public DerrotaTroll(int id_t, int codigo_t) {
        this.id_t = id_t;
        this.codigo_t = codigo_t;
    }

    public int getId_t() {
        return id_t;
    }

    public int getCodigo_t() {
        return codigo_t;
    }
}
