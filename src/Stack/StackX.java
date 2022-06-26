package Stack;

public class StackX {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackX(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new int[this.maxSize];
        top = -1;
    }

    public void push(int element) {
        stackArray[++top] = element;
    }

    public int pop() {
        return stackArray[top--];
    }

    public int peek() {
        return stackArray[top];
    }

    public boolean isEmpty()

    {
        return (top == -1);
    }

    public boolean isFull()
    {
        return (top == maxSize - 1);
    }
}
