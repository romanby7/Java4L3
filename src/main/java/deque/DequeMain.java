package deque;

public class DequeMain {

    private enum Side {
        LEFT,
        RIGHT
    }

    public static void main(String[] args) {
        Deque<Integer> deque = new DequeImpl<>(5);
        insert(deque, Side.LEFT, 1);
        insert(deque, Side.LEFT, 2);
        insert(deque, Side.RIGHT, 3);
        insert(deque, Side.RIGHT, 4);
        insert(deque, Side.RIGHT, 5);
        insert(deque, Side.RIGHT, 100);

        System.out.println(deque.size());
        System.out.println(deque.peekLeft());
        System.out.println(deque.peekRight());

        while (!deque.isEmpty()){
            System.out.println(remove(deque, Side.RIGHT));
            System.out.println(remove(deque, Side.LEFT));
        }

    }


    private static <E> void insert(Deque<E> deque, Side side, E value) {
        if (!deque.isFull()){
            switch (side) {
                case LEFT:
                    deque.insertLeft(value);
                    break;
                case RIGHT:
                    deque.insertRight(value);
                    break;
                default:
                    break;
            }

        }
    }

    private static <E> E remove(Deque<E> deque, Side side) {
        E value = null;
        if (!deque.isEmpty()) {
            switch (side) {
                case LEFT:
                    value = deque.removeLeft();
                    break;
                case RIGHT:
                    value = deque.removeRight();
                    break;
                default:
                    break;
            }

        }

        return value;

    }



}
