package towerdefense;

public class DoublyLinkedList<T> {

    private Node<T> root;
    private Node<T> end;
    private int size = 0;

    public void add(T value) {
        Node temp = new Node(value);
        if (root == null) {
            root = temp;
            end = temp;
            temp.setNext(temp);
            temp.setNext(temp);
        } else {
            temp.setBack(end);
            temp.setNext(root);
            end.setNext(temp);
            root.setBack(temp);
            end = temp;
        }

        size++;
    }

    public T get(int index) {
        if (size == 0) {
            System.out.println("La lista esta vacia");
            return null;
        } else if (index >= size || index < 0) {
            System.out.println("Error, Indice fuera del rango de la lista.");
            return null;
        } else {
            Node<T> current = root;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current.getValue();
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEnd(int index) {
        if (size == 0) {
            System.out.println("La lista esta vacia");
            return false;
        } else if (index >= size || index < 0) {
            System.out.println("Error, Indice fuera del rango de la lista.");
            return false;
        } else {
            Node<T> current = root;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            if (current == end) {
                return true;
            }
            return false;
        }
    }

    public boolean isRoot(int index) {
        if (size == 0) {
            System.out.println("La lista esta vacia");
            return false;
        } else if (index >= size || index < 0) {
            System.out.println("Error, Indice fuera del rango de la lista.");
            return false;
        } else {
            Node<T> current = root;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            if (current == root) {
                return true;
            }
            return false;
        }
    }
}
