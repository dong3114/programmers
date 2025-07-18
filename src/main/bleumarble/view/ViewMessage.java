package main.bleumarble.view;

import java.util.List;

/**
 * 1 ~ n개의 메세지를 담을 객체 반환
 * 특이사항: (Input) 존재
 * @param <I> InputData
 */
@FunctionalInterface
public interface ViewMessage<I> {
    List<String> getMessage(I i);
}
