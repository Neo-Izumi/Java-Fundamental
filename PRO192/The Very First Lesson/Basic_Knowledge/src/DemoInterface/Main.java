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
public class Main{
    public static void main(String[] args) {
        Ichess red, blue;
        red = new Rook();
        red.move();
        blue = new King();
        blue.move();
        red = new Queen();
        red.move();
        
        // Anonymous class (implement from an interface)
        Ichess nt = new Castling(); // normally initialize an object from a class
        nt.move();
        Ichess ct = new Ichess() {
            @Override
            public void move() {
                System.out.println("Anonymous class");
            }
        }; // we have to use a semicolon at the end of anonymous class
        ct.move();

        // Anonymous object
        new King().move();
        
        // combine anonymous class and object
        new Ichess() {
            @Override
            public void move() {
                System.out.println("anonymous class and object");
            }
        }.move();
        
        // Anonymous class (extend from an abstract class)
        Abstract ab = new Abstract() {
            public void ab1() {
                System.out.println("anonymous class");
            }

            @Override
            public void ab2() {
                super.ab2(); 
            }
            
        };
      
    }
}
