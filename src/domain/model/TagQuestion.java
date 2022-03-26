package domain.model;

public class TagQuestion implements Model {
    private int tagQuestionId;
    private int tagId;
    private int questionId;
    private String description;

    public TagQuestion() {
    }

    public TagQuestion(int tagQuestionId, int tagId, int questionId, String description) {
        this.tagQuestionId = tagQuestionId;
        this.tagId = tagId;
        this.questionId = questionId;
        this.description = description;
    }

    public int getTagQuestionId() {
        return tagQuestionId;
    }

    public void setTagQuestionId(int tagQuestionId) {
        this.tagQuestionId = tagQuestionId;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
