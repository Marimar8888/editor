package editor;

public class EditorFactory {
    public Editor getEditor() {
        return new ConsoleEditor();
    }
}
