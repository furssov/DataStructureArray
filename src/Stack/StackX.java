package Stack;

public class StackX<T> {
    private int maxSize;
    private T[] stackArray;
    private int top;

    public StackX(int maxSize) {
        this.maxSize = maxSize;
        stackArray = (T[]) new Object[this.maxSize];
        top = -1;
    }

    public void push(T element) {
        stackArray[++top] = element;
    }

    public T pop() {
        return stackArray[top--];
    }

    public T peek() {
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
