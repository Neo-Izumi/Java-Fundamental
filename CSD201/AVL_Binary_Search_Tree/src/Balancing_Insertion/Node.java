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
public class Node {
    
    int infor, bal;
    Node left, right;

    public Node(int x) {
        infor = x;
        bal = 0;
        left = right = null;
    }
    
}
