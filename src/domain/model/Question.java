package domain.model;

public class Question implements Model{
    private int questionId;
    private String questionName;
    private int questionTypeId;
    private int difficultLevel;
    private String description;

    public Question() {
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", questionName='" + questionName + '\'' +
                ", questionTypeId=" + questionTypeId +
                ", difficultLevel=" + difficultLevel +
                ", description='" + description + '\'' +
                '}';
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public int getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(int questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    public int getDifficultLevel() {
        return difficultLevel;
    }

    public void setDifficultLevel(int difficultLevel) {
        this.difficultLevel = difficultLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Question(int questionId, String questionName, int questionTypeId, int difficultLevel, String description) {
        this.questionId = questionId;
        this.questionName = questionName;
        this.questionTypeId = questionTypeId;
        this.difficultLevel = difficultLevel;
        this.description = description;
    }
}
