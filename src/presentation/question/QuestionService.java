package presentation.question;


import domain.model.Question;
import domain.utils.Observer;
import domain.utils.Subject;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class QuestionService implements Subject<Question> {
    private List<Observer<Question>> observers = new ArrayList<>();

    @Override
    public void attach(Observer<Question> observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer<Question> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver(Question value) {
        for (Observer<Question> observer : observers) {
            observer.update(value);
        }
    }
}
