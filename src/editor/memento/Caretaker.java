package editor.memento;

import editor.Command;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    //Gestión de puntos de restauración como una pila
    List<Memento> mementos = new ArrayList<>();

    //Metodo para añadir un nuevo punto de restauración al listado
    public void push(Memento memento){
        mementos.add(memento);
    }

    //recupero el último punto de restauración y lo devuelvo
    public Memento pop() {
        if (mementos.size() != 0) {
            if (mementos.size() > 1) {
                Memento mementoList = mementos.get(mementos.size() - 2);
                mementos.remove(mementos.size() - 1);
                return mementoList;
            } else {
                mementos.remove(mementos.size() - 1);
                return null;
            }
        } else {
            return null;
        }
    }

}
