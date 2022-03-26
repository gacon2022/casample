package data.data_source.mappers;

import data.data_source.entities.QuestionTypeEntity;
import domain.mappers.DomainMapper;
import domain.model.QuestionType;

import java.util.List;
import java.util.stream.Collectors;

public class QuestionTypeMapper implements DomainMapper<QuestionTypeEntity, QuestionType> {
    @Override
    public QuestionType toDomain(QuestionTypeEntity entity) {
        return new QuestionType(
                entity.getQuestionTypeId(),
                entity.getQuestionType(),
                entity.getDescription()
        );
    }

    @Override
    public QuestionTypeEntity fromDomain(QuestionType model) {
        return new QuestionTypeEntity(
                model.getQuestionTypeId(),
                model.getQuestionType(),
                model.getDescription()
        );
    }

    public List<QuestionType> toDomainList(List<QuestionTypeEntity> list) {
        return list.stream().map(this::toDomain).collect(Collectors.toList());
    }

    public List<QuestionTypeEntity> fromDomainList(List<QuestionType> list) {
        return list.stream().map(this::fromDomain).collect(Collectors.toList());
    }
}
