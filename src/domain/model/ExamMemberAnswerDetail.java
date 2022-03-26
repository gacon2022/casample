package domain.model;

public class ExamMemberAnswerDetail implements Model{
    private int examMemberAnswerDetailId;
    private int examMemberAnswerId;
    private int answerId;
    private String otherAnswer;
    private String description;

    public int getExamMemberAnswerDetailId() {
        return examMemberAnswerDetailId;
    }

    public void setExamMemberAnswerDetailId(int examMemberAnswerDetailId) {
        this.examMemberAnswerDetailId = examMemberAnswerDetailId;
    }

    public int getExamMemberAnswerId() {
        return examMemberAnswerId;
    }

    public void setExamMemberAnswerId(int examMemberAnswerId) {
        this.examMemberAnswerId = examMemberAnswerId;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getOtherAnswer() {
        return otherAnswer;
    }

    public void setOtherAnswer(String otherAnswer) {
        this.otherAnswer = otherAnswer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExamMemberAnswerDetail() {
    }

    public ExamMemberAnswerDetail(int examMemberAnswerDetailId, int examMemberAnswerId, int answerId, String otherAnswer, String description) {
        this.examMemberAnswerDetailId = examMemberAnswerDetailId;
        this.examMemberAnswerId = examMemberAnswerId;
        this.answerId = answerId;
        this.otherAnswer = otherAnswer;
        this.description = description;
    }
}
