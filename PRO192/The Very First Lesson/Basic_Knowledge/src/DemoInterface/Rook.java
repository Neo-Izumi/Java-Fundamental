/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoInterface;

/**
 *
 * @author VSIT
 */
public class Rook implements Ichess{
    
    @Override
    public void move() {
        System.out.println("The Rook can move any number of unoccupied squares vertically and horizontally");
    }
    
}
