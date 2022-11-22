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
public class AVLInsertion {
    
    Node root;

    public AVLInsertion() {
        root = null;
    }
    
    boolean isEmpty() {
        return root==null;
    }
    
    Node rotateLeft (Node p) {
        if (p == null || p.right == null) {
            System.out.println("Cannot perform left rotation");
            return p;
        } 
        Node rl = p.right;
        p.right = rl.left;
        rl.left = p;
        return rl;
    }
    
    Node rotateRight (Node p) {
        if (p == null || p.left == null) {
            System.out.println("Cannot perform right rotation");
            return p;
        }
        Node rr = p.left;
        p.left = rr.right;
        rr.right = p;
        return rr;
    }
    
    Node leftBalance(Node p) {
        if (p.bal != -2) {
            System.out.println("No need to balance");
            return p;
        } else {
            Node p1 = p.left;
            // left left case
            if (p1.bal == -1) {
                p1.bal = 0;
                p.bal = 0;
                return rotateRight(p);
            } 
            // left right case
            else {
                Node p2 = p1.right;
                // p2 is balance subtree
                if (p2.bal == 0) {
                    p.bal = 0;
                    p1.bal = 0;
                } 
                // p2 is right-unbalance subtree
                else if (p2.bal == 1) {
                    p.bal = 0;
                    p1.bal = -1;
                } 
                // p2 is left-unbalance subtree
                else {
                    p.bal = 1;
                    p1.bal = 0;
                }
                p2.bal = 0;
                p.left = rotateLeft(p1);
                return rotateRight(p);
            }
        }
    }
    
    Node rightBalance(Node p) {
        if (p.bal != 2) {
            System.out.println("No need to balance");
        }
        Node p1 = p.right;
        switch (p1.bal) {
            // right right case
            case 1: 
                p.bal = 0;
                p1.bal = 0;
                return leftBalance(p);
            // right left case 
            case -1: 
                Node p2 = p1.left;
                switch (p2.bal) {
                    // p2 is balance subtree
                    case 0:
                        p.bal = 0;
                        p1.bal = 0;
                        break;
                    case 1:
                        p.bal = -1;
                        p1.bal = 0;
                        break;
                    case -1:
                        p.bal = 0;
                        p1.bal = 1;
                        break;
                }
                p2.bal = 0;
                p.right = rightBalance(p1);
                return leftBalance(p);
        }
        return p;
    }
    
    void insert(int x) {
        if (root == null) {
            root = new Node(x);
            return;
        }
        Node p, s, fp, fs, q, ud; 
        p = s = root;
        fp = fs = null;
        while (p != null) {
            if (p.infor == x) {
                System.out.println("A node with value " + x +" is already exist");
                return;
            }
            else if (p.infor < x) {
                fp = p;
                p = p.right;
            }
            else {
                fp = p;
                p = p.left;
            }
            // if a node is unbalance, s will hold it
            if (p!=null && p.bal!=0) {
                fs = fp;
                s = p;
            }
        }
        q = new Node(x);
        if (fp.infor > x) fp.left = q;
        else fp.right = q;
        p = s;
        // update balance index
        while (p!=q) {
            if (p.infor<x) {
                p.bal++;
                p = p.right;
            } else {
                p.bal--;
                p=p.left;
            }
        }
        if (Math.abs(s.bal)!=2) return;
        // balance the subtree
        if (s.bal == 2) ud = rightBalance(s);
        else ud = leftBalance(s);
        // append new balanced subtree to the fs
        if (fs == null) {
            root = ud;
            return;
        } 
        if (s == fs.left) {
            fs.left = ud;
            return;
        } else {
            fs.right = ud;
            return;
        }
    }
    
    void visit (Node p) {
        if (p==null) {
            return;
        }
        System.out.print(" " + p.infor + "("+p.bal+")");
    }
    
    void preOrder(Node p) {
        if (p==null) return;
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }
    
    void inOrder(Node p) {
        if (p==null) return;
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }
    
    void postOrder (Node p) {
        if (p==null) return;
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }
    
    void breadthTraverse () {
        LinkedQueue lq = new LinkedQueue();
        lq.enqueue(root);
        Node p;
        while (!lq.isEmpty()) {
            p = (Node) lq.dequeue();
            visit(p);
            if (p.left != null) lq.enqueue((Object) p.left);
            if (p.right != null) lq.enqueue((Object) p.right);
        }
    }
            
    void addArray (int[] a) {
        for (int i = 0; i < a.length; i++) {
            insert(a[i]);
        }
    }
    
}
