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
public class DataType {

    public int age;
    boolean check;

    public static void main(String[] args) {

        int p;
        int q = 12;
        //p and q are local variables. therefore, ew need to assign a value to its

        System.out.println(q);
//        System.out.println(p);

        DataType demo = new DataType();
        System.out.println(demo.age);
        System.out.println(demo.check);
        /* check and age are properties of DataType so Java automatically assign
        a value to its ( if datatype is number-type, the assigned value is 0, if 
        boolean, it's false
         */

        System.out.println("Max int = " + Integer.MAX_VALUE);
        System.out.println("Min int = " + Integer.MIN_VALUE);

        char a = 65;
        byte b = 127;
        short c = 255;
        int d = 123456;
        long e = 23234345;
        float f = 2.4f;
        float g = 2.5F;
        // we need to add "f" either uppercase or lowercase at the and of value 
        double h = 34.5;
        double i = 24.3d;
        double k = 24.3D;
        d = b;
        b = (byte) c;
        // whenever we use casting datatype, it's possible to lose data, so we need to be careful

    }
}
