/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VSIT
 */
public class Dijkstra {

    // represent the whole graph by adjacency matrix
    int[][] graph;
    // the number of rows of graph
    int length;
    // vertices in character type
    char[] cv;

    public Dijkstra() {
        cv = "ABCDEFGHIKLMNO".toCharArray();
    }

    // setup adjacency matrix 
    void setGraph(int[][] b) {
        length = b.length;
        int i, j;
        graph = new int[length][length];
        for (i = 0; i < length; i++) {
            for (j = 0; j < length; j++) {
                graph[i][j] = b[i][j];
            }
        }
    }

    // display the whole adjacency matrix
    void displayMatrix() {
        int i, j;
        for (i = 0; i < length; i++) {
            System.out.println();
            for (j = 0; j < length; j++) {
                System.out.print("\t" + graph[i][j]);
            }
        }
    }

    // display a vertice based on it's index
    void visit(int i) {
        System.out.print(cv[i] + " ");
    }

    // dijkstra algorithm
    void dijkstraAlgo(int from, int to) {
        int ifn = 99;
        // check whethere a vertice was passed through or not
        boolean[] checked = new boolean[length];
        // the distance between the current point and point in front of current point
        int[] distance = new int[length];
        // the current point and point in front of current point
        int[] point = new int[length];
        // i: current point, md: minimum distance, v: holds index point 
        int i, md, v;
        // initialize the first status
        for (i = 0; i < length; i++) {
            // at first, no vertice was passed through
            checked[i] = false;
            // the distance of every vertices to vertice at index 'from'
            distance[i] = graph[from][i];
            // first vertice gonna be 'from'
            point[i] = from;
        }
        // consider the first vertice
        checked[from] = true;
        while (true) {
            md = ifn;
            v = -1;
            // consider all vertices that are adjacent to the current vertice
            for (i = 0; i < length; i++) {
                // save the minimum-distance vertice
                if (!checked[i] && distance[i] < md) {
                    md = distance[i];
                    v = i;
                }
            }
            // if the current vertice did not connect to another vertice, print it out
            if (v == -1) {
                System.out.println("No Solution");
                return;
            }
            // mark the minimum-distance vertice to be checked
            checked[v] = true;
            // if v is destination, break
            if (v == to) {
                break;
            }
            for (i = 0; i < length; i++) {
                // ignore the checked point
                if (checked[i] == true) {
                    continue;
                }
                // update the distance between the current point and other unchecked point 
                if (distance[v] + graph[v][i] < distance[i]) {
                    distance[i] = distance[v] + graph[v][i];
                    // save the index of updated vertice
                    point[i] = v;
                }
            }
        }
        // print out the result
        System.out.println("The shortest distance from the vertice " + cv[from] + " to the vertice " + cv[to] + " is: ");
        Stack s = new Stack();
        i = to;
        s.push(i);
        while (true) {
            i = point[i];
            s.push(i);
            if (i == from) {
                break;
            }
        }
        i = s.pop();
        System.out.print(cv[i]);
        while (!s.isEmpty()) {
            i = s.pop();
            System.out.print(" --> " + cv[i]);
        }
    }
}
