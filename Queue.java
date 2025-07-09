public class Queue extends DynamicArray implements Comparable<Queue>, Xifo<String>, Fifo<String> {

    public int compareTo(Queue other) {
        return Integer.compare(this.getOccupancy(), other.getOccupancy());
    } // method compareTo

    public String peek() {
        return null;
    } // method peek

    public String pop() {
        return null;
    } // method pop

    public String toString() {
        return null;
    } // method toString

} // class Queue