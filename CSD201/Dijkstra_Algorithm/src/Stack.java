
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
public class Stack {
    
    LinkedList<Integer> st;

    public Stack() {
        st = new LinkedList<>();
    }
    
    void clear() {
        st.clear();
    }
    
    boolean isEmpty() {
        return st.isEmpty();
    }
    
    void push(Integer x) {
        st.addFirst(x);
    } 
    
    Integer pop() {
        if (isEmpty()) return null;
        return (st.removeFirst());
    }
    
    Integer top() {
        if (isEmpty()) return null;
        return st.getFirst();
    }
}
