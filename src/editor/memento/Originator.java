package editor.memento;

import java.util.*;

public class Originator {
    private List<String> mementos = new ArrayList<>();

    //Crear un punto de restauración, genera el objeto tipo Memento
    public Memento getState(){
        ArrayList<String> momento = new ArrayList<>(); //Se guarda en un HashMap porque tenemos dos atributos un String y un ArrayList
        momento.add(String.valueOf(new ArrayList<>(mementos)));
        return  new Memento(momento);
    }
    //Restaurar un punto de restauración
    public Memento restore(Memento memento){
        if(memento !=null){
            mementos = memento.getState();
        }
        return memento;
    }
}

