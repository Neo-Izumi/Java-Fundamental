/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VSIT
 */
public class Main {
    public static void main(String[] args) {
        int[][] b = {
            {0, 1, 0, 1, 0},  
            {1, 0, 1, 0, 2},
            {0, 1, 0, 1, 2},
            {1, 0, 1, 0, 0},
            {0, 2, 2, 0, 0},
        };
        EulerGraph eg = new EulerGraph();
        eg.setData(b);
        System.out.println("\nDisplay adjacency matrix");
        eg.displayAdj();
        System.out.println("\nEuler Cycle begin with A: ");
        EulerCircuit ec;
        ec = eg.findEulerCircuit(0);
        ec.display();
        System.out.println();
    }
}
