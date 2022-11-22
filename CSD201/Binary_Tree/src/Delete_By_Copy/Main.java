/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delete_By_Copy;

/**
 *
 * @author VSIT
 */
public class Main {
    public static void main(String[] args) {
        DelCopBinaryTree dc = new DelCopBinaryTree();
        System.out.println("Non-recursively insert 3, 5, 1, 4, 6, 8, 2, 9, 7");
        int[] a = {3, 5, 1, 4, 6, 8, 2, 9, 7};
        dc.addArray(a);
        System.out.println("Pre-order traverse: ");
        dc.preOrder(dc.root);
        System.out.println("\nIn-order traverse: ");
        dc.inOrder(dc.root);
        System.out.println("\nPost-order traverse: ");
        dc.postOrder(dc.root);
        dc.delCopy(6);
        System.out.println("\nPre-order traverse: ");
        dc.preOrder(dc.root);
        System.out.println("\nIn-order traverse: ");
        dc.inOrder(dc.root);
        System.out.println("\nPost-order traverse: ");
        dc.postOrder(dc.root);
    }
}
