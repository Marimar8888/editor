package editor.commands;

import editor.*;
import editor.memento.Caretaker;
import editor.memento.Memento;
import editor.memento.Originator;

import java.util.ArrayList;
import java.util.Arrays;

public class CommandFactory {
    private static final CommandParser commandParser = new CommandParser();

    //Creo un objeto tipo Originator para crear los puntos de restauración
    Originator originator = new Originator();
    //Creo un ojbeto tipo CareTaker para guardar el histoiral
    Caretaker careTaker = new Caretaker();


    public Command getCommand(String commandLine) throws BadCommandException, ExitException {
        String[] args = commandParser.parse(commandLine);
        return switch (args[0]) {
            case "a" -> createAppendCommand(args[1]);
            case "u" -> createUpdateCommand(args[1], args[2]);
            case "d" -> createDeleteCommand(args[1]);
            case "undo" -> createUndoCommand();
            default -> throw new ExitException();
        };
    }

    private Command createUndoCommand() {
        ArrayList memento = null;
        return new UndoCommand(null);
    }

    private Command createDeleteCommand(String lineNumber) {
        int number = Integer.parseInt(lineNumber);
        return new DeleteCommand(number);
    }

    private Command createUpdateCommand(String lineNumber, String text) {
        int number = Integer.parseInt(lineNumber);
        return new UpdateCommand(text, number);
    }

    private Command createAppendCommand(String text) {

        return new AppendCommand(text);
    }

}
