package domain.use_case.question;

import domain.model.Question;
import domain.model.QuestionData;
import domain.model.QuestionType;
import domain.utils.Subject;

import java.util.List;

public interface QuestionAdapter {
    List<Question> getQuestionList();

    void getQuestionById(int id, Subject<Question> service);

    List<Question> getQuestionListByType(QuestionType type);

    void addQuestion(Question question);

    void updateQuestion(Question question);

    void deleteQuestion(Question question);

    void getQuestionAndAnswer(int id, Subject<QuestionData> service);
}
