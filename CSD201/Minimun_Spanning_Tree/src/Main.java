
import java.io.IOException;
import java.util.Scanner;

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
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int choice;
        KruskalAlgorithm ka = new KruskalAlgorithm();
        while (true) {            
            System.out.println("\nChoose your option:");
            System.out.println("  1. Read adjacency matrix from file");
            System.out.println("  2. Display adj matrix");
            System.out.println("  3. Create list of edge");
            System.out.println("  4. Display adj matrix & list of edge");
            System.out.println("  5. Display minimum spanning tree");
            System.out.println("  0. exit\n");
            System.out.println(" Your selection (0-5): ");
            choice = Integer.parseInt(sc.nextLine());
            if (choice == 0) {
                System.out.println("End");
                break;
            }
            switch (choice) {
                case 1: 
                    ka.setData("matrix.txt");
                    break;
                case 2:
                    ka.displayAdjMatrix();
                    break;
                case 3:
                    ka.createEdgeList();
                    break;
                case 4:
                    ka.displayAdjMatrix();
                    ka.displayEdgeList();
                    break;
                case 5:
                    ka.setData("matrix.txt");
                    ka.displayAdjMatrix();
                    ka.displayEdgeList();
                    ka.displayTree();
                default:
                    System.out.println("Invalid input");
            }
            System.out.println();
        }
    }
}
