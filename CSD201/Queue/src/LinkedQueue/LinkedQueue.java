/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedQueue;

/**
 *
 * @author VSIT
 */
public class LinkedQueue {

    protected Node head, tail;

    public LinkedQueue() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    Object front() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        return (head.info);
    }

    public Object dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        Object x = head.info;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return (x);
    }

    void enqueue(Object x) {
        if (isEmpty()) {
            head = tail = new Node(x);
        } else {
            tail.next = new Node(x);
            tail = tail.next;
        }
    }

    void displayAll() {
        Node p = head;
        while (p != null) {
            System.out.println(p.info + " ");
            p = p.next;
        }
        System.out.println();
    }
}
