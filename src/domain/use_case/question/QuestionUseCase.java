package domain.use_case.question;

import domain.model.Question;
import domain.model.QuestionData;
import domain.model.QuestionType;
import domain.utils.Subject;

import java.util.List;

/// Quy định các phương thức tương tác với dữ liệu
public class QuestionUseCase {
    // chứa adapter (Adapter design pattern) để nói chuyện được với database
    private final QuestionAdapter adapter;

    public QuestionUseCase(QuestionAdapter adapter) {
        this.adapter = adapter;
    }

    public List<Question> getQuestionList() {
        return adapter.getQuestionList();
    }

    public void getQuestionById(int id, Subject<Question> service) {
        adapter.getQuestionById(id, service);
    }

    public List<Question> getQuestionListByType(QuestionType type) {
        return adapter.getQuestionListByType(type);
    }

    public void addQuestion(Question question) {
        adapter.addQuestion(question);
    }

    public void updateQuestion(Question question) {
        adapter.updateQuestion(question);
    }

    public void deleteQuestion(Question question) {
        adapter.deleteQuestion(question);
    }

    public void getQuestionAndAnswer(int id, Subject<QuestionData> service) {
        adapter.getQuestionAndAnswer(id, service);
    }
}
