public class Queue {
    private Stack s1;
    private Stack s2;
    int qSize;

    public Queue () {
        s1 = new Stack();
        s2 = new Stack();
        qSize = 0;
    }

    /**
     * Enqueues the element v onto the Queue
     *
     * @param v (Value)
     */
    public void enqueue(int v) {
        s1.push(v);
        qSize++;
    }

    /**
     * Dequeues the first element from the Queue and returns it
     * @return Removed element
     */
    public int dequeue () {
        int rc = -1;
        for (int i = 0; i < qSize-1;i++) {
            int temp = s1.pop();
            s2.push(temp);
        }

        rc = s1.pop();

        for (int i = 0; i < qSize-1; i++) {
            int temp = s2.pop();
            s1.push(temp);
        }
        qSize--;
        return rc;
    }

    /**
     * Returns the total number of elements inside the Queue
     * @return Size of the Queue
     */
    public int queueSize() {
        return qSize;
    }

    /**
     * Prints off all of the elements inside Queue
     */
    public void printQueue() {
        s1.print();
    }
}
