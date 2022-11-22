/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedStack;

/**
 *
 * @author VSIT
 */
public class Node {
    
    public Object infor;
    public Node next;
    
    public Node (Object x, Node p) {
        infor = x;
        next = p;
    }
    
    public Node(Object x) {
        this(x,null);
    }
}
