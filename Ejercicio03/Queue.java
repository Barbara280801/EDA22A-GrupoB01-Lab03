public interface Queue<E> {

    void enqueue(E x);

    boolean add() throws ExceptionIsEmpty;

    boolean offer() throws ExceptionIsEmpty;

    E remove() throws ExceptionIsEmpty;

    E pull();

    E element();

    E peek();

    boolean isEmpty();
}
