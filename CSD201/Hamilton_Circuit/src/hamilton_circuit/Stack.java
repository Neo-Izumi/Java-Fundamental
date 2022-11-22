/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamilton_circuit;

import java.util.LinkedList;

/**
 *
 * @author VSIT
 */
public class Stack {
    
    LinkedList<Integer> list;

    public Stack() {
        list = new LinkedList();
    }
    
    boolean isEmpty() {
        return list.isEmpty();
    }
    
    void push(int x) {
        list.addFirst(x);
    }
    
    Integer pop(){
        if (isEmpty()) return null;
        return list.removeFirst();
    }
    
    Integer top() {
        if (isEmpty()) return null;
        return list.getFirst();
    }
}
