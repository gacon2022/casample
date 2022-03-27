package data.data_source.database.dao;

import data.data_source.entities.AnswerEntity;
import data.data_source.entities.QuestionEntity;
import data.data_source.entities.QuestionTypeEntity;
import data.data_source.mappers.AnswerMapper;
import data.data_source.mappers.QuestionMapper;
import di.LoggerModule;
import domain.model.QuestionData;
import domain.utils.logger.LogLevel;
import domain.utils.logger.Logger;

import java.util.ArrayList;
import java.util.List;

public class QuestionDAOImpl implements QuestionDAO {
    @Override
    public List<QuestionEntity> getQuestionEntityList() {
        // Lệnh query lấy dữ liệu từ database
        return null;
    }

    @Override
    public QuestionEntity getQuestionEntityById(int id) {
        // Lệnh query lấy dữ liệu từ database

        // ví dụ trả về một question
//        return new QuestionEntity(
//                125,
//                "Question 1",
//                123,
//                3,
//                "Description for question 1"
//        );

        // giả sử việc lấy dữ liệu gây ra lỗi và cần phải ghi lại log

        Logger logger = LoggerModule.getInstance().provideLoggerChain();
        try {
            int a = 10 / 0;
            int b = a + 1;
        } catch (Exception e) {
            logger.log(LogLevel.ERROR, e.getMessage());
        }

        return new QuestionEntity(
                125,
                "Question 1",
                123,
                3,
                "Description for question 1"
        );
    }

    @Override
    public List<QuestionEntity> getQuestionEntityListByType(QuestionTypeEntity type) {
        // Lệnh query lấy dữ liệu từ database
        return null;
    }

    @Override
    public void addQuestionEntity(QuestionEntity question) {
        // Lệnh insert dữ liệu database

    }

    @Override
    public void updateQuestionEntity(QuestionEntity question) {
        // Lệnh update dữ liệu vào database
    }

    @Override
    public void deleteQuestionEntity(QuestionEntity question) {
        // Lệnh xoá dữ liệu trong database
    }

    @Override
    public QuestionData getQuestionAndAnswers(int id, QuestionMapper questionMapper, AnswerMapper answerMapper) {

        QuestionEntity questionEntity = new QuestionEntity(
                125,
                "Question 1",
                123,
                3,
                "Description for question 1"
        );

        ArrayList<AnswerEntity> answerEntities = new ArrayList<>();
        answerEntities.add(new AnswerEntity(
                1, 125, "Hello 1", false, "Description 1"
        ));
        answerEntities.add(new AnswerEntity(
                2, 125, "Hello 2", false, "Description 2"
        ));
        answerEntities.add(new AnswerEntity(
                3, 125, "Hello 3", true, "Description 3"
        ));
        answerEntities.add(new AnswerEntity(
                4, 125, "Hello 4", false, "Description 4"
        ));


        return new QuestionData(
                questionMapper.toDomain(questionEntity),
                answerMapper.toDomainList(answerEntities)
        );
    }
}
