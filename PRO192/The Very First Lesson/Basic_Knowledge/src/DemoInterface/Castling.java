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
public class Castling implements Ichess{

    @Override
    public void move() {
        System.out.println("In this special situation, the King and the Rook move at the same time");
    }
    
}
