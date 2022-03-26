package presentation.question;

import domain.model.Question;
import domain.utils.Observer;
import domain.utils.Subject;

public class QuestionProxyService implements Subject<Question> {
    private QuestionService questionService = new QuestionService();
    @Override
    public void attach(Observer<Question> observer) {
        // Làm gì đó trước khi thực hiện thêm observer ví dụ như kiểm tra quyền của user...
        questionService.attach(observer);
    }

    @Override
    public void detach(Observer<Question> observer) {
        questionService.detach(observer);
    }

    @Override
    public void notifyAllObserver(Question value) {
        // Làm gì đó trước khi notify dữ liệu cho tất cả các observer
        System.out.println("Log: Kiểm tra dữ liệu trước khi notify");
        questionService.notifyAllObserver(value);
    }
}
