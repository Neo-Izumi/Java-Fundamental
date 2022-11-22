/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

import java.util.Scanner;

/**
 *
 * @author VSIT
 */
public class HwString {
    void F1(String s) {
        s = s.replaceAll("\\s+", " ");
        s = s.trim();
        String [] sarr = s.split(" ");
        // c1
        System.out.println("There are " + sarr.length + " words in this string");
        int cnt2 = 0, cnt3 = 0, cnt4 = 0, sum5 = 0, sum6 = 0;
        for (int i = 0; i < sarr.length; i++) {
            int vowel = 0, digit = 0;
            String tem = "";
            for (int j = 0; j < sarr[i].length(); j++) {
                if (sarr[i].charAt(j)=='u' || sarr[i].charAt(j)=='e' || sarr[i].charAt(j)=='o' || sarr[i].charAt(j)=='a' || sarr[i].charAt(j)=='i' || sarr[i].charAt(j)=='y') {
                    vowel++;
                }
                if (sarr[i].codePointAt(j) >= 48 && sarr[i].codePointAt(j) <= 57) {
                    digit++;
                    sum5 += Integer.parseInt(String.valueOf(sarr[i].charAt(j)));
                    tem = tem.concat(String.valueOf(sarr[i].charAt(j)));
                }
            }
            
            if (vowel == 2) cnt2++;
            if (vowel >= 2) cnt3++;
            if (digit > 0) {
                cnt4++;
                sum6 += Integer.parseInt(tem);
            }
        }
        // c2
        System.out.println("There are " + cnt2 + " words that have exactly 2 vowels");
        // c3
        System.out.println("There are " + cnt3 + " words that have at least 2 vowels");
        // c4
        System.out.println("There are " + cnt4 + " words that have digit(s)");
        // c5
        System.out.println("The sum of all digits contained in the string is " + sum5);
        // c6
        System.out.println("The sum of all numbers contained in the string is " + sum6);
    }
    
    void F2(String s) {
        s = s.replaceAll("\\s+", " ");
        s = s.trim();
        String [] sarr = s.split(" ");
        // c1
        int cl = -1;
        for (int i = 0; i < sarr.length; i++) {
            for (int j = 0; j < sarr[i].length(); j++) {
                if (sarr[i].charAt(j) >= 'A' && sarr[i].charAt(j) <= 'Z') {
                    cl = i;
                    break;
                }
            }
            if (cl != -1) break;
        }
        System.out.println("The first word with capital letter(s) is: " + sarr[cl]);
        // c2
        int dc = -1;
        for (int i = sarr.length - 1; i >= 0; i--) {
            for (int j = 0; j < sarr[i].length(); j++) {
                if (sarr[i].charAt(j) >= '0' && sarr[i].charAt(j) <= '9') {
                    dc = i;
                    break;
                }
            }
            if (dc != -1) break;
        }
        System.out.println("The last word with digit(s) is: " + sarr[dc]);
        // c3
        int max = 0;
        for (int i = 1; i < sarr.length; i++) {
            if (sarr[max].length() < sarr[i].length()) max = i;
        }
        System.out.println("The longest word: " + sarr[max]);
        // c4
        for (int i = 0; i < sarr.length; i++) {
            int min = i;
            for (int j = i+1; j < sarr.length; j++) {
                int k = 0;
                while (k < sarr[j].length()) {
                    if (sarr[min].charAt(k) > sarr[j].charAt(k)) min = j;
                    else if (sarr[min].charAt(k) < sarr[j].charAt(k)) break;
                    else k++;
                } 
            }
            String tem = sarr[i];
            sarr[i] = sarr[min];
            sarr[min] = tem;
        }
        System.out.print("The given string after sorting: ");
        for (int i = 0; i < sarr.length; i++) {
            System.out.print(sarr[i] + " ");
//            s.concat(sarr[i]);
        }
        System.out.println();
        // c5
        int l = sarr.length;
        for (int i = 0; i < l/2; i++) {
            String tem = sarr[i];
            sarr[i] = sarr[l-i-1];
            sarr[l-i-1] = tem;
        }
        System.out.print("The given string after reversing all words: ");
        for (int i = 0; i < l; i++) {
            System.out.print(sarr[i] + " ");
        }
        System.out.println();
        // c6 
        int ls = s.length();
        String ns = "";
        for (int i = ls-1; i >= 0; i--) {
            ns = ns.concat(String.valueOf(s.charAt(i)));
        }
        System.out.print("The given string after reversing all characters: " + ns);
        System.out.println();
    }
}

class Using{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String: ");
        String s = sc.nextLine();
        HwString bt = new HwString();
        System.out.println("F1 result: ");
        bt.F1(s);
        System.out.println("F2 result: ");
        bt.F2(s);
    }
}
// test case: kjSsd Hello T21hinh dA1y Ne HeLlo ahihihi 21njn   23ikas sd212jnj 