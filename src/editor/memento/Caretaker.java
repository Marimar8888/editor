package editor.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    //Gestión de puntos de restauración como una pila
    List<Memento> mementos = new ArrayList<>();
    Memento memento;


    //Metodo para añadir un nuevo punto de restauración al listado
    public void push(Memento memento){
        mementos.add(memento);
    }

    //recupero el último punto de restauración y lo devuelvo
    public Memento get(){
        if(mementos.size()!=0){
            memento = mementos.get(mementos.size()-1);
            mementos.remove(mementos.size()-1);
            return memento;
        }else{
            return null;
        }
    }

}
