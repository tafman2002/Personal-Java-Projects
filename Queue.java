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
        int rc;
        if (qSize == 0) {
            System.out.println("Nothing to Dequeue");
            rc = -1;
        } else {
            // Since a Queue has a FIFO structure, all the items except the first
            // in Stack 1 are popped and placed temporarily into Stack 2
            for (int i = 0; i < qSize-1;i++) {
                int temp = s1.pop();
                s2.push(temp);
            }

            // Removes the last element in the first stack to return it at the end
            // of the code, successfully dequeuing the front item
            rc = s1.pop();

            // All the rest of the items placed in Stack 2 are popped and placed back into
            // Stack 1, retaining the same sequence order. The Queue size is then decremented
            // to reflect the change in size.
            for (int i = 0; i < qSize-1; i++) {
                int temp = s2.pop();
                s1.push(temp);
            }
            qSize--;
        }
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
