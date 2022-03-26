package presentation.question.page;

import domain.model.Question;

// Concrete Command
public class QuestionPageEditorCommand implements QuestionCommand{
    private QuestionPage page;
    private Question question;

    public QuestionPageEditorCommand(QuestionPage page, Question question) {
        this.page = page;
        this.question = question;
        page.write(question);
    }

    @Override
    public void undo() {
        page.eraseLast();
    }

    @Override
    public void redo() {
        page.write(question);
    }
}
