package ormRPGgame.model;

public class DerrotaEspectro {
    private int id_m;
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
