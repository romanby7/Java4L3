package deque;

import queue.QueueImpl;

public class DequeImpl<E> extends QueueImpl<E> implements Deque<E>   {


    public DequeImpl(int maxSize) {
        super(maxSize);
    }

    @Override
    public void insertRight(E value) {
        super.insert(value);

    }

    @Override
    public void insertLeft(E value) {
        if (front == DEFAULT_FRONT) {
            front = data.length;
        }

        data[--front] = value;
        size++;
    }

    @Override
    public E removeRight() {
        E value = data[rear--];
        if (rear == DEFAULT_REAR) {
            rear = data.length - 1;
        }

        size--;
        return value;

    }

    @Override
    public E removeLeft() {
        return super.remove();
    }

    @Override
    public E peekRight() {
        return data[rear];
    }

    @Override
    public E peekLeft() {
       return super.peek();
    }
}
