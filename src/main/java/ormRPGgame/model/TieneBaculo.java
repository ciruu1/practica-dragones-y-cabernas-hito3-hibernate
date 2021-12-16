package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "tieneBaculo")
public class TieneBaculo {
    @Id
    @Column(name = "id_m", nullable = false)
    private int id_m;
    
    @Column(name = "nombre_b", nullable = false)
    private String nombre_b;

    public TieneBaculo(int id_m, String nombre_b) {
        this.id_m = id_m;
        this.nombre_b = nombre_b;
    }

    public int getId_m() {
        return id_m;
    }

    public String getNombre_b() {
        return nombre_b;
    }
}
