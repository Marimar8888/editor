

### Patrón de diseño utilizado

Para este ejercicio he utilizado el patrón de diseño estructural Memento.

## Creo las clases necesarias para el memento

- Caretaker: Para gestionar los puntos de restauración
- Memento: Para poder crear los objetos tipo memento
- Originator: Para poder guardar los estados.

## ConsoleEditor

Cada vez que se ingresa por consola un comando que no sea 'undo', realiza una actualización del listado de estados tipo Memento.

En el caso de introducir 'undo', recuperaría, el estado anterior al actual y lo actualizaría en el arrayList documentLines, además elimina el último estado dejando el listado de mementos igual que el estado actual del documento-ArrayList (documentLines).

Desde aquí se llama al método execute de la interface Command.

## Interface Command

Esta interface esta implementada en las clases AppendCommand, DeleteCommand.... las cuales se encargan de definir el método de dicha interface (execute).

## UndoCommand

Defino el método de la interface Command, donde recibo el nuevo estado del ArrayList de mementos y los actualizo en el ArrayList documentLines, que es lo que finalmente se imprime por consola.

##CommandFactory

Devuelvo el resultado del constructor de la clase UndoCommand.

## CommandParser

Devuelvo el string 'undo'.






