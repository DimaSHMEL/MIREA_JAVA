package Exercises.ex_16.orders;

public class DobleLinked<O> {
    private O current;
    private DobleLinked<O> prev;
    private DobleLinked<O> next;

    public O getCurrent() {
        return current;
    }

    public DobleLinked<O> getNext() {
        return next;
    }

    public DobleLinked<O> getPrev() {
        return prev;
    }

    public void setNext(DobleLinked<O> next) {
        this.next = next;
    }

    public void setPrev(DobleLinked<O> prev) {
        this.prev = prev;
    }

    public void setCurrent(O current) {
        this.current = current;
    }
}
