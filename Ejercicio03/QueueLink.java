public class QueueLink<E> implements Queue<E> {

    private Node<E> first, last;

    public QueueLink() {
        this.first = null;
        this.last = null;
    }

    @Override
    public boolean add(E x) {
        Node<E> aux = new Node<E>(x);
        if (this.isEmpty()) {
            this.first = aux;
            this.last = this.first;
        } else {
            this.last.setNext(aux);
            this.last = aux;
        }
        return true;
    }

    // Método para colas con capacidad restringida
    @Override
    public boolean offer(E x) throws NullPointerExeption {
        Node<E> aux = new Node<E>(x);
        if (x == null) {
            throw new NullPointerExeption("La cola no permite elementos nulos");
        }
        if (this.isEmpty()) {
            this.first = aux;
            this.last = this.first;
        } else {
            this.first.setNext(aux);
            this.last = aux;
        }
        return true;
    }

    @Override
    public E remove() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Queue vacio");
        }
        Node<E> item = this.first;
        this.first = this.first.getNext();
        return item.getData();
    }

    @Override
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        Node<E> item = this.first;
        this.first = this.first.getNext();
        return item.getData();
    }

    @Override
    public E element() throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("Queue vacio");

        return this.first.getData();
    }

    @Override
    public E peek() {
        return first.getData();
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

}
