package editor.commands;

import editor.Command;
import editor.memento.Memento;

import java.util.ArrayList;
import java.util.Arrays;

public class UndoCommand  implements  Command{
    private final ArrayList<String> documentLines;
    public UndoCommand(ArrayList<String> documentLines) {

        this.documentLines = documentLines;
    }
    @Override
    public void execute(ArrayList<String> documentLines) {
        documentLines = documentLines;
    }
}
