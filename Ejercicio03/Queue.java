public interface Queue<E> {

    boolean add(E x);

    boolean offer(E x) throws ExceptionIsEmpty, NullPointerExeption;

    E remove() throws ExceptionIsEmpty;

    E poll();

    E element() throws ExceptionIsEmpty;

    E peek();

    boolean isEmpty();

}
