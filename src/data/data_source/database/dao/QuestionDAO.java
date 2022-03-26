package data.data_source.database.dao;

import data.data_source.entities.QuestionEntity;
import data.data_source.entities.QuestionTypeEntity;

import java.util.List;

// interface DAO
public interface QuestionDAO {

    List<QuestionEntity> getQuestionEntityList();

    QuestionEntity getQuestionEntityById(int id);

    List<QuestionEntity> getQuestionEntityListByType(QuestionTypeEntity type);

    void addQuestionEntity(QuestionEntity question);

    void updateQuestionEntity(QuestionEntity question);

    void deleteQuestionEntity(QuestionEntity question);
}
