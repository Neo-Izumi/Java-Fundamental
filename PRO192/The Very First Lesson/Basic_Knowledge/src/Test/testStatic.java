/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author VSIT
 */
public class testStatic {
    int x = 10;
    public static void main(String[] args) {
//        System.out.println(x);
        test i = new test();
        System.out.println(i.x);
    }
}

class test{
    int x = 10;
}
