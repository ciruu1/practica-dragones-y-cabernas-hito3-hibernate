package ormRPGgame.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "regala")
public class Regala {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "fecha_obtencion", nullable = false)
    private Date fecha_obtencion;

    @ManyToOne
    @JoinColumn(name = "nombre_p")
    private Personaje nombre_p;

    @ManyToOne
    @JoinColumn(name = "nombre_po")
    private Pocion codigo_po;

    @ManyToOne
    @JoinColumn(name = "nombre_npc")
    private NPC nombre_npc;

    public Regala(Date fecha_obtencion, Personaje nombre_p, Pocion codigo_po, NPC nombre_npc) {
        this.fecha_obtencion = fecha_obtencion;
        this.nombre_p = nombre_p;
        this.codigo_po = codigo_po;
        this.nombre_npc = nombre_npc;
    }

    public Regala() {

    }

    public Date getFecha_obtencion() {
        return fecha_obtencion;
    }

    public Personaje getNombre_p() {
        return nombre_p;
    }

    public Pocion getCodigo_po() {
        return codigo_po;
    }

    public NPC getNombre_npc() {
        return nombre_npc;
    }

    public void setFecha_obtencion(Date fecha_obtencion) {
        this.fecha_obtencion = fecha_obtencion;
    }

    public void setNombre_p(Personaje nombre_p) {
        this.nombre_p = nombre_p;
    }

    public void setCodigo_po(Pocion codigo_po) {
        this.codigo_po = codigo_po;
    }

    public void setNombre_npc(NPC nombre_npc) {
        this.nombre_npc = nombre_npc;
    }
}
