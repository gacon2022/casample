package domain.repository;

import domain.model.Question;
import domain.model.QuestionType;
import domain.utils.Subject;

import java.util.List;

public interface QuestionRepository {
    List<Question> getQuestionList();

    void getQuestionById(int id, Subject<Question> service);

    List<Question> getQuestionListByType(QuestionType type);

    void addQuestion(Question question);

    void updateQuestion(Question question);

    void deleteQuestion(Question question);
}
