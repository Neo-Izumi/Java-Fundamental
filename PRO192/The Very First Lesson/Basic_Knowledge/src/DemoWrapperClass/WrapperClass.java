/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoWrapperClass;

/**
 *
 * @author VSIT
 */
public class WrapperClass {
    public static void main(String[] args) {
        int x = 10; // x is a variable and x can't have method or properties
        Integer a = 10; // a is an object and a can have properties or method
        Integer b = new Integer(10);
        Integer c = new Integer("123"); // parameter passed through need to be a string convert
//        Integer d = new Integer(" 12as ") // error
//        Internal e = new Integer("12.3") // error
        System.out.println("Max value: " + a.MAX_VALUE); // ctrl + space + space
        System.out.println("Min value: " + a.MIN_VALUE); // access by object
        System.out.println("Byte value: " + Integer.BYTES); // access by class name
        System.out.println("Size value: " + Integer.SIZE);
        System.out.println("Type value: " + a.TYPE);
        System.out.println("value of a: " + a.toString());   
    }
}
