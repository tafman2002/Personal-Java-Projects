public class Stack {
    // Instance variables
    private int [] item;
    private int size;

    public Stack() {
        item = new int[8];
        size = 0;
    }
    public int peek() {
        return item[size-1];
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    public int getSize(){
        return size;
    }

    public void push(int value) {
        if(size >= item.length) {
            int [] temp = new int[item.length * 2];
            for (int i = 0; i < item.length; i++){
                temp[i] = item[i];
            }
            item = temp;
        }
        item[size] = value;
        size++;
    }

    public int pop(){
        int value = item[size - 1];
        size--;
        return value;
    }

    public void print() {
        for (int i = 0; i < size; i++){
            System.out.print(item[i] + " ");
        }
        System.out.println();
    }
}
