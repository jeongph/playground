public class MyNode<E> {
    private E data;
    private MyDNode<E> next;

    public MyNode() {
        this.data = null;
        this.next = null;
    }

    public MyNode(E data) {
        this.data = data;
        this.next = null;
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
}