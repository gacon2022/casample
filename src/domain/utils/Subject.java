package domain.utils;

// Subject của Observer Design pattern
public interface Subject<T> {
    void attach(Observer<T> observer);

    void detach(Observer<T> observer);

    void notifyAllObserver(T value);
}
