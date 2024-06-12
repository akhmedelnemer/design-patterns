package memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setFontName("Arial");
        history.push(editor.createState());
        editor.setFontSize(12);
        history.push(editor.createState());
        editor.setContent("Hello World!");
        history.push(editor.createState());

        editor.setFontSize(90);
        editor.restore(history.pop());

        System.out.println(editor.getContent());
        System.out.println(editor.getFontName());
        System.out.println(editor.getFontSize());
    }
}
