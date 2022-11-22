/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Non_Recursively_Insert;

/**
 *
 * @author VSIT
 */
public class Main {

    public static void main(String[] args) {
        NRIBinaryTree bt = new NRIBinaryTree();
        System.out.println("Non-recursively insert 3, 5, 1, 4, 6, 8, 2, 9, 7");
        int[] a = {3, 5, 1, 4, 6, 8, 2, 9, 7};
        bt.addArray(a);
        System.out.println("Pre-order traverse: ");
        bt.preOrder(bt.root);
        System.out.println("\nIn-order traverse: ");
        bt.inOrder(bt.root);
        System.out.println("\nPost-order traverse: ");
        bt.postOrder(bt.root);
    }
}
