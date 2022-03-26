package domain.model;

public class QuestionType implements Model{
    private int questionTypeId;
    private int questionType;
    private String description;

    public QuestionType(int questionTypeId, int questionType, String description) {
        this.questionTypeId = questionTypeId;
        this.questionType = questionType;
        this.description = description;
    }

    public int getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(int questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    public int getQuestionType() {
        return questionType;
    }

    public void setQuestionType(int questionType) {
        this.questionType = questionType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
