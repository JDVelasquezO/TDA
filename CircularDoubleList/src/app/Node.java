package app;

/**
 * Node
 */
public class Node {

    public Node next;
    public Node previous;
    public Object value;

    public Node (Object value, Node next, Node previous) {
        this.value = value; this.next = next; this.previous = previous;
    }

    public Node (Object value) {
        this(value, null, null);
    }
}