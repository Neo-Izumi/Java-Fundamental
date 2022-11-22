/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursively_Insert;

/**
 *
 * @author VSIT
 */
public class RIBinaryTree {

    Node root;

    public RIBinaryTree() {
        this.root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void clear() {
        this.root = null;
    }

    Node insert(Node p, int x) {
        if (p == null) {
            p = new Node(x);
        } else {
            if (p.infor < x) {
                p.right = insert(p.right, x);
            } else if (p.infor > x) {
                p.left = insert(p.left, x);
            }
        }
        return p;
    }

    Node search (Node p, int x) {
        if (p==null) return null;
        else if (p.infor == x) return p;
        else if (p.infor > x) return search(p.left, x);
        else return search(p.right, x);    
    }    
    
    void insert(int x) {
        root = insert(root, x);
    }

    void visit(Node p) {
        if (p == null) {
            return;
        }
        System.out.print(p.infor + " ");
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
            insert(a[i]);
        }
    }
}
