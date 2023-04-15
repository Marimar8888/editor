package editor.memento;

import java.util.*;

public class Originator {
    private List<String> operations = new ArrayList<>();

    //Restaurar un punto de restauración
    public void restore(Memento memento){
        if(memento !=null){
            operations = (List<String>) memento.getState().get("operations");
        }
    }

    //Crear un punto de restauración, genera el objeto tipo Memento
    public Memento setState(ArrayList documentList){
        Map<String, Object> state = new HashMap<>(); //Se guarda en un HashMap porque tenemos dos atributos un String y un ArrayL
        state.put("operations", new ArrayList<>(documentList));
        return  new Memento(state);

    }
    //Crear un punto de restauración, genera el objeto tipo Memento
    public String getState(){
        //return  operations.get(operations.size()-1);
        if(operations.size()!=0){
            String memento = operations.get(operations.size()-1);
            operations.remove(operations.size()-1);
            return memento;
        }else{
            return null;
        }
    }


}

