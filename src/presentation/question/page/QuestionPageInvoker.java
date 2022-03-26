package presentation.question.page;

import domain.model.Question;

import java.util.Stack;

// Invoker
public class QuestionPageInvoker {
    private Stack<QuestionCommand> undoCommands = new Stack<>();
    private Stack<QuestionCommand> redoCommands = new Stack<>();
    private QuestionPage page = new QuestionPage();

    public void undo() {
        if (!undoCommands.isEmpty()) {
            QuestionCommand cmd = undoCommands.pop();
            cmd.undo();
            redoCommands.push(cmd);
        } else {
            System.out.println("Nothing to undo");
        }
    }

    public void redo() {
        if (!redoCommands.isEmpty()) {
            QuestionCommand cmd = redoCommands.pop();
            cmd.redo();
            undoCommands.push(cmd);
        } else {
            System.out.println("Nothing to redo");
        }
    }

    public void write(Question question) {
        QuestionCommand cmd = new QuestionPageEditorCommand(page, question);
        undoCommands.push(cmd);
        redoCommands.clear();
    }

    public void printQuestion() {
        page.printQuestion();
    }
}
