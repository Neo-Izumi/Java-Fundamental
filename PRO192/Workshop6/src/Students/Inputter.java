/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

import java.util.Scanner;

/**
 *
 * @author VSIT
 */
public class Inputter {
    
    public static Scanner sc = new Scanner(System.in);
    
    // enter an integer that is greater than min and smaller than max
    public static  int inputInt (String msg, int min, int max) {
        if (min > max) {
            int t = min;
            min = max;
            max = t;
        }
        int data;
        do {
            System.out.print(msg + ": ");
            data = Integer.parseInt(sc.nextLine());
        } while (data < min || data > max);

        return data;
    }
    

    // enter a non-blank string
    public static  String inputNonBlankStr(String msg) {
        String data;
        do {
            System.out.print(msg + ": ");
            data = sc.nextLine().trim();
        } while (data.length() == 0);

        return data;
    }
    
    // enter a string without condition
    public static  String inputStr(String msg) {
        System.out.print(msg + ": ");
        String data = sc.nextLine().trim();
        return data;
    }
    
    // enter a string matching a pattern
    public static String inputPattern(String msg, String pattern) {
        String data;
        do {
            System.out.print(msg + ": ");
            data = sc.nextLine().trim();
        } while (!data.matches(pattern));
        return data;
    }
}
