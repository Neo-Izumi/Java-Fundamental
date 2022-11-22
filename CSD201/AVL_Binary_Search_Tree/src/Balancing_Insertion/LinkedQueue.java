/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Balancing_Insertion;

/**
 *
 * @author VSIT
 */
public class LinkedQueue {
    
    private QueueNode head, tail;

    public LinkedQueue() {
        head=tail=null;
    }
    
    boolean isEmpty () {
        return head == null;
    }
    
    void clear() {
        head = tail = null;
    }
    
    Object front() {
        if (isEmpty()) return null;
        return head.infor;
    }
    
    Object dequeue() {
        if (isEmpty()) return null;
        Object x = head.infor;
        head = head.next;
        if (head == null) tail = null;
        return x;
    }
    
    void enqueue(Object x) {
        if (isEmpty()) {
            head = tail = new QueueNode(x);
            return;
        }
        tail = tail.next = new QueueNode(x);
    }
    
}
