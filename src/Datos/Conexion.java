/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class Conexion {

    //atributos privados final ; los describen como constantes y no pueden cambiar su valor , durante la ejecucion de la ´plicacion 
    private final String BD = "securitygroup";
    private final String URL = "jdbc:postgresql://localhost:5432/" + BD;
    private final String USUARIO = "postgres";
    private final String CONTRASENNA = "1234";
    private final String DRIVER = "org.postgresql.Driver";

    public static Conexion instance; //SINGLENTON
    private Connection conectar;

    //creamos el constructor, y se abrira la coneccion. cunado se cree el objeto nuestra clase va a ejecutar la coneccion con la base de datos
    private Conexion() {

        try {
            Class.forName(DRIVER);
            conectar = DriverManager.getConnection(URL, USUARIO, CONTRASENNA);
            // JOptionPane.showMessageDialog(null,"Base de Datos conectadacon exito");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar" + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar" + e.getMessage());
        }

    }

    public static Conexion saberEstado() {
        if (instance == null) {
            instance = new Conexion();
        }
        return instance;
    }

    public Connection getConectar() {
        return conectar;
    }

    //se crea un metodo publico que va a devolver un entero y ejecutara consultas que no devuelven datos , recibe por parametro un String        
    //  Sera un metodo que ejecute cualquier consulta de cualquier tabla que no requiera que devuelva datos como DELETE,UPDATE,INSERT     
    // el Statement sirve para procesar una sentencia SQL estatica y obtener los resultados obtenida por ella 
    public int actualizar(String consulta) {
        //recibe una consulta crea el Statement atraves de la coneccion que se establece cuando se crea el objeto y ejecuta la consulta 

        try {
            Statement st = conectar.createStatement();
            return st.executeUpdate(consulta);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta" + e.getMessage());
        } finally {
            cerrarConeccion();
        }
        return 0; //si hay un error muestra el mensaje y retorna 0 es decir que se modifico nada
    }

    //creamos un metodo que si nos va a permitir ejecutar una consulta y obtener los resultados de la misma, entonces va a regresar un arreglo de los registros ...sera un arreglo dinamico
    //una lista de tipo dinamica es un conjunto de nodos con 2 campos ...uno de informacion y otro apuntador al siguiente nodo
    public List listar(String consulta) {
        //se crea el resultSet :un resulset contiene todas las filas que satisfacen las condiciones de una sentencia SQL y proporciona el acceso a los datos de estas filas mediante los gets
        ResultSet rs = null;
        //un list que contendra los datos y se inicializa como array 
        List resultado = new ArrayList();

        Statement st;
        try {
            st = conectar.createStatement();
            rs = st.executeQuery(consulta);
            resultado = datosAcomodados(rs); // si no hay registros para mostrar retorna la lista vacia, delo contrario se acomodan los registros 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta" + e.getMessage());
        } finally {
            cerrarConeccion();
        }
        return resultado;
    }

    private List datosAcomodados(ResultSet rs) {
        //primero revisa la cantidad de columnas que vienen en el resultado 

        //
        List renglones = new ArrayList();

        try {
            int cantColum = rs.getMetaData().getColumnCount();
            while (rs.next())//cada vez que se recorrere el while estamos en un renglon de las consultas..ya tendriamos la cantidad  de columnas 
            {
                Map< String, Object> renglon = new HashMap();    //las columnas se meteran en un map :map es una interfaz utilizada para almacenar datos en un par clave-valor ...hashmap es la clase de implementacion de la interfaz map.
                //los metadatos son informacion de los datos...nos muestran la estrura de las tablas que tienen a los datos 
                for (int i = 1; i <= cantColum; i++) // se crea un for basados en las cantidad de columnas ... el indice de i es uno porque en los metadatos el indice de la primera columna encontrada es 1
                {
                    String nombreCampo = rs.getMetaData().getColumnName(i);
                    Object valor = rs.getObject(nombreCampo);
                    renglon.put(nombreCampo, valor);  //ahora el objeto y valor se coloca en el map que se llama renglon  
                }                                    //el renglon se va insertando en relacion a todas las columnas que tenga el resultado y luego se agragara al objeto renglones 
                renglones.add(renglon);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error " + e.getMessage());
        } finally {
            cerrarConeccion();
        }
        return renglones;
    }
    //metodo que nos permita invocar un procedimiento almacenado  

    public boolean EjecutarProcedimiento(String nombreProcedimiento) {
        try {
            CallableStatement cs = conectar.prepareCall("{call" + nombreProcedimiento + "}"); // la interfaz callableStatement permite la utilizacion de sentencias sql para llamar procedimientos almacenados ....los procedimientos almacenados son programas que tienen una interfaz de base de datos .
            return cs.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error " + e.getMessage());
        } finally {
            cerrarConeccion();
        }
        return false;
    }

    public List ejecutar(String consulta) {
        ResultSet rs = null;
        List resultado = new ArrayList();

        try {
            Statement st = conectar.createStatement();
            rs = st.executeQuery(consulta);
            resultado = datosAcomodados(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            cerrarConeccion();
        }
        return resultado;
    }

    public int cant(String consulta) {
        ResultSet rs = null;
        int resultado = 0;

        try {
            Statement st = conectar.createStatement();
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                resultado = rs.getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            cerrarConeccion();
        }
        return resultado;
    }

    public void cerrarConeccion() {

        instance = null;
    }
}
