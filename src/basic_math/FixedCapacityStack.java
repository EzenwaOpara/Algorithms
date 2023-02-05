package basic_math;

import lib.StdIn;
import lib.StdOut;

public class FixedCapacityStack<Item> {
    private Item[] a; // stack entries
    private int N; // size

    public FixedCapacityStack(int cap) {
        a = (Item[]) new Object[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

//    public void push(Item item) {
//        a[N++] = item;
//    }
//
//    public Item pop() {
//        return a[--N];
//    }

    private void resize(int max) { // Move stack of size N <= max to a new array of size max.
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++)
            temp[i] = a[i];
        a = temp;
    }

    public void push(Item item) { // Add item to top of stack.
        if (N == a.length) resize(2 * a.length);
        a[N++] = item;
    }

    public Item pop() { // Remove item from top of stack.
        Item item = a[--N];
        a[N] = null; // Avoid loitering
        if (N > 0 && N == a.length / 4) resize(a.length / 2);
        return item;
    }

    public static void main(String[] args) {
        FixedCapacityStack<String> s;
        s = new FixedCapacityStack<>(100);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                s.push(item);
            else if (!s.isEmpty()) StdOut.print(s.pop() + " ");
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }

    public class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;

        public boolean hasNext() {
            return i > 0;
        }

        public Item next() {
            return a[--i];
        }

        public void remove() {
        }
    }
}
