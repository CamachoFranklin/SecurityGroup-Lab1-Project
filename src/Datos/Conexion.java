/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Andres Jiménez C.I: 27.212.052
*Jesús Lopez C.I: 
 */
package Datos;

// Se importan las librerías a utilizar.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Conexion {

    // Se declaran las variables que indican la Base de Datos, el usuario y la contraseña.
    private final String url = "jdbc:postgresql://localhost:5432/sistema",
            user = "postgres",
            pass = "1234";

    // Se instancia la clase de Connection.
    private Connection con;

    /**
     * Constructor.
     */
    public Conexion() {
        this.con = null;
    }

    /**
     * Método para conectar la app con la Base de Datos.
     *
     * @return
     */
    public Connection conectar() {
        try {
            //Nos permitira abrir una conexion a nuestra Base de Datos.
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("La conexión con la Base de Datos se realizó correctamente.");
        } catch (Exception e) {
            System.out.println("Fallo al conectar " + e.getMessage());
        }
        return con;
    }

    /**
     * Método para desconectar la app con la Base de Datos.
     */
    public void cerrar() {
        try {
            con.close();
            System.out.println("La conexión con la Base de Datos se cerró correctamente.");
        } catch (Exception e) {
            System.out.println("Fallo al desconectar " + e.getMessage());
        }
    }

    /**
     * Método para realizar consultas con la Base de Datos.
     *
     * @param sql Sentencia SQL para consultas.
     * @return
     */
    public ResultSet queryConsultar(String sql) {
        try {
            //Nos permitira realizar sentencias sobre la Base de Datos
            java.sql.Statement ejecutorQuery = con.createStatement();
            //Variable que nos ayudara a realizar consultas a la Base de Datos
            ResultSet r = ejecutorQuery.executeQuery(sql);
            System.out.println("Se han obtenido datos.");
            return r;
        } catch (Exception e) {
            System.out.println("Conexion Informa: No se pudieron obtener los datos "
                    + e.getMessage());
            return null;
        }
    }

    /**
     * Método para realizar inserciones o modificaciones con la Base de Datos.
     *
     * @param sql Sentencia SQL para inserciones o modificaciones.
     */
    public void queryInsertar(String sql) {
        try {
            java.sql.Statement sentencia = con.createStatement();
            sentencia.executeUpdate(sql);
            System.out.println("Se ha Insertado/Modificado un registro.");
        } catch (Exception e) {
            System.out.println("Falló la Inserción/Modificación del registro " + e.getMessage());
        }
    }
}
