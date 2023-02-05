package basic_math;

public interface Iterator<Item> {
    boolean hasNext();

    Item next();

    void remove();
}
