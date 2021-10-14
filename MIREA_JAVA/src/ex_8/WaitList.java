package ex_8;

import java.util.Collection;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class WaitList<E> implements IWaitList<E> {
    protected Deque<E> content = new ConcurrentLinkedDeque<>();
    public WaitList();
    public WaitList(Collection<E> c);

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}
