/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo.StaticBC.Test;

/**
 *
 * @author VSIT
 */
public class A {
    public A() {
        System.out.println("constructor in A");
    }
    {
        System.out.println("block code in A");
    }
    static {
        System.out.println("static block code in A");
    }
    public void mA(){
        System.out.println("normal method in A");
    }    
}
