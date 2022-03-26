package domain.model;

public class Answer implements Model {
    private int answerId;
    private int questionId;
    private String answer;
    private boolean isCorrect;
    private String description;

    public Answer() {
    }

    public Answer(int answerId, int questionId, String answer, boolean isCorrect, String description) {
        this.answerId = answerId;
        this.questionId = questionId;
        this.answer = answer;
        this.isCorrect = isCorrect;
        this.description = description;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
