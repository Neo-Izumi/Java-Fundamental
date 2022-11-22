/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo.Static.BC;
//import Demo.StaticBC.Test.*;
/**
 *
 * @author VSIT
 */
public class Using {
    public static void main(String[] args) {
        
    // suggestion 1:
//    C c = new C();
//    B b = new B();
//    A a = new A();
//    a = new B();
//    a = new C(); 
    
    // suggestion 2:
//    B b = new B();
//    b = new C();
//    A a = new A();
//    a = new C();
    
    // suggestion 3:
    A a = new A();
    a = new B();
    a = new C();
    C c = new C();
    }

//    C c = new C();
//    B b = new B();
//    A a = new A();
//    a = new B();
//    a = new C();
}

class A{
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

class B extends A{
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

class C extends B{
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
