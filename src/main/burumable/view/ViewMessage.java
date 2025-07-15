package main.burumable.view;

import java.util.List;

@FunctionalInterface
public interface ViewMessage<T> {
    List<T> getMessage(T t);
}
