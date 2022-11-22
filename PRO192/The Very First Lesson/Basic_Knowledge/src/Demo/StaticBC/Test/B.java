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
public class B extends A{
    public B() {
        System.out.println("constructor in B");
    }
    {
        System.out.println("block code in B");
    }
    static {
        System.out.println("static block code in B");
    }
    public void mB(){
        System.out.println("normal method in B");
    }    
}
