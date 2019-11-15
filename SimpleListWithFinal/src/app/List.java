package app;

/**
 * List
 */
public class List {

    private int length;
    private Node start, end;

    public List() {
        start = end = null;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public void insertStart ( Object value ) {
        
        if ( isEmpty() ) {
            start = end = new Node(value);
        } else {
            start = new Node(value, start);
        }

        length++;
    }

    public void insertFinish ( Object value ) {

        if ( isEmpty() ) {
            start = end = new Node(value);
        } else {
            end.setNext(new Node(value));
            end = end.getNext();
        }

        length++;
    }

    public void removeStart () {
        if (start == end) {
            start = end = null;
        } else {
            start = start.getNext();
        }

        length--;
    }

    public void removeEnd () {
        if (start == end) {
            start = end = null;
        } else {
            Node temp = start;

            while (temp.getNext() != end) {
                temp = temp.getNext();
            }

            end = temp;
            end.setNext(null);
        }

        length--;
    }

    public Object getValue (int n) {
        if (isEmpty()) {
            return null;
        } else {
            Node pointer = start;
            int counter = 0;
            while (counter < n && pointer.getNext() != null) {
                pointer = pointer.getNext();
                counter++;
            }

            if (counter != n) {
                return null;
            } else {
                return pointer.getValue();
            }
        }
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
     * @param end the end to set
     */
    public void setEnd(Node end) {
        this.end = end;
    }

    /**
     * @return the start
     */
    public Node getStart() {
        return start;
    }

    /**
     * @return the end
     */
    public Node getEnd() {
        return end;
    }
}