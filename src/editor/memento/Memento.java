package editor.memento;

import editor.Command;

import java.util.ArrayList;
import java.util.Map;

public class Memento {

    private ArrayList<String> mementos;

    public Memento(ArrayList<String> documentLines){
        this.mementos = documentLines;
    }

    public ArrayList<String>  getState(){
        return mementos;
    }

}
