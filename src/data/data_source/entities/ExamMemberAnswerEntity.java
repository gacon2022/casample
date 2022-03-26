package data.data_source.entities;

public class ExamMemberAnswerEntity implements Entity {

    private int examMemberAnswerId;
    private int examId;
    private int questionId;
    private int memberId;
    private String description;

    public int getExamMemberAnswerId() {
        return examMemberAnswerId;
    }

    public void setExamMemberAnswerId(int examMemberAnswerId) {
        this.examMemberAnswerId = examMemberAnswerId;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExamMemberAnswerEntity() {
    }

    public ExamMemberAnswerEntity(int examMemberAnswerId, int examId, int questionId, int memberId, String description) {
        this.examMemberAnswerId = examMemberAnswerId;
        this.examId = examId;
        this.questionId = questionId;
        this.memberId = memberId;
        this.description = description;
    }
}
