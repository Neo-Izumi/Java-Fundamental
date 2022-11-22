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
public class DemoCommonMethods {
    public static void main(String[] args) {
        Integer a = new Integer(123);
        String s = "-123";
        String s1 = "Java";
                
        // lowestOneBit(int i): return the value of the lowest one-bit in the bit string (when two complementing integer i)
        System.out.println(a.lowestOneBit(a));
        System.out.println(Integer.lowestOneBit(12));
        
        // parseInt(String s): convert string s to integer (base 10)
        // parseInt(String s, int radix): base radix
        System.out.println(Integer.parseInt(s));
//        System.out.println(a.parseInt("12",2));
    }
}
