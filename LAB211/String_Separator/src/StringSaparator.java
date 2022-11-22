
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VSIT
 */
public class StringSaparator {
    
    String input () {
        Scanner sc = new Scanner(System.in);
        String s;
        boolean check;
        do {            
            System.out.print("Enter the string:");
            s = sc.nextLine();
            check = s.isEmpty();
            if (check) System.out.println("This is an empty string");
        } while (check);
        return s;
    }
    
    int[] number(String s) {
        String[] n = s.split("\\D+");
        int l = n.length;
        int[] numbers;
        if (l == 0) return null;
        if (!n[0].isEmpty()){
            numbers = new int[l];
            for (int i = 0; i < l; i++) {
                numbers[i] = Integer.parseInt(n[i]);
            }
        } else {
            numbers = new int[l-1];
            for (int i = 1; i < l; i++) {
                numbers[i-1] = Integer.parseInt(n[i]);
            }
        }
        return numbers;
    }
    
    String lowerCase(String s) {
        String lc = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) lc = lc.concat(String.valueOf(s.charAt(i)));
        }
        return lc;
    }
    
    String upperCase(String s) {
        String uc = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) uc = uc.concat(String.valueOf(s.charAt(i)));
        }
        return uc;
    }
    
    String specChar(String s) {
        String[] spec = s.split("[0-9a-zA-Z\\s]+");
        String specChars = "";
        for (int i = 0; i < spec.length; i++) {
            specChars = specChars.concat(spec[i]);
        }
        return specChars;
    }
    
    boolean checkSquare(int n) {
        if (n >= 0) {
            int sq = (int) Math.sqrt(n);
            return (sq*sq) == n;
        }
        return false;
    }
    
    void display(String s) {
        int[] n = number(s);
        if (n == null) System.out.println("The given string did not contain any number");
        else {
            int l = n.length;
            System.out.print("Perfect square numbers:");
            for (int i = 0; i < l; i++) {
                if (checkSquare(n[i])) {
                    System.out.print(" " + n[i]);
                }
            }
            System.out.println();
            System.out.print("Ood numbers:");
            for (int i = 0; i < l; i++) {
                if (n[i] % 2 == 1) {
                    System.out.print(" " + n[i]);
                }
            }
            System.out.println();
            System.out.print("Even numbers:");
            for (int i = 0; i < l; i++) {
                if (n[i] % 2 == 0) {
                    System.out.print(" " + n[i]);
                }
            }
            System.out.println();
            System.out.print("All numbers:");
            for (int i = 0; i < l; i++) {
                System.out.print(" " + n[i]);
            }
            System.out.println();
        }
        String sall = s.replaceAll("[0-9\\s]+", "");
        if (sall.isEmpty()) {
            System.out.println("The given string did not contain any non-digit character");
        } else {
            System.out.print("Upper-case characters: ");
            System.out.println(upperCase(s));
            System.out.print("Lower-case characters: ");
            System.out.println(lowerCase(s));
            System.out.print("Special characters: ");
            System.out.println(specChar(s));
            System.out.print("All character:");
            System.out.println(sall);
        }
        
    } 
}
