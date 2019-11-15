package app;

/**
 * CircularList
 */
public class CircularList {

    private Node start;
    private int length; // Guardará el tamaño de la lista

    public CircularList() {
        start = null;
        length = 0;
    }

    public void add(Object value){
        if (isEmpty()) {
            start = new Node(value);
            start.next = start;
        } else {
            Node pointer = start;
            if (pointer.next == start) {
                start.next = new Node(value, start);
            } else {
                while (pointer.next != start) {
                    pointer = pointer.next;
                }

                pointer.next = new Node(value, start);
            }
        }
        
        length++;
    }

    // Saber si la lista está vacía o no
    public boolean isEmpty () {
        return start == null;
    }

    public Object getValue(int n) {
        if (isEmpty()) {
            return null;
        } else {
            Node pointer = start;
            int counter = 0;
            while (counter < n && pointer.next != null) {
                pointer = pointer.next;
                counter++;
            }

            if (counter != n) {
                return null;
            } else {
                return pointer.circularValue;
            }
        }
    }

    // Eliminar uno en concreto:
    public void deleteForCounter (int n) {
        if (!isEmpty()) {
            if (n == 0) {
                Node first = start;
                start = start.next;
                first.next = null;
            } else if (n < length) {
                Node pointer = start;
                int counter = 0;
                while (counter < (n-1)) {
                    pointer = pointer.next;
                    counter++;
                }
                
                Node temp = pointer.next; // Obtenemos la posición en concreto
                pointer.next = temp.next; // La igualamos a su siguiente
                temp.next = null; // Eliminamos el nodo en concreto
            }

            length--;
        }
    }

    // Obtener la longitud de la lista
    public int getLength () {
        return length;
    }
}
