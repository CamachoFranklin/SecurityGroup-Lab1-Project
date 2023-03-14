/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Usuario
 */
public class DRadio extends CDecorator {
    
    public  DRadio(DHerramienta gobi)
        {}
    
    @Override
    public double calcularHerramientas(double m, int cant) {
        return m*cant;
    }
}
