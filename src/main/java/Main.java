import ormRPGgame.Controller;
import ormRPGgame.model.Daga;
import ormRPGgame.model.Jugador;
import ormRPGgame.model.Mago;
import ormRPGgame.model.Personaje;

import java.sql.SQLException;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        try {
            Controller controlador = new Controller();
            //@TODO añada las llamadas a las funciones de la clase Controller.java necesarias
            //para la creación de la daga y el mago.
            Daga daga = controlador.createDaga("Daga de madera");
            Jugador jugador = controlador.createJugador("Admin");
            Personaje personaje = controlador.createPersonaje("Stanto", 10, 80, "Alto", 1000, daga, jugador, 200);
            Mago mago = controlador.createMago(5, 600, 100, personaje);
            if (daga != null && mago != null && jugador != null && personaje != null)
                System.out.println("Se ha creado el mago " + mago.getNombre_p() + " de nivel 1 con la daga " + daga.getNombre_d());
        } catch (SQLException e) {
            System.err.println("Se ha producido un error en la conexión con la base de datos");
            e.printStackTrace();
        }
    }
}
