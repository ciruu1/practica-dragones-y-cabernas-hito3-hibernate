package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "derrotaGoblin")
public class DerrotaGoblin {
    @Id
    @Column(name = id_g, nullable = false)
    private int id_g;
    
    @Column(name = codigo_g, nullable = false)
    private int codigo_g;

    public DerrotaGoblin(int id_g, int codigo_g) {
        this.id_g = id_g;
        this.codigo_g = codigo_g;
    }

    public int getId_g() {
        return id_g;
    }

    public int getCodigo_g() {
        return codigo_g;
    }
}
