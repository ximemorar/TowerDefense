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
public class Stack<T> {

    private Node<T> top;

    public Stack() {
        
    }

    public void push(T value) {
        Node current = new Node(value);
        current.setNext(top);
        top = current;
    }

    public T pop() {
        Node<T> temp = top;
        top = temp.getNext(); 
        temp.setNext(null);
        return temp.getValue();
    }
}
