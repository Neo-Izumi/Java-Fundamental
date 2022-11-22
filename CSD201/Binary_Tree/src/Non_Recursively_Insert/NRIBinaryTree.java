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
public class NRIBinaryTree {

    Node root;

    public NRIBinaryTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void clear() {
        root = null;
    }

    // search for a node with x is it's infor
    Node search(Node p, int x) {
        if (p == null) {
            return null;
        }
        if (p.infor == x) {
            return p;
        } else if (p.infor > x) {
            return search(p.left, x);
        } else {
            return search(p.right, x);
        }
    }

    // insert x to binary tree
    void insert(int x) {
        Node p = new Node(x);
        if (isEmpty()) {
            root = p;
            return;
        }
        Node n = null, m = root;
        while (m != null) {
            if (m.infor == x) {
                System.out.println("a node with " + x + " already exist");
            }
            n = m;
            if (m.infor > x) {
                m = m.left;
            } else {
                m = m.right;
            }
        }
        if (x > n.infor) {
            n.right = p;
        } else {
            n.left = p;
        }
    }

    void visit(Node p) {
        if (p == null) {
            return;
        }
        System.out.print(" " + p.infor);
    }
    
    void preOrder(Node p) {
        if (p == null) {
            return;
        }
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }

    void inOrder(Node p) {
        if (p == null) {
            return;
        }
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }

    void postOrder(Node p) {
        if (p == null) {
            return;
        }
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }

    void addArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            insert(new Integer(a[i]));
        }
    }
}
