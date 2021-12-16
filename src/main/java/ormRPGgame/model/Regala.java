package ormRPGgame.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "regala")
public class Regala {
    @Id
    @Column(name = "fecha_obtencion", nullable = false)
    private Date fecha_obtencion;
    
    @Column(name = "nombre_p", nullable = false)
    private String nombre_p;
    
    @Column(name = "codigo_po", nullable = false)
    private int codigo_po;
    
    @Column(name = "nombre_npc", nullable = false)
    private String nombre_npc;

    public Regala(Date fecha_obtencion, String nombre_p, int codigo_po, String nombre_npc) {
        this.fecha_obtencion = fecha_obtencion;
        this.nombre_p = nombre_p;
        this.codigo_po = codigo_po;
        this.nombre_npc = nombre_npc;
    }

    public Date getFecha_obtencion() {
        return fecha_obtencion;
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public int getCodigo_po() {
        return codigo_po;
    }

    public String getNombre_npc() {
        return nombre_npc;
    }
}
