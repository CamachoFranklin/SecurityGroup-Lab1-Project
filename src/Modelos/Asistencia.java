/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Modelos;

public class Asistencia {

    // Declaración de atributos
    private  String  cedulaVigilante, mes, anno;
   private int inasistencia, inasistenciaJus, contadorAsistencia;
   private char estatus;

   

    // Constructor de la clase
    public Asistencia(String cedulaVigilante,String mes, String anno,
        int inasistencia, int inasistenciaJus, int contadorAsistencia,char estatus) {
        this.cedulaVigilante = cedulaVigilante;
        this.inasistencia = inasistencia;
        this.contadorAsistencia = contadorAsistencia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public int getInasistencia() {
        return inasistencia;
    }

    public void setInasistencia(int inasistencia) {
        this.inasistencia = inasistencia;
    }

    // Creación de los Metodos Getter y Setter
    public String getCedulaVigilante() {
        return cedulaVigilante;
    }

    public void setCedulaVigilante(String cedulaVigilante) {
        this.cedulaVigilante = cedulaVigilante;
    }


    public int getContadorAsistencia() {
        return contadorAsistencia;
    }

    public void setContadorAsistencia(int contadorAsistencia) {
        this.contadorAsistencia = contadorAsistencia;
    }
 public int getInasistenciaJus() {
        return inasistenciaJus;
    }

    public void setInasistenciaJus(int inasistenciaJus) {
        this.inasistenciaJus = inasistenciaJus;
    }
  

    public char getEstatus() {
        return estatus;
    }

    public void setEstatus(char estatus) {
        this.estatus = estatus;
    }
}
