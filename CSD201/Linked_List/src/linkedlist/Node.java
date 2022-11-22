/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author VSIT
 */
public class Node {
    
    Person infor;
    Node next;

    public Node(Person x, Node p) {
        this.infor = x;
        this.next = p;
    }

    public Node(Person x) {
        this(x,null);
    }
    
    
}
