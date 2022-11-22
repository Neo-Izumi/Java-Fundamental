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
public class QueueNode {
    
    Object infor;
    QueueNode next;

    public QueueNode(Object x, QueueNode p) {
        infor = x;
        next = p;
    }

    public QueueNode(Object x) {
        this(x,null);
    }
    
}
