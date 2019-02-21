package deque;

import queue.Queue;

public interface Deque<E> extends Queue<E> {

    void insertRight(E value);
    void insertLeft(E value);
    E removeRight();
    E removeLeft();

    E peekRight();
    E peekLeft();


}
