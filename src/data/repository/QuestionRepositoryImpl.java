package data.repository;

import data.data_source.database.dao.QuestionDAO;
import data.data_source.mappers.AnswerMapper;
import data.data_source.mappers.QuestionMapper;
import data.data_source.mappers.QuestionTypeMapper;
import domain.model.Question;
import domain.model.QuestionData;
import domain.model.QuestionType;
import domain.repository.QuestionRepository;
import domain.utils.Subject;

import java.util.List;

public class QuestionRepositoryImpl implements QuestionRepository {
    private final QuestionDAO dao;
    private final QuestionMapper mapper;
    private final QuestionTypeMapper questionTypeMapper;
    private final AnswerMapper answerMapper;

    public QuestionRepositoryImpl(QuestionDAO dao, QuestionMapper mapper, QuestionTypeMapper questionTypeMapper, AnswerMapper answerMapper) {
        this.dao = dao;
        this.mapper = mapper;
        this.questionTypeMapper = questionTypeMapper;
        this.answerMapper = answerMapper;
    }

    @Override
    public List<Question> getQuestionList() {
        return mapper.toDomainList(
                dao.getQuestionEntityList()
        );
    }

    @Override
    public void getQuestionById(int id, Subject<Question> service) {
        // giả sử hàm này lấy trên 1 luồng (Thread) khác mất nhiều thời gian
        service.notifyAllObserver(
                mapper.toDomain(
                        dao.getQuestionEntityById(id)
                )
        );
    }

    @Override
    public List<Question> getQuestionListByType(QuestionType type) {
        return mapper.toDomainList(
                dao.getQuestionEntityListByType(
                        questionTypeMapper.fromDomain(type)
                )
        );
    }

    @Override
    public void addQuestion(Question question) {
        dao.addQuestionEntity(
                mapper.fromDomain(question)
        );
    }

    @Override
    public void updateQuestion(Question question) {
        dao.updateQuestionEntity(
                mapper.fromDomain(question)
        );
    }

    @Override
    public void deleteQuestion(Question question) {
        dao.deleteQuestionEntity(
                mapper.fromDomain(question)
        );
    }

    @Override
    public void getQuestionAndAnswers(int id, Subject<QuestionData> service) {
        service.notifyAllObserver(dao.getQuestionAndAnswers(id, mapper, answerMapper));
    }
}
