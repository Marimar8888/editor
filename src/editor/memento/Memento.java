package editor.memento;

import editor.Command;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Memento {

    private Map<String, Object> state;

    public Memento(Map<String, Object> state){
        this.state = state;
    }
    //Devuelve el último estado del memento
    public Map<String, Object> getState(){
        return (Map<String, Object>) state.get(state.size()-1);
    }
    public int size (Memento state){
        int num = 0;
        ArrayList date = (ArrayList) state.getState().get("operations");
        for (Object dato: date){
            num++;
        }
        return num;
    }

}
