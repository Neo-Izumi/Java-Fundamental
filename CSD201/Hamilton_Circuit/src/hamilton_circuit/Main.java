 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamilton_circuit;

import java.io.IOException;

/**
 *
 * @author VSIT
 */
public class Main {
    public static void main(String[] args) throws IOException {
            String fn = "matrix.txt";
            HamiltonGraph hg = new HamiltonGraph();
            hg.setData(fn);
            hg.displayMatrix();
            hg.hamiltonCircuit(0);
            System.out.println();
        
    }
}
