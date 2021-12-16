package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "poseeT")
public class PoseeT {
    @Id
    @Column(name = "id_t", nullable = false)
    private int id_t;
    
    @Column(name = "nombre_ht", nullable = false)
    private String nombre_ht;

    public PoseeT(int id_t, String nombre_ht) {
        this.id_t = id_t;
        this.nombre_ht = nombre_ht;
    }

    public int getId_t() {
        return id_t;
    }

    public String getNombre_ht() {
        return nombre_ht;
    }
}
