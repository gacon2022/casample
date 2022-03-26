package presentation.question.page;

import domain.model.Question;

public class QuestionPageTest {
    public static void main(String[] args) {
        // Ví dụ một trang câu hỏi chỉ có 1 câu / trang
        // Làm sao để thực hiện trở về câu hỏi vừa trả lời trước đó hoặc next tới câu hỏi hiện tại
        QuestionPageInvoker invoker = new QuestionPageInvoker();
        Question qTest1 = new Question(
                1,
                "Question  test 1",
                123,
                3,
                "Description for question 1"
        );
        Question qTest2 = new Question(
                2,
                "Question  test 2",
                123,
                3,
                "Description for question 2"
        );
        Question qTest3 = new Question(
                3,
                "Question  test 3",
                123,
                3,
                "Description for question 3"
        );

        invoker.write(qTest1);
        invoker.undo();
        invoker.printQuestion(); // Trống

        invoker.redo();
        invoker.printQuestion(); // print question 1

        invoker.write(qTest2);
        invoker.write(qTest3);
        invoker.printQuestion(); // print question 1, 2, 3

        invoker.undo();
        invoker.undo();
        invoker.undo();
        invoker.undo();
        invoker.printQuestion(); // không còn gì trong stack vì đã undo tới hết

    }
}
