package domain.utils;

public interface Observer<T> {
    void update(T value);
}
