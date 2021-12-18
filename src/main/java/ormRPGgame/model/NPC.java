package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "NPC")
public class NPC {
    @Id
    @Column(name = "nombre_npc", nullable = false)
    private String nombre_npc;

    public NPC(String nombre_npc) {
        this.nombre_npc = nombre_npc;
    }

    public NPC() {

    }

    public String getNombre_npc() {
        return nombre_npc;
    }

    public void setNombre_npc(String nombre_npc) {
        this.nombre_npc = nombre_npc;
    }
}
