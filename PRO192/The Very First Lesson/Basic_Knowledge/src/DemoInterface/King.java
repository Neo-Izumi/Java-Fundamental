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
public class King implements Ichess{

    @Override
    public void move() {
        System.out.println("The King move exactly 1 square around it's position");
    }
    
}
