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
import java.sql.Date;
import java.util.List;
import java.util.Map;

public class DAOAsistencia {
    
    public Asistencia Agregar(
            String  cedulaVigilante,
            String mes,
            String anno,
            int inasistencia,
            int inasistenciaJus,
            int contadorAsistencia,
            char estatus) {
        String sql = "INSERT INTO asistencia (cedulaVigilante,mes,anno,inasistencia,inasistenciaJus,contadorAsistencia,estatus) VALUES('"
                + cedulaVigilante + "','"
                + mes + "','"
                + anno + "','" //se esta concatenando lo que se esta recibiendo como parametro
                + inasistencia + "','"
                 + inasistenciaJus + "','"
                + contadorAsistencia + "','"
                + estatus + "')";

        if (new Conexion().queryInsertar(sql) > 0) {

            return new Asistencia(cedulaVigilante ,mes ,anno ,inasistencia,inasistenciaJus ,contadorAsistencia, estatus);

        }
        return null;

    }

    public int Modificar(String cedulaVigilante, String mes,
            String anno, int inasistencia,int inasistenciaJus,
            int contadorAsistencia, char estatus) {
        String sql = "UPDATE  Asistencia SET mes = '"
                + mes + "',anno='"
                + anno + "',inasistencia='"
                + inasistencia + "',inasistenciaJus='"
                + inasistenciaJus + "',contadosAsistencia='"
                + contadorAsistencia + "',estatus='"
                + estatus + "' WHERE cedulaVigilante='"
                + cedulaVigilante + "'";
        return new Conexion().queryInsertar(sql);
    }

    public Asistencia Buscar(String cedulaVigilante) {
        String sql = "SELECT * FROM  Asistencia WHERE cedulaVigilante = '"
                + cedulaVigilante + "'";

        List<Map> registros = new Conexion().ejecutar(sql);
        Asistencia asis = null;

        for (Map registro : registros) {
            asis = new Asistencia((String) registro.get("cedulaVigilante"),
                    (String) registro.get("mes"),
                    (String) registro.get("anno"),
                    (int) registro.get("inasistencia"),
                    (int) registro.get("inasistenciaJus"),
                    (int) registro.get("contadorAsistencia"),
                    (char) registro.get("estatus"));

        }
        return asis;
    }

    public int Eliminar(String cedulaVigilante) {
        String sql = "DELETE FROM  Asistencia WHERE cedulaVigilante = '"
                + cedulaVigilante + "'";
        return new Conexion().queryInsertar(sql);

    }
}
    