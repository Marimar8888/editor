package editor.memento;

import editor.Command;

import java.util.ArrayList;
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
}
