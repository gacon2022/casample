package data.data_source.mappers;

import data.data_source.entities.AnswerEntity;
import domain.mappers.DomainMapper;
import domain.model.Answer;

import java.util.List;
import java.util.stream.Collectors;

public class AnswerMapper implements DomainMapper<AnswerEntity, Answer> {
    @Override
    public Answer toDomain(AnswerEntity entity) {
        return new Answer(
                entity.getAnswerId(),
                entity.getQuestionId(),
                entity.getAnswer(),
                entity.isCorrect(),
                entity.getDescription()
        );
    }

    @Override
    public AnswerEntity fromDomain(Answer model) {
        return new AnswerEntity(
                model.getAnswerId(),
                model.getQuestionId(),
                model.getAnswer(),
                model.isCorrect(),
                model.getDescription()
        );
    }

    public List<Answer> toDomainList(List<AnswerEntity> list) {
        return list.stream().map(this::toDomain).collect(Collectors.toList());
    }

    public List<AnswerEntity> fromDomainList(List<Answer> list) {
        return list.stream().map(this::fromDomain).collect(Collectors.toList());
    }
}
