package ormRPGgame;

import ormRPGgame.model.Jugador;
import ormRPGgame.model.Mago;
import ormRPGgame.model.Daga;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import ormRPGgame.model.Personaje;

import java.sql.*;
import java.util.Date;


/**
 * Controlador de la aplicación. Por favor, revise detenidamente la clase y complete las partes omitidas
 * atendiendo a los comentarios indicados mediante @TODO
 */
public class Controller {

    private Session session;

    /**
     * Crea un nuevo controlador
     */
    public Controller () {

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        SessionFactory sessionFactory = new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();

        this.session = sessionFactory.openSession();
    }

    /**
     * Crea un nuevo mago
     * param nickname nombre de usuario
     * @return el nuevo usuario creado
     * @throws SQLException
     */
    public Daga createDaga(String nombre) throws SQLException{
        // @TODO complete este metodo para crear de forma presistente una daga
        session.beginTransaction();
        Daga daga = new Daga(nombre);
        session.save(daga);
        session.getTransaction().commit();
        return daga;
    }

    public Mago createMago(int id_m, int mana, int fuerza, Personaje nombre_p) throws SQLException {
        // @TODO complete este metodo para crear de forma presistente un mago
        session.beginTransaction();
        Mago mago = new Mago(id_m, mana, fuerza, nombre_p);
        session.save(mago);
        session.getTransaction().commit();
        return mago;
    }

    public Jugador createJugador(String nombre_j) {
        session.beginTransaction();
        Jugador jugador = new Jugador(nombre_j);
        session.save(jugador);
        session.getTransaction().commit();
        return jugador;
    }

    public Personaje createPersonaje(String nombre_p, int nivel, int peso, String apariencia, int oroacumulado, Daga nombre_d, Jugador nombre_j, int vida, Date ultima_conexion) {
        session.beginTransaction();
        Personaje personaje = new Personaje(nombre_p, nivel, peso, apariencia, oroacumulado, nombre_d, nombre_j, vida, ultima_conexion);
        session.save(personaje);
        session.getTransaction().commit();
        return personaje;
    }
}
