
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VSIT
 */
public class KruskalAlgorithm {
    
    int[][] matrix;
    int l, count;
    char[] cv;
    Edge[] edges;

    public KruskalAlgorithm() {
        cv = "ABCDEFGHIJKLMN".toCharArray();
        count = l = 0;
    }
    
    void setBlank(int k) {
        l = k;
        matrix = new int[l][l];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                matrix[i][j] = 0;
            }
        }
    }
    
    void createEdgeList() {
        int k = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (matrix[i][j] > 0) k++;
            }
        }
        count = k;
        edges = new Edge[count];
        k = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (matrix[i][j] > 0) edges[k++] = new Edge(j, j, matrix[i][j]);
            }
        }
    }
    
    void sortEdgeList() {
        int min;
        Edge e;
        for (int i = 0; i < count-1; i++) {
            min = i;
            for (int j = 0; j < count; j++) {
                if (edges[j].weight < edges[min].weight) {
                    min = j;
                }
            }
            if (min != i) {
                e = edges[i];
                edges[i] = edges[min];
                edges[min] = e;
            }
        }
        
    }
    
    void displayEdgeList() throws IOException{
        if (l == 0) {
            setData("matrix.txt");
        }
        if (count == 0) {
            createEdgeList();
        }
        if (l == 0) return;
        System.out.println("The number of edges: " + count);
        for (int i = 0; i < l; i++) {
            edges[i].display();
        }
        System.out.println();
    }
    
    void setData(String fn) throws IOException{
        String s="", s1="";
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
        createEdgeList();
    }
    
    void setFromArray(int[][] c) {
        l = c.length;
        matrix = new int[l][l];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                matrix[i][j] = c[i][j];
            }
        }
        createEdgeList();
    }
    
    void displayAdjMatrix() throws IOException {
        if (l == 0) setData("matrix.txt");
        if (l == 0) return;
        System.out.println("\nThe weighted adjacent matrix: ");
        System.out.println("=================================");
        for (int i = 0; i < l; i++) {
            System.out.println();
            for (int j = 0; j < l; j++) {
                System.out.printf("%4d",matrix[i][j]);
            }
        }
        System.out.println();
    }
    
    void displayMatrix (int[][] u) {
        int h = u.length;
        for (int i = 0; i < h; i++) {
            System.out.println();
            for (int j = 0; j < h; j++) {
                System.out.printf("%4d", u[i][j]);
            }
        }
        System.out.println();
    }
    
    boolean isUndirected() {
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (matrix[i][j] != matrix[j][i]) return false;
            }
        }
        return true;
    }
    
    boolean isConnected() {
        int con;
        Stack s = new Stack();
        boolean[] visited = new boolean[l];
        boolean[] pushed = new boolean[l];
        for (int i = 0; i < l; i++) {
            visited[i] = pushed[i] = false;
        }
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
    
    boolean hasPath(int from, int to) {
        Stack s = new Stack();
        boolean[] pushed = new boolean[l];
        int con;
        for (int i = 0; i < l; i++) {
            pushed[i] = false;
        }
        s.push(from);
        while (!s.isEmpty()) {            
            con = s.pop();
            for (int i = 0; i < l; i++) {
                if (matrix[con][i] > 0 && !pushed[i]) {
                    s.push(i);
                    pushed[i] = true;
                } 
            }
        }
        return pushed[to];
    } 
    
    KruskalAlgorithm kruskal() throws IOException {
        if (!isConnected() || !isUndirected()) {
            System.out.println("The conditions are not satisfied");
            return null;
        }
        sortEdgeList();
        KruskalAlgorithm ka = new KruskalAlgorithm();
        ka.setBlank(l);
        int i = 0;
        ka.matrix[edges[0].u][edges[0].v] = matrix[edges[0].u][edges[0].v];
        ka.matrix[edges[0].v][edges[0].u] = matrix[edges[0].v][edges[0].u];
        while (i != l-1) {            
            i++;
            if (!ka.hasPath(edges[i].u, edges[i].v)) {
                ka.matrix[edges[i].u][edges[i].v] = matrix[edges[i].u][edges[i].v];
                ka.matrix[edges[i].v][edges[i].u] = matrix[edges[i].v][edges[i].u];
            }
        }
        ka.createEdgeList();
        return ka;
    }
    
    void displayTree() throws IOException{
        KruskalAlgorithm ka = kruskal();
        int sum=0;
        System.out.println("Edges in a minimum spanning tree:");
        for (int i = 0; i < ka.count; i++) {
            ka.edges[i].display();
            sum += ka.edges[i].weight;
        }
        System.out.println("Total weight: "+sum);
    }
}
