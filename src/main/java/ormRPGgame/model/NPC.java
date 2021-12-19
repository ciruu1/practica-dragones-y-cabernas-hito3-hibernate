package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "NPC")
public class NPC {
    @Id
    @Column(name = "nombre_npc", nullable = false)
    private String nombre_npc;

    @OneToMany
    @JoinColumn(name = "codigo_po")
    private Set<Pocion> codigo_po;

    @ManyToMany
    @JoinColumn(name = "nombre_p")
    private Set<Personaje> nombre_p;

    public NPC(String nombre_npc) {
        this.nombre_npc = nombre_npc;
        this.codigo_po = new HashSet<>();
        this.nombre_p = new HashSet<>();
    }

    public NPC() {
        this.codigo_po = new HashSet<>();
        this.nombre_p = new HashSet<>();
    }

    public String getNombre_npc() {
        return nombre_npc;
    }

    public void setNombre_npc(String nombre_npc) {
        this.nombre_npc = nombre_npc;
    }

    public Set<Pocion> getCodigo_po() {
        return codigo_po;
    }

    public void addCodigo_po(Pocion codigo_po) {
        this.codigo_po.add(codigo_po);
    }

    public Set<Personaje> getNombre_p() {
        return nombre_p;
    }

    public void addNombre_p(Personaje nombre_p) {
        this.nombre_p.add(nombre_p);
    }
}
