/*
*Autores:
*Franklin Camacho C.I:26.796.912
*Andres Jiménez C.I: 27.212.052
*Jesús Leal C.I:26.561.030
*Elias Escalona C.I 26.568.921
*Jesús Lopez C.I 27.479.039: 
 */
package Memento;

//GUARDA EN UN LUGAR SEGURO AL MEMENTO
public class Caretaker {
    private Memento memento;
    
    public void setMemento(Memento memento)
    {
        this.memento =memento;
    }
    
    public Memento getMemento()
    {
        return this.memento;
    }
}
