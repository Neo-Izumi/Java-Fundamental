/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.knowledge;

/**
 *
 * @author VSIT
 */
public class DemoStatic {

    public static void main(String[] args) {

        
/* demo static variable
        A a = new A();
        a.x = 10;
        a.y = 20;
        System.out.println("a.x = " + a.x + ", a.y = " + a.y);

        A b = new A();
        b.x = 100;
        b.y = 200;
        System.out.println("b.x = " + b.x + ", b.y = " + b.y);
        System.out.println("a.x = " + a.x + ", a.y = " + a.y);
        System.out.println("a.y = " + A.y); // static variable can be accessed by class name
//      System.out.println("a.x = " + A.x); // but instance variable can't do it

        A.y = 1000;
        System.out.println("a.y = " + a.y + ", b.y = " + b.y);
        
        A c = new A();
        System.out.println("c.y = " + c.y);
*/


/* demo static method
        A a = new A();
        a.m1(); // normal method
        a.m2(); // normal method
        a = new B();
        a.m1(); // method override
        a.m2(); // hidden (or shadow) method
        
        B b = new B();
        b.m1(); // normal method
        b.m2(); // normal method
*/


/* demo static block code
       C a = new C();  // static BC will be run first, even before BC and constructor
       a.Test1();   // after that is BC and constructor
       a.Test2();
       C b = new C();   // program didn't call BC again in this statement
       b.Test2();
       b = new D();
       b.Test1();
       
       D d = new D();   // static BC was run first, BC and constructor in C was also called, after that are BC and constructor in D
       d.TestD();
       d.Test1();
       
       E e = new E();
       e.TestE();
       e.TestD();
*/
    }
}



class A {

    int x;
    static int y = 10;
    
    void m1(){
        System.out.println("m1 in A");
    }
    static void m2(){
        System.out.println("m2 in A");
    }
}

class B extends A {
    void m1(){
        System.out.println("m1 in B");
    }
    static void m2 (){
        System.out.println("m2 in B");
    }
}

class C {
    public C(){
        System.out.println("constructor in C");
    }
    public void Test1(){
        System.out.println("this is a test method");
    }
    {
        System.out.println("Block code in C");
    }
    static {
        System.out.println("static block code in C");
    }
    public void Test2(){
        System.out.println("this also is a test method");
        System.out.println("--------------------------");
    }
}

class D extends C{
    public D(){
        System.out.println("constructor in D");
    }
    public void Test1(){
        System.out.println("override method from C");
        System.out.println("----------------------");
    }
    {
        System.out.println("Block code in D");
    }
    static  {
        System.out.println("static block code in D");
    }
    public void TestD(){
        System.out.println("normal method in D");
    }
}

class E extends D{
    public E(){
        System.out.println("constructor in E");
    }
    public void TestD(){
        System.out.println("override method from D");
        System.out.println("----------------------");
    }
    {
        System.out.println("Block code in E");
    }
    static  {
        System.out.println("static block code in E");
    }
    public void TestE(){
        System.out.println("normal method in E");
    }
}