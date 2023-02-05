package practice;

import java.util.Iterator;

public class ArrayList<T> implements Iterable<T> {

    private T[] item = (T[]) new Object[5];
    private int N;

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    private int length() {
        return item.length;
    }

    private void resize(int max) {
        T[] temp = (T[]) new Object[max];
        for (int i = 0; i < N; i++)
            temp[i] = item[i];
        item = temp;
    }

    public void add(T t) {
        if (N == item.length) resize(2 * item.length);
        item[N++] = t;
    }

    public void add(int index, T t) {
        if (index < N) {
            T temp = item[index];
            T current = t;
            N++;
            for (int i = index; i < N; i++) {
                item[i] = current;
                current = temp;
                temp = item[i + 1];
            }
        }
    }

    public void remove(T t) {
        for (int i = 0; i < N; i++) {
            if (item[i].equals(t)) {
                item[i] = null;
                adjustArray(i);
                return;
            }
        }
    }

    public T remove(int index) {
        if (N > index) {
            T removedItem = item[index];
            item[index] = null;
            adjustArray(index);
            return removedItem;
        }
        return null;
    }

    public T get(int index) {
        if (index < N) return item[index];
        return null;
    }

    private void adjustArray(int skip) {
        int size = item.length;
        if (N > 0 && N == item.length / 4) size = item.length / 2;
        T[] temp = (T[]) new Object[size];
        for (int i = 0, j = 0; j < N - 1; i++) {
            if (i == skip) continue;
            temp[j] = item[i];
            j++;
        }
        N--;
        item = temp;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < N; i++) {
            s.append(item[i]);
            if (i + 1 != N) s.append(", ");
        }
        return s + "]";
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.isEmpty();
        list.add("Opara");
        System.out.println(list.toString());
        System.out.println("Length: " + list.length() + "\nSize: " + list.size());
        list.add("Benjamin");
        System.out.println(list.toString());
        System.out.println("Length: " + list.length() + "\nSize: " + list.size());
        list.add("Eze");
        System.out.println(list.toString());
        System.out.println("Length: " + list.length() + "\nSize: " + list.size());
        list.add("Ezenwa");
        System.out.println(list.toString());
        System.out.println("Length: " + list.length() + "\nSize: " + list.size());
        list.add("Nwa");
        System.out.println(list.toString());
        System.out.println("Length: " + list.length() + "\nSize: " + list.size());
        list.add("Ben1");
        System.out.println(list.toString());
        System.out.println("Length: " + list.length() + "\nSize: " + list.size());
        list.add("Ben2");
        System.out.println(list.toString());
        System.out.println("Length: " + list.length() + "\nSize: " + list.size());
        list.add("Ben3");
        System.out.println(list.toString());
        System.out.println("Length: " + list.length() + "\nSize: " + list.size());

        list.add(7, "Nice");
        System.out.println(list.toString());
        System.out.println("Length: " + list.length() + "\nSize: " + list.size());

        System.out.println();
        System.out.println();


//        list.remove("Ben2");
//        System.out.println(list.toString());
//        System.out.println("Length: " + list.length() + "\nSize: " + list.size());
//        list.remove("Eze");
//        System.out.println(list.toString());
//        System.out.println("Length: " + list.length() + "\nSize: " + list.size());
//        list.remove("Nwa");
//        System.out.println(list.toString());
//        System.out.println("Length: " + list.length() + "\nSize: " + list.size());
//        list.remove("Benjamin");
//        System.out.println(list.toString());
//        System.out.println("Length: " + list.length() + "\nSize: " + list.size());
//        list.remove("Opara");
//        System.out.println(list.toString());
//        System.out.println("Length: " + list.length() + "\nSize: " + list.size());
//        list.remove(0);
//        System.out.println(list.toString());
//        System.out.println("Length: " + list.length() + "\nSize: " + list.size());

//        System.out.println(list.get(0));
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<T> {
        int i = 0;

        public boolean hasNext() {
            return i < N;
        }

        @Override
        public T next() {
            return item[i++];
        }

        @Override
        public void remove() {
        }
    }
}
