package app;

/**
 * Node
 */
public class Node {

    public Object value;
    public Node next;

    public Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node(Object value) {
        this(value, null);
    }
}
