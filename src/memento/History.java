package memento;

import java.util.Stack;

public class History {
    private final Stack<EditorState> states;

    public History() {
        states = new Stack<EditorState>();
    }

    public void push(EditorState state) {
        states.push(state);
    }

    public EditorState pop() {
        return states.pop();
    }
}
