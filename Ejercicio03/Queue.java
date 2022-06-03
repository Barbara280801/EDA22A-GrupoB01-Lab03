public interface Queue<E> {

    boolean add(E x);

    boolean offer(E x) throws ExceptionIsEmpty;

    E remove() throws ExceptionIsEmpty;

    E pull();

    E element();

    E peek();

    boolean isEmpty();
}
