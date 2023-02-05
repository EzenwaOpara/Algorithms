package practice;

import java.util.Iterator;

public class QueueLinkedList<T> implements Iterable<T> {

    private Node first;
    private int N;

    private class Node {
        private T item;
        private Node next;
    }

    //add from the beginning
    public void add(T t) {
        Node odlFirst = first;
        first = new Node();
        first.next = odlFirst;
        first.item = t;
        N++;
    }

    //remove the end
    public T remove() {
        T t = first.item;
        first = first.next;
        N--;
        return t;
    }


    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T t = current.item;
            current = current.next;
            return t;
        }
    }

    public static void main(String[] args) {
        QueueLinkedList<String> strings = new QueueLinkedList<>();
        strings.add("How");
        strings.add("Are");
        strings.add("You");
        strings.add("My");
        strings.add("Friend");

        System.out.println(strings.N);
        for (String s : strings) System.out.println(s);
    }
}
