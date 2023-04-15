package editor.commands;

import editor.Command;
import editor.memento.Memento;

import java.util.ArrayList;

public class UndoCommand  implements  Command{
    private final String memento;

    public UndoCommand(String memento) {
        this.memento = memento;
    }

    @Override
    public void execute(ArrayList<String> documentLines) {
      /*  if (documentLines.size() > 0){
            documentLines.clear();
            //Se guarda en un HashMap porque tenemos dos atributos un String y un ArrayL
            documentLines.add(memento.toString());
        }*/
    }
}
