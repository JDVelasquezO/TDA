package app;

/**
 * Node
 */
public class Node {

    private Object value;
    private Node next;

    public Node ( Object value, Node next ) {
        setValue(value); setNext(next);
    }

    public Node ( Object value ) {
        this(value, null);
    }

    /**
     * @param value the value to set
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * @return the value
     */
    public Object getValue() {
        return value;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * @return the next
     */
    public Node getNext() {
        return next;
    }
}