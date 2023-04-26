package towerdefense;

public class Queue<T> {

    private Node<T> head;
    private Node<T> end;
    private int size = 0;

    public void add(T value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
            end = temp;
        } else {
            end.setNext(temp);
            end = temp;
        }
        size++;
    }

    public T remove() {
        Node<T> temp = head;
        if (head == null) {
            System.out.println("La Fila esta vacia");
            return null;
        } else if (end == head) {
            head = null;
            end = null;
            size--;
            return temp.getValue();
        }
        head = head.getNext();
        size--;
        return temp.getValue();
    }

    public T get(int index) {
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    public int getSize() {
        return size;
    }
}
