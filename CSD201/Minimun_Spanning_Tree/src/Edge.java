/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VSIT
 */
public class Edge {
    
    int u, v, weight;

    public Edge(int u, int v, int weight) {
        this.u = u;
        this.v = v;
        this.weight = weight;
    }

    public Edge(Edge h) {
        this.u = h.u;
        this.v = h.v;
        this.weight = h.weight;
    }
    
    void display() {
        System.out.println(" (" + (u+1) + ", " + (v+1) +", weight is " + weight + ")");
    }
}
