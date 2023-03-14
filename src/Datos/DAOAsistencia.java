/**
 *Autores:
 *Franklin Camacho C.I:26.796.912
 *Jesús Leal C.I:26.561.030
 *Elias Escalona C.I 26.568.921
 *Andres Jiménez C.I: 27.212.052
 *Jesús Lopez C.I:
 */
package Datos;

import Modelos.Asistencia;
import java.util.List;
import java.util.Map;

public class DAOAsistencia {

    private static final Conexion con = Conexion.saberEstado();

    public Asistencia Agregar(
            String cedulaVigilante,
            String mes,
            String anio,
            int inasistencia,
            int inasistenciaJus,
            String estado) {
        String sql = "INSERT INTO asistencia (cedulavigilante, mes,  anio,inasistencia,  inasistenciajus,  estado) VALUES('"
                + cedulaVigilante + "','"
                + mes + "','"
                + anio + "','" //se esta concatenando lo que se esta recibiendo como parametro
                + inasistencia + "','"
                + inasistenciaJus + "','"
                + estado + "')";

        if (con.actualizar(sql) > 0) {

            return new Asistencia(cedulaVigilante, mes, anio, inasistencia, inasistenciaJus, estado);
        }
        return null;
    }

    public int Modificar(String cedulaVigilante, String mes,
            String anno, int inasistencia, int inasistenciaJus, String estado) {
        String sql = "UPDATE  Asistencia SET mes = '"
                + mes + "',anno='"
                + anno + "',inasistencia='"
                + inasistencia + "',inasistenciajus='"
                + inasistenciaJus + "',estado='"
                + estado + "' WHERE cedulavigilante='"
                + cedulaVigilante + "'";
        return con.actualizar(sql);
    }

    public Asistencia Buscar(String cedulaVigilante) {
        String sql = "SELECT * FROM  asistencia WHERE cedulavigilante = '"
                + cedulaVigilante + "'";

        List<Map> registros = con.ejecutar(sql);
        Asistencia asis = null;

        for (Map registro : registros) {
            asis = new Asistencia((String) registro.get("cedulavigilante"),
                    (String) registro.get("mes"),
                    (String) registro.get("anio"),
                    (int) registro.get("inasistencia"),
                    (int) registro.get("inasistenciaJus"),
                    (String) registro.get("estado"));
        }
        return asis;
    }

    public Asistencia BuscarMes(String cedulaVigilante, String mes, String anio) {
        String sql = "SELECT * FROM asistencia WHERE cedulavigilante='" + cedulaVigilante + "' AND mes='" + mes + "'  AND anio='" + anio + "'";

        List<Map> registros = con.ejecutar(sql);
        Asistencia asis = null;

        for (Map registro : registros) {
            asis = new Asistencia((String) registro.get("cedulavigilante"),
                    (String) registro.get("mes"),
                    (String) registro.get("anio"),
                    (int) registro.get("inasistencia"),
                    (int) registro.get("inasistenciajus"),
                    (String) registro.get("estado"));
        }
        return asis;
    }

    public int Eliminar(String cedulaVigilante) {
        String sql = "DELETE FROM  Asistencia WHERE cedulaVigilante = '"
                + cedulaVigilante + "'";
        return con.actualizar(sql);
    }
}
