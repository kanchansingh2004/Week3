package Level1_LinkedList.TextEditorSystem;

public class TextEditorMain {
    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(5); // Max 5 history states

        // Simulate typing and adding states
        editor.addTextState("Hello");
        editor.addTextState("Hello, Universe");
        editor.addTextState("Hello, Universe!");
        editor.addTextState("Hello, Universe!!");
        editor.addTextState("Hello, Universe^-^");

        // Display current state
        editor.displayCurrentState();

        // Undo and Redo actions
        editor.undo();
        editor.redo();
        editor.undo();
        editor.undo();
        editor.redo();

        // Adding a new state should remove the oldest one if history exceeds the limit
        editor.addTextState("New state added after undo/redo");
        editor.displayCurrentState();
    }
}
