package app;

/**
 * Node
 */
public class Node {

    public Object object;
    public Node next;

    public Node (Object object) {
        this.object = object;
        this.next = null;
    }
}