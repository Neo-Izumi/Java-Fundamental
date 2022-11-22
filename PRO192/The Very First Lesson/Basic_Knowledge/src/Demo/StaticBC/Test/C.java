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
public class C extends B{
    public C() {
        System.out.println("constructor in C");
    }
    {
        System.out.println("block code in C");
    }
    static {
        System.out.println("static block code in C");
    }
    public void mC(){
        System.out.println("normal method in C");
    }   
}
