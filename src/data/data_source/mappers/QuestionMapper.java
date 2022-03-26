package data.data_source.mappers;

import data.data_source.entities.QuestionEntity;
import domain.mappers.DomainMapper;
import domain.model.Question;

import java.util.List;
import java.util.stream.Collectors;

public class QuestionMapper implements DomainMapper<QuestionEntity, Question> {
    @Override
    public Question toDomain(QuestionEntity entity) {
        return new Question(
                entity.getQuestionId(),
                entity.getQuestionName(),
                entity.getQuestionTypeId(),
                entity.getDifficultLevel(),
                entity.getDescription()
        );
    }

    @Override
    public QuestionEntity fromDomain(Question model) {
        return new QuestionEntity(
                model.getQuestionId(),
                model.getQuestionName(),
                model.getQuestionTypeId(),
                model.getDifficultLevel(),
                model.getDescription()
        );
    }

    public List<Question> toDomainList(List<QuestionEntity> list){
        return list.stream().map(this::toDomain).collect(Collectors.toList());
    }

    public List<QuestionEntity> fromDomainList(List<Question> list){
        return list.stream().map(this::fromDomain).collect(Collectors.toList());
    }


}
