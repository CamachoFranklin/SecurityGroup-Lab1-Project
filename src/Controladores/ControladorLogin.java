/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Controladores;

import Vistas.VLogin;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorLogin implements ActionListener {

    // Se declaran las clases a utilizar.
    private final VLogin vlogin;

    // Constructor del Login
    public ControladorLogin() {

        vlogin = new VLogin();
        // Se añaden los eventos.
        this.vlogin.btnEntrar.addActionListener(this);
        this.vlogin.btnMinimizar.addActionListener(this);
        this.vlogin.btnSalir.addActionListener(this);

        vlogin.setVisible(true);
        vlogin.setLocationRelativeTo(null);
    }

    public int Ingresar() {

        // Se obtiene la contraseña ingresada.
        char[] password = vlogin.txtContrasenna.getPassword();

        // Se transforma la contraseña a String
        String pass = new String(password);
        if ("admin".equals(vlogin.txtNombreUsuario.getText()) && "admin".equals(pass)) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Se describen los eventos provocados por las acciones de los botones.
     *
     * @param evt parámetro que corresponde a la acción de los botónes.
     */
    public void actionPerformed(java.awt.event.ActionEvent evt) {

        /*  Boton Minimizar.
            Minimiza la pantalla
         */
        if (evt.getSource() == vlogin.btnMinimizar) {
            vlogin.setExtendedState(ICONIFIED);
        }

        /*  Boton Salir.
            Cierra la aplicación
         */
        if (evt.getSource() == vlogin.btnSalir) {
            System.exit(0);

        }
        /*  Boton Entrar.
            Ingresa al sistema si las credenciales predeterminadas,
            son correctas, en caso contrario muestra un mensaje de error.
         */
        if (evt.getSource() == vlogin.btnEntrar) {
            if (Ingresar() == 1) {
                vlogin.dispose();
                new ControladorMenuPrincipal();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Credenciales incorrectas, intente de nuevo",
                        "Error en Inicio de Sesión",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
