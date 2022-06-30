package Stack;

import Linked.LinkedListX;

public class StackLink<T> {

    private LinkedListX<T> linkedListX;

    public StackLink() {
        linkedListX = new LinkedListX<>();
    }

    public void pus(T element)
    {
        linkedListX.addFirst(element);
    }

    public void pop ()
    {
        linkedListX.deleteFirst();
    }
}
