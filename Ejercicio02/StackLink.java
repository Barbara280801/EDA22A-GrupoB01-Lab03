public class StackLink<E> implements Stack<E>{
    private Node<E> tope;

    //agregar
    public E push(E x){
        if(empty()){
            this.tope = new Node<E>(x);
        }else{
            tope = new Node<E>(x, tope);
        }
        return tope.getData();
    }
    //elimina el tope y retorna lo eliminado
    public E pop()throws EmptyStackException{
        if(empty()){
            throw new EmptyStackException("Stack vacio");
        }
        E aux = this.tope.getData();
        this.tope = tope.getNext();
        return aux;
    }
    //devuelve el tope sin eliminarlo
    public E peek()throws EmptyStackException{
        if(empty()){
            throw new EmptyStackException("Stack vacio");
        }
        return this.tope.getData();
    }
    //vacìo = true
    public boolean empty(){
        return tope == null;
    }
    //busca
    public boolean search(E x){
        for (Node<E> i = this.tope; i!= null; i=i.getNext()) {
            if(x.equals(i.getData())){
               return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String str = "";
        for (Node<E> i = this.tope; i!= null; i=i.getNext()) {
            str += i.toString()+ " - ";
        }
        return str;
    }
}
