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
public class Main {
    public static void main(String[] args) {
        AVLInsertion t = new AVLInsertion();
        int[] a = {5, 10, 3, 1, 2, 8, 15, 4, 6, 9};
        t.addArray(a);
        System.out.println("\nPre-Order treverse: ");
        t.preOrder(t.root);
        System.out.println("\nIn-Order treverse: ");
        t.inOrder(t.root);
        System.out.println("\nPost-Order treverse: ");
        t.postOrder(t.root);
        System.out.println("\nBreadth first treverse: ");
        t.breadthTraverse();
    }
}
