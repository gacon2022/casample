package domain.model;

public class ExamDetail implements Model {
    private int examDetailId;
    private int examId;
    private int questionId;
    private int mark;
    private String description;

    public ExamDetail() {
    }

    public ExamDetail(int examDetailId, int examId, int questionId, int mark, String description) {
        this.examDetailId = examDetailId;
        this.examId = examId;
        this.questionId = questionId;
        this.mark = mark;
        this.description = description;
    }

    public int getExamDetailId() {
        return examDetailId;
    }

    public void setExamDetailId(int examDetailId) {
        this.examDetailId = examDetailId;
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

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
