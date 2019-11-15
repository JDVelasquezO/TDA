package app;

/**
 * Node
 */
public class Node {

    public Object value;
    public Node next, previous;

    public Node (Object value, Node next, Node previous) {
        this.value = value; this.next = next; this.previous = previous;
    }

    public Node (Object value) {
        this(value, null, null);
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

    /**
     * @param previous the previous to set
     */
    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    /**
     * @return the previous
     */
    public Node getPrevious() {
        return previous;
    }
}
