public class Test {
    public static void main(String[] args) throws Exception {
        Queue<String> queue = new QueueLink<String>();
        queue.add("Hola");
        queue.add("Mundo");
        queue.add("!");
        // test remove
        try {
            System.out.println(queue.element()); // Retorna la cabecera pero no la elimina - (Hola)
            System.out.println(queue.remove()); // Hola
            System.out.println(queue.remove()); // Mundo
            System.out.println(queue.peek()); // Retorna la cabecera pero no la elimina - ( ! )
            System.out.println(queue.remove()); // !
            System.out.println(queue.poll()); // Como no quedan elementos retorna null y no lanza excepcion (no elimina
                                              // ya que no quedan elementos)
            System.out.println(queue.remove()); // Lanza excepcion porque no queda elementos

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(queue.element()); // Lanza excepcion porque no queda elementos
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            queue.offer(null); // Lanza excepcion porque no permite elementos null
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
