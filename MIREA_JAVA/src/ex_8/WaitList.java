package ex_8;

import java.util.Collection;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class WaitList<E> implements IWaitList<E> {
    protected Deque<E> content;
    public WaitList()
    {
        this.content = new ConcurrentLinkedDeque<>();
    }
    public WaitList(Collection<E> c)
    {
        this.content = new ConcurrentLinkedDeque<>(c);
    }
    public void add(E element) {
        content.add(element);
    }
    public E remove()
    {
        return content.remove();
    }
    public boolean contains(E element) {
        return content.contains(element);
    }
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }
    public boolean isEmpty() {
        return content.isEmpty();
    }

    public String toString() {
        return "content=" + content;
    }
}
