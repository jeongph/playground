public class MyList<E> {
    MyDNode<E> node;
    int size = 0;

    public void add(E data) {
        if (size <= 0) {
            node = new MyDNode<>(data);
        } else {
            MyDNode<E> e = new MyDNode<>(data);
            e.setPrev(node);
            node.setNext(e);
            ++size;
        }
    }

    public MyDNode<E> getPrev() {
        return null;
    }

    public E get(int index) {
        this.checkSize(index);

        E returnData = null;
        MyDNode<E> pointer = this.node;
        while( index != this.size )
        {
            pointer = pointer.getPrev();
        }

        return pointer.getData();
    }

    public void remove(int index) {

    }

    private void checkSize(int index) {
        if ( index > this.size ) throw new StackOverflowError();
    }
}
