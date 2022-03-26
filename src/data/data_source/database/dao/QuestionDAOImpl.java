package data.data_source.database.dao;

import data.data_source.entities.QuestionEntity;
import data.data_source.entities.QuestionTypeEntity;
import di.LoggerModule;
import domain.utils.logger.LogLevel;
import domain.utils.logger.Logger;

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
}
