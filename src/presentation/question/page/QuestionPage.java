package presentation.question.page;

import domain.model.Question;

import java.util.Stack;

// Ví dụ danh sách câu hỏi cho phép quay trở lại câu trước đó hoặc tiến lên thêm
// Receiver
public class QuestionPage {
    private Stack<Question> questions = new Stack<>();

    public void write(Question question) {
        questions.push(question);
    }

    public void eraseLast() {
        if (!questions.isEmpty()) {
            questions.pop();
        }
    }

    public void printQuestion() {
        for (Question question : questions) {
            System.out.println(question);
        }
    }
}
