package data.data_source.adapter;

import domain.model.Question;
import domain.model.QuestionType;
import domain.repository.QuestionRepository;
import domain.use_case.question.QuestionAdapter;
import domain.utils.Subject;

import java.util.List;

// hiện thực interface Adapter - Adaptete
public class QuestionAdapterImpl implements QuestionAdapter {
    // Repository design pattern
    private final QuestionRepository repository;

    public QuestionAdapterImpl(QuestionRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Question> getQuestionList() {
        return repository.getQuestionList();
    }

    @Override
    public void getQuestionById(int id, Subject<Question> service) {
         repository.getQuestionById(id,service);
    }

    @Override
    public List<Question> getQuestionListByType(QuestionType type) {
        return repository.getQuestionListByType(type);
    }

    @Override
    public void addQuestion(Question question) {
        repository.addQuestion(question);
    }

    @Override
    public void updateQuestion(Question question) {
        repository.updateQuestion(question);
    }

    @Override
    public void deleteQuestion(Question question) {
        repository.deleteQuestion(question);
    }
}
