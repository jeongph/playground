public class MyDNode<E> {
    private E data;
    private MyDNode<E> next;
    private MyDNode<E> prev;

    public MyDNode() {
    }

    public MyDNode(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public MyDNode<E> getNext() {
        return next;
    }

    public void setNext(MyDNode<E> next) {
        this.next = next;
    }

    public MyDNode<E> getPrev() {
        return prev;
    }

    public void setPrev(MyDNode<E> prev) {
        this.prev = prev;
    }
}
