/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VSIT
 */
public class EulerGraph {
    
    int[][] a;
    int n;
    char[] v;

    public EulerGraph() {
        n=0;
        v="ABCDEFGHIKLMN".toCharArray();
    }
    
    void setData(int[][] b) {
        n=b.length;
        a=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = b[i][j];
            }
        }
    }
    
    void displayAdj() {
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.printf("%5d",a[i][j]);
            }
        }
    }
    
    void visit(int i) {
        System.out.print(v[i]+" ");
    }
    
    int deg(int i) {
        int deg=0;
        for (int j = 0; j < n; j++) {
            if (a[i][j] != 0) deg+=a[i][j];
        }
        if (a[i][i]!=0) deg+=a[i][i];
        return deg;
    }
    
    boolean  isDirected () {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j]!=a[j][i]) return true;
            }
        }
        return false;
    }
    
    boolean isConnected() {
        int tem;
        Stack s = new Stack();
        // cp holds connected part of the graph
        boolean [] cp = new boolean[n]; 
        for (int i = 0; i < n; i++) {
            // at first, nothing is connected
            cp[i] = false;
        }
        // consider the first vertex, and itself is a connected part
        s.push(0);
        cp[0] = true;
        // pass through all vertices of the graph, if a vertex is connected to the current connected part, push to stack
        while (!s.isEmpty()) {
            // the last vertex added to the stack gonnabe use to consider 
            tem = s.pop();
            for (int i = 0; i < n; i++) {
                if (!cp[i] && a[tem][i] > 0) {
                    s.push(i);
                    cp[i] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (!cp[i]) return false;
        }
        return true;
    }
    
    boolean hasAllEvenDeg() {
        for (int i = 0; i < n; i++) {
            if (deg(i) % 2 == 1) return false;
        }
        return true;
    }
    
    boolean  hasIsolatedVertex() {
        for (int i = 0; i < n; i++) {
            if (deg(i) == 0) return true;
        }
        return false;
    }
    
    EulerCircuit findEulerCircuit (int k) {
        if (isDirected() || !isConnected() || !hasAllEvenDeg() || hasIsolatedVertex()) {
            System.out.println("The conditions of a graph having Euler circuit are not satisfied");
            return null;
        }
        Stack s = new Stack();
        int[][] b = new int[n][n];
        int tem,i;
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = a[i][j];
            }
        }
        EulerCircuit ec = new EulerCircuit();
        s.push(k);
        while (!s.isEmpty()) {
            // get the last added vertex to consider
            tem = s.top();
            i=0;
            // find the adjacent vertex of the considered vertex
            while (i<n && a[tem][i] == 0) {
                i++;
            }
            // if the considered vertex is isolated, add to euler circuit
            if (i==n) {
                tem = s.pop();
                ec.add(tem);
            }
            // if i is adjacent vertex of the considered vertex, push to stack and decrease the connected edge by 1
            else {
                s.push(i);
                a[tem][i]--;
                a[i][tem]--;
            }
        }
        setData(b);
        return ec;
    }
}
