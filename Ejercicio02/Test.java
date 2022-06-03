public class Test {
    public static void main(String[] args) throws EmptyStackException {
        Stack<Integer> list = new StackLink<Integer>();
        try{
            System.out.println(list.search(4)); 
            list.push(2);
            System.out.println(list);
            list.push(4);
            System.out.println(list);
            list.push(6);
            System.out.println(list);
            list.push(9);
            System.out.println(list);
            System.out.println("Borrando tope");
            System.out.println(list.pop()); 
            System.out.println("Nuevo STACK");
            System.out.println(list);
            System.out.println("Obtener tope");
            System.out.println(list.peek()); 
            System.out.println("Está el 4?"); 
            System.out.println(list.search(4)); 
            
        }catch(EmptyStackException e){
            System.out.println(e.getMessage());
        }

    }
}
