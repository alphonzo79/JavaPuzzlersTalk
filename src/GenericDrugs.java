/**
 * Created by jrowley on 10/2/15.
 */
public class GenericDrugs<E> {
    private Node<E> head = null;

    private class Node<E> {
        E value;
        Node<E> next;

        Node(E value) {
            this.value = value;
//            this.next = head;
//            head = this;
        }
    }

    public void add (E e) {
        new Node<E>(e);
    }

    public void dump() {
        for(Node<E> n = head; n != null; n = n.next)
            System.out.print(n.value + " ");
    }

    public static void main(String[] args) {
        GenericDrugs<String> list = new GenericDrugs<>();
        list.add("world");
        list.add("Hello");
        list.dump();
    }
}
