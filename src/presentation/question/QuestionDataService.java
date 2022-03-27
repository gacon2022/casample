package presentation.question;

import domain.model.Question;
import domain.model.QuestionData;
import domain.utils.Observer;
import domain.utils.Subject;

import java.util.ArrayList;
import java.util.List;

public class QuestionDataService implements Subject<QuestionData> {
    private List<Observer<QuestionData>> observers = new ArrayList<>();

    @Override
    public void attach(Observer<QuestionData> observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer<QuestionData> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver(QuestionData value) {
        for (Observer<QuestionData> observer : observers) {
            observer.update(value);
        }
    }
}
