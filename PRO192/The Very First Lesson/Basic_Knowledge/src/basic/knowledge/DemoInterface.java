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
public interface DemoInterface {
    public static final int x = 10; // the full syntax used to declare a constant
    int y = 10; // we can just use this way to declare a constant because Java compiler automatically understand that this is public static final int y = 10;
    abstract public  void m1(); // // the full syntax used to declare a method
    void m2(); // Java compiler also understnad that this is abstract public void m2();
    static void m3(){}; 
    default void m4(){}; 
    // to check weather this java version is 8 or lower, right click to project > properties > source > source/binary format
//    public DemoInterface(){} // interface can't have a constructor because constructor is a public method that have body
//    public abstract DemoInterface(); // we also can't use this because constructor dont allow other class to inherit it
            
}


interface I1{
    void m1();
}
interface I2{
    void m2();
}
interface I3 extends I1, I2{ // an interface can inherit from 1 or more interfaces
    void m3();
}


class using implements I3{
    // whenever a class implements from an interface, 
    @Override
    public void m1() {
 
    }

    @Override
    public void m2() {
        
    }

    @Override
    public void m3() {
        
    }
    
    public static void main(String[] args) {
//        DemoInterface inter = new DemoInterface();  // we can't create an object from an interface because interface don't have a constructor

    }
}
