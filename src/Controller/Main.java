package Controller;

import Linked.LinkedListX;

public class Main {
    public static void main(String[] args) {

        LinkedListX<Integer> linkedListX = new LinkedListX<>();
        linkedListX.addFirst(1);
        linkedListX.addFirst(2);
        linkedListX.addFirst(3);
        linkedListX.addFirst(4);
        linkedListX.addFirst(5);
        linkedListX.deleteFirst();

        linkedListX.displayList();

    }
}
