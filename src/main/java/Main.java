import ormRPGgame.Controller;
import ormRPGgame.model.Mago;
import ormRPGgame.model.Daga;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
            Controller controlador = new Controller();
            //@TODO añada las llamadas a las funciones de la clase Controller.java necesarias
            //para la creación de la daga y el mago.
            Daga daga = controlador.createDaga("Daga de madera");
            Mago mago = controlador.createMago(5, 600, 100, "Gandalf", daga);
            if (daga != null && mago != null)
                System.out.println("Se ha creado el mago " + mago.getNombre_p() + " de nivel 1 con la daga " + daga.getNombre_d());
        } catch (SQLException e) {
            System.err.println("Se ha producido un error en la conexión con la base de datos");
            e.printStackTrace();
        }
    }
}
