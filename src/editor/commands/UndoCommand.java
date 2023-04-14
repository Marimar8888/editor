package editor.commands;

import editor.Command;
import editor.memento.Memento;

import java.util.ArrayList;

public class UndoCommand  implements  Command{
    private final Memento memento;

    public UndoCommand(Memento memento) {
        this.memento = memento;
    }

    @Override
    public void execute(ArrayList<String> documentLines) {
        if (documentLines.size() > 0 && memento != null){
            documentLines.set(documentLines.size()-1, memento.toString());
        }
    }
}
