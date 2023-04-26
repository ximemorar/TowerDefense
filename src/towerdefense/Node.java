/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;

/**
 *
 * @author majochacon
 */
public class Node<T> {

    private T value;
    private Node next;
    private Node back;

    public Node(T value) {
        this.value = value;

    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setBack(Node back) {
        this.back = back;
    }

    public Node getBack() {
        return back;
    }

}
