package presentation.question;

import di.AdapterModule;
import domain.model.Question;
import domain.model.QuestionData;
import domain.use_case.question.QuestionUseCase;
import domain.utils.Observer;

// main
public class QuestionTest {
    public static void main(String[] args) {
        // adapter module (Dependency Injection)
        AdapterModule adapterModule = AdapterModule.getInstance();

        // Controller MVC
        QuestionController controller = new QuestionController(
                new QuestionUseCase(
                        adapterModule.provideQuestionAdapter()
                )
        );

        // Proxy design pattern tuỳ trường hợp
//        QuestionProxyService proxyService = new QuestionProxyService();

        // Ví dụ kết hợp giữa Observer và Proxy design pattern
        // Concrete observer
        // Nơi nhận dữ liệu notify từ repository (QuestionRepositoryImpl)
        Observer<Question> questionObserver = new Observer<Question>() {
            @Override
            public void update(Question value) {
                // Nhận dữ liệu update
                System.out.println("Log: Nhận dữ liệu qua observer");
                System.out.println(value);
            }
        };

        QuestionService questionService = new QuestionService();
        questionService.attach(questionObserver);

//        proxyService.attach(questionObserver);

        // mất 5s
        controller.getQuestionById(123, questionService);


        // ví dụ lấy ra câu hỏi kèm đáp án của nó
        Observer<QuestionData> questionDataObserver = new Observer<QuestionData>() {
            @Override
            public void update(QuestionData value) {
                System.out.println("Question :" + value.getQuestion());
                System.out.println("Answers :" + value.getAnswers());
            }
        };
        QuestionDataService questionDataService = new QuestionDataService();
        questionDataService.attach(questionDataObserver);
        controller.getQuestionAndAnswer(125, questionDataService);

    }
}
