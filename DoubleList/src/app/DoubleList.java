package app;

/**
 * DoubleList
 */
public class DoubleList {

    private Node start;
    private int length;

    public DoubleList () {
        start = null;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public void addFinish(Object value) {
        Node node = new Node(value);
        if (isEmpty()) {
            this.setStart(node);
        } else {
            Node pointer = this.getStart();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }

            pointer.setNext(node);
            node.setPrevious(pointer);
        }
        
        length++;
    }

    public void delete (int id) {
        Node pointer = start;
        int counter = 0;

        while (counter < id && pointer.next != null) {
            pointer = pointer.next;
            counter++;
        }
        
        pointer.previous.setNext(pointer.next);
        pointer.next.setPrevious(pointer.previous);
        // pointer = null;

        length--;
    }

    public Object getValue(int id) {
        Node pointer = start;
        int counter = 0;
        if (counter < id && pointer.next != null) {
            pointer = pointer.next;
            counter++;
        }

        return pointer.value;
    }

    public int getLength() {
        return length;
    }

    /**
     * @param start the start to set
     */
    public void setStart(Node start) {
        this.start = start;
    }

    /**
     * @return the start
     */
    public Node getStart() {
        return start;
    }
}