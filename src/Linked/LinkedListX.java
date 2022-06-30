package Linked;

public class LinkedListX<T> {

    Link<T> first;

    public LinkedListX() {
        first = null;
    }

    public void addFirst(T element)
    {
        Link<T> l = new Link<>(element);
        l.next = first;
        first = l;
    }

    public boolean deleteFirst()
    {
        if (first != null)
        {
            first = first.next;
            return true;
        }
        return false;
    }

    public void displayList()
    {
        Link current = first;
        while(current != null)
        {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println("");
    }

    class Link<T> {
        public T value;
        public Link<T> next;

        public Link(T value) {
            this.value = value;
        }
    }

}
