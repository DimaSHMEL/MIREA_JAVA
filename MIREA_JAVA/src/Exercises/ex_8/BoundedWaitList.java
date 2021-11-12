package Exercises.ex_8;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity = 0;
    public BoundedWaitList(int capacity)
    {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
    public void add(E element) {
        if(content.size() < getCapacity())
            super.add(element);
        else
            System.out.println("FULL CONTENT");
    }
    public String toString() {
        return "capacity=" + capacity + " " + super.toString();
    }
}
