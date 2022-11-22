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
        Dijkstra d = new Dijkstra();
        int[][] b = {
            {0, 7, 9, 99, 99, 14},
            {7, 0, 10, 15, 99, 99},
            {9, 10, 0, 11, 99, 2},
            {99, 15, 11, 0, 6, 99},
            {99, 99, 99, 6, 0, 9},
            {14, 99, 2, 99, 9, 0},
        };
        d.setGraph(b);
        d.displayMatrix();
        System.out.println("\nTest Dijkstra algirithm: ");
        d.dijkstraAlgo(0, 5);
        System.out.println();
    }
}
