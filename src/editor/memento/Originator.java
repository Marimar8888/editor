package editor.memento;

import java.util.*;


public class Originator {
    private List<String> operations = new ArrayList<>();

    //Crear un punto de restauración, genera el objeto tipo Memento
    public Memento setState(List<String> documentList){
       Map<String, Object> state = new HashMap<>(); //Se guarda en un HashMap porque tenemos dos atributos un String y un ArrayL
        state.put("operations", new ArrayList<>(documentList));
        return  new Memento(state);
    }

    //Crear un punto de restauración, genera el objeto tipo Memento
    public ArrayList restore(Memento memento){
        if(memento !=null){
            return (ArrayList) (operations = (List<String>) memento.getState().get("operations"));
        }else{
            return (ArrayList) (operations = new ArrayList<>());
        }
    }

}

