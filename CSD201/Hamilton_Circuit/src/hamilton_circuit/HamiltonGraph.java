/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamilton_circuit;

import java.io.*;
import java.util.*;

/**
 *
 * @author VSIT
 */
public class HamiltonGraph {
    
    int[][] matrix;
    int l;
    char[] cv;

    public HamiltonGraph() {
        cv = "ABCDEFGHIKLMNO".toCharArray();
    }
    
    void setData(String fn) throws IOException {
        String s = "", s1 = "";
        StringTokenizer st;
        RandomAccessFile f = new RandomAccessFile(fn, "r");
        s = f.readLine();
        l = Integer.parseInt(s.trim());
        matrix = new int[l][l];
        for (int i = 0; i < l; i++) {
            s = f.readLine();
            st = new StringTokenizer(s);
            for (int j = 0; j < l; j++) {
                s1 = st.nextToken();
                matrix[i][j] = Integer.parseInt(s1.trim());
            }
        }
        f.close();
    }
    
    void displayMatrix() {
        System.out.println("\nThe adjacency matrix of the graph:");
        System.out.println("====================================");
        for (int i = 0; i < l; i++) {
            System.out.println();
            for (int j = 0; j < l; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
        }
        System.out.println();
    }
    
    void displayCircuit(HamiltonCircuit hc) {
        for (int i = 0; i <= hc.count; i++) {
            System.out.print("\t" + cv[hc.circuit[i]]);
        }
        System.out.println();
    }
    
    boolean  isUndirected() {
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (matrix[i][j] != matrix[j][i]) return false;
            }
        }
        return true;
    }
    
    boolean isConnected() {
        int con;
        boolean[] visited = new boolean[l];
        boolean[] pushed = new boolean[l];
        for (int i = 0; i < l; i++) {
            visited[i] = false;
            pushed[i] = false;
        }
        Stack s = new Stack();
        s.push(0);
        pushed[0] = true;
        while (!s.isEmpty()) {            
            con = s.pop();
            visited[con] = true;
            for (int i = 0; i < l; i++) {
                if (matrix[con][i] > 0 && !pushed[i]) {
                    s.push(i);
                    pushed[i] = true;
                }
            }
        }
        for (int i = 0; i < l; i++) {
            if (!visited[i]) return false;
        }
        return true;
    }
    
    void hamiltonNext(HamiltonCircuit hc, boolean visited[], int i) {
        for (int j = 0; j < l; j++) {
            if (matrix[hc.circuit[i-1]][j] > 0 && !visited[j]) {
                hc.circuit[i] = j;
                hc.count++;
                visited[j] = true;
                if (i < l) {
                    if (hc.circuit[i] != hc.circuit[0]) hamiltonNext(hc, visited, i+1);
                } else if (hc.circuit[i] == hc.circuit[0]) displayCircuit(hc);
                visited[j] = false;
                hc.count--;
            }
        }
    }
    
    void hamiltonCircuit (int k) {
        if (!isUndirected() || !isConnected()) {
            System.out.println("The condition are not satisfied");
            return;
        } 
        HamiltonCircuit hc = new HamiltonCircuit();
        boolean [] visited = new boolean[l];
        for (int i = 0; i < l; i++) {
            visited[i] = false;
        }
        hc.circuit[0] = k;
        System.out.println("\nHamilton Circuits start with " + cv[k] + ": ");
        hamiltonNext(hc, visited, 1);
    }
}
