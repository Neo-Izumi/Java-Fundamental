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
public class DelCopBinaryTree {
    
    Node root;

    public DelCopBinaryTree() {
        root=null;
    }
    boolean isEmpty() {
        return root == null;
    }

    void clear() {
        this.root = null;
    }
    
    Node search (Node p, int x) {
        if (p==null) return null;
        else if (p.infor == x) return p;
        else if (p.infor > x) return search(p.left, x);
        else return search(p.right, x);    
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
    
    void insert(int x) {
        root = insert(root, x);
    }
    
    void delCopy (int x) {
        if (isEmpty()) {
            System.out.println("This binary tree is empty");
            return;
        }
        Node p = root,f=null;
        // find value x in the binary tree, f holds parrent node of p
        while (p!=null) {
            if (p.infor == x) break;
            if (p.infor > x) {
                f = p;
                p=p.left;
            } else {
                f = p;
                p = p.right;
            }
        }
        if (p==null) {
            System.out.println("There is no node with value " + x + " in this tree");
            return;
        }
        // p is a leaf
        if (p.left == null && p.right == null) {
            // if p is root
            if (f==null) root=null;
            else if (f.infor > x) f.left = null;
            else f.right = null;
            return;
        }
        // if p only has left successors
        if (p.left != null && p.right == null) {
            if (f==null) root = p.left;
            else {
                if (f.infor > x) f.left = p.left;
                else f.right = p.left;
            }
            return;
        }
        // if p only has right successors
        else if (p.left == null && p.right != null) {
            if (f == null) root = p.right;
            else {
                if (f.infor > x) f.left = p.right;
                else f.right = p.right;
            }
            return;
        }
        // if p has both left and right successors
        else {
            Node pl=p.left, rm=null, frm = null;
            // find the rightmost subtree of binary tree having p.left as it's root 
            while (pl!=null) {
                frm = rm;
                rm = pl;
                pl = pl.right;
            }
            p.infor = rm.infor;
            if (rm == null) p.left = rm.left;
            else frm.right = rm.left;
        }
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
