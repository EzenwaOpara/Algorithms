package practice;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueArrayList<T> {

    private Object[] item;
    private int N;
    private int head;
    private int tail;

    QueueArrayList() {
        item = new Object[5];
    }

    //isEmpty
    public boolean isEmpty() {
        return N == 0;
    }

    //size
    public int size() {
        return N;
    }

    //enqueue
    public void enqueue(T t) {
        item[N - 1] = t;

    }

//    private void resize(int size) {
//        ArrayList<T> temp = new ArrayList<>();
//        for (int i = 0; i < size; i++) {
//            temp.add(size, item.get(N));
//        }
//
//    }
//
//    //dequeue
//    public T dequeue() {
//        return item.remove(N--);
//    }
    //iterator


    public static void main(String[] args) {
//        QueueArrayList<String> list = new QueueArrayList<>();
//        list.enqueue("How");
//        list.enqueue("Are");
//        list.enqueue("You");
//        list.dequeue();
//        list.enqueue("My");
//        list.enqueue("Friend");

        Queue<String> strings = new ArrayDeque<>();
        strings.add("How");
        strings.add("Are");
        strings.add("You");
        strings.remove();
        strings.add("My");
        strings.add("Friend");
        System.out.println(strings.toString());
    }
}
