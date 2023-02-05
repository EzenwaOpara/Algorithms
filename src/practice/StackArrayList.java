package practice;

import java.util.Iterator;

public class StackArrayList<T> implements Iterable<T> {

    private ArrayList<T> item;
    private int N;

    public StackArrayList() {
        item = new ArrayList<>();
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public T pop() {
        return item.remove(--N);
    }

    public void push(T t) {
        N++;
        item.add(t);
    }

    public T peek() {
        return item.get(N - 1);
    }

    @Override
    public String toString() {
        return "Stack: " + item.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }

    public static void main(String[] args) {
        StackArrayList<Integer> integerStack = new StackArrayList<>();
        integerStack.push(0);
//        System.out.println(integerStack.toString());
        integerStack.push(1);
//        System.out.println(integerStack.toString());
        integerStack.push(2);
//        System.out.println(integerStack.toString());
        integerStack.push(3);
//        System.out.println(integerStack.toString());
//        integerStack.pop();
//        System.out.println(integerStack.toString());
        integerStack.push(4);
//        System.out.println(integerStack.toString());
        integerStack.push(5);
//        System.out.println(integerStack.toString());
//        integerStack.pop();
//        System.out.println(integerStack.toString());
//        integerStack.pop();
//        System.out.println(integerStack.toString());
        //      integerStack.pop();
//        System.out.println(integerStack.toString());
        integerStack.push(6);
//        System.out.println(integerStack.toString());
        integerStack.push(7);
//        System.out.println(integerStack.toString());
//        integerStack.pop();
//        System.out.println(integerStack.toString());

        for (Integer t : integerStack) System.out.print(t + " ");

//        Stack<String> strings = new Stack<>();
//        strings.push("How");
//        strings.push("are");
//        strings.push("you");
//        strings.push("my");
//        strings.push("friend");
//
//        for (String s : strings) System.out.print(s + " ");
    }


    private class StackIterator implements Iterator<T> {
        int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public T next() {
            return item.get(--i);
        }

        @Override
        public void remove() {

        }
    }
}
