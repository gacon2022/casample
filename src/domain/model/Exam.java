package domain.model;

public class Exam implements Model {
    private int examId;
    private String examName;
    private String examAlias;
    private String description;

    public Exam() {
    }

    public Exam(int examId, String examName, String examAlias, String description) {
        this.examId = examId;
        this.examName = examName;
        this.examAlias = examAlias;
        this.description = description;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getExamAlias() {
        return examAlias;
    }

    public void setExamAlias(String examAlias) {
        this.examAlias = examAlias;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
