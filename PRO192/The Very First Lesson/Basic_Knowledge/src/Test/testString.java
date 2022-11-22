/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Scanner;

/**
 *
 * @author VSIT
 */
public class testString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'u' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'a' || s.charAt(i) == 'i') {
//                s=s.replace(s.charAt(i), (char) ((char) s.charAt(i)-32));
                s=s.replace(s.charAt(i), Character.toUpperCase(s.charAt(i)));
            }
        }
        int cnt=0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) && (s.codePointAt(i)-48) % 2 ==0) cnt++;
            System.out.println(s.codePointAt(i));
        }
        System.out.println(cnt);
        System.out.println(s);
        
    }
}
