/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedStack;

import java.util.EmptyStackException;

/**
 *
 * @author VSIT
 */
public class LinkedStack {

    protected Node head;
    
    public LinkedStack() {
        head = null;
    }
    
    public boolean isEmpty () {
        return head == null;
    }
    
    public void push(Object x) {
        head = new Node(x, head);
    }
    
    Object top() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException();
        return head.infor;
    }
    
    public Object pop() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException();
        Object x = head.infor;
        head = head.next;
        return x;
    }
    
    public void displayAll() {
        System.out.println("Elements in the list: ");
        for (Node p = head; p != null; p = p.next) {
            System.out.print(p.infor + " ");
        }
        System.out.println();
    }
}
