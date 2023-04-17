package editor.memento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Memento {

 private Map<String, Object> state;

    public Memento(Map<String, Object> state){
        this.state = state;
    }

    //Devuelve el último estado del memento
    public Map<String, Object> getState(){
        return state;
    }


}
