package editor.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    //atributo List de tipo Memento para guardar los historiales de puntos de restauracion
    private List<Memento> mementos = new ArrayList<Memento>();

    //Metodo para añadir un punto de restauración al listado
    public void add(Memento memento){
        mementos.add(memento);
    }

    //Restaurar punto de restauración eliminando el último cambio
    public Memento pop(){
        if(mementos.size()>0){
            Memento memento = mementos.get(mementos.size()-1);
            mementos.remove(mementos.size()-1);
            return memento;
        }
        return null;
    }
}
