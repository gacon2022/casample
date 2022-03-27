package presentation.question;

import domain.model.Question;
import domain.model.QuestionData;
import domain.model.QuestionType;
import domain.use_case.question.QuestionUseCase;
import domain.utils.Subject;

import java.util.List;

public class QuestionController {
    // chứa instance của use case và gọi tới use case để lấy dữ liệu
    private final QuestionUseCase useCase;

    public QuestionController(QuestionUseCase useCase) {
        this.useCase = useCase;
    }

    public List<Question> getQuestionList() {
        return useCase.getQuestionList();
    }

    public void getQuestionById(int id, Subject<Question> service) {
        useCase.getQuestionById(id, service);
    }

    public List<Question> getQuestionListByType(QuestionType type) {
        return useCase.getQuestionListByType(type);
    }

    public void addQuestion(Question question) {
        useCase.addQuestion(question);
    }

    public void updateQuestion(Question question) {
        useCase.updateQuestion(question);
    }

    public void deleteQuestion(Question question) {
        useCase.deleteQuestion(question);
    }

    public void getQuestionAndAnswer(int id, Subject<QuestionData> service) {
        useCase.getQuestionAndAnswer(id, service);
    }
}
