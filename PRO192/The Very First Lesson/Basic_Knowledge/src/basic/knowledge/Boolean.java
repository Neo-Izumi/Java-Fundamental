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
public class Boolean {

    public static void main(String[] args) {
        int a = 0;
        int b = 3;
        if (a > 10 && b++ < 5) {
            System.out.println("a= " + a + " b= " + b);
        } else {
            System.out.println("a= " + a + " b= " + b);
        }
        if (a > 10 & b++ < 5) {
            System.out.println("a= " + a + " b= " + b);
        } else {
            System.out.println("a= " + a + " b= " + b);
        }
        /*
        + if we use '&&' operatpor, Java will consider that if the firt formula
        is true, then it will check the second one, but if the firt formula 
        is fale, then it will judge that the boolean statement is false and will not
        run the second one
        + if we use '& operator, Java will run both 2 fomulas no matter when the 
        first formula is false
        */
    }
}
