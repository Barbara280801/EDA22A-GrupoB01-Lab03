public interface Stack<E> {

    public E push(E x);

    public E pop()throws EmptyStackException;

    public E peek()throws EmptyStackException;

    public boolean empty();

    public boolean search(E x);
}
