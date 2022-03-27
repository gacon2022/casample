package data.data_source.database.dao;

import data.data_source.entities.QuestionEntity;
import data.data_source.entities.QuestionTypeEntity;
import data.data_source.mappers.AnswerMapper;
import data.data_source.mappers.QuestionMapper;
import domain.model.QuestionData;

import java.util.List;

// interface DAO
public interface QuestionDAO {

    List<QuestionEntity> getQuestionEntityList();

    QuestionEntity getQuestionEntityById(int id);

    List<QuestionEntity> getQuestionEntityListByType(QuestionTypeEntity type);

    void addQuestionEntity(QuestionEntity question);

    void updateQuestionEntity(QuestionEntity question);

    void deleteQuestionEntity(QuestionEntity question);

    QuestionData getQuestionAndAnswers(int id, QuestionMapper questionMapper, AnswerMapper answerMapper);
}
