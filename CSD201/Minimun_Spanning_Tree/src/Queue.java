
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VSIT
 */
public class Queue {
    
    LinkedList<Integer> list;

    public Queue() {
        list = new LinkedList<>();
    }
    
    void clear() {
        list.clear();;
        return;
    }
    
    boolean isEmpty() {
        return list.isEmpty();
    }
    
    void enqueue(int x) {
        list.addLast(x);
        return;
    }
    
    Integer dequeue() {
        if (isEmpty()) return null;
        return list.removeFirst();
    }
    
    Integer front() {
        if (isEmpty()) return null;
        return list.getFirst();
    }
}
