package ex_8;

public class UnfairWaitList<E> extends WaitList<E> {
        public UnfairWaitList()
        {
                super();
        }
        public void remove(E element) {
                content.remove(element);
        }
        public void moveToBack()
        {
                content.add(content.remove());
        }
}
