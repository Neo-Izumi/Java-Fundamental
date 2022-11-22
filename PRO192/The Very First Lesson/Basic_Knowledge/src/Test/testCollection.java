/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.ArrayList;

/**
 *
 * @author VSIT
 */
public class testCollection {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Hello");
        ar.add("abc");
        ar.add("Thinh");
        ar.add("holy fuck !!!");
        String s = "ell";
        int l = s.length();
        for (int i = 0; i < ar.size(); i++) {
            for (int j = 0; j <= ar.get(i).length()-l; j++) {
                if (ar.get(i).substring(j, j+l).matches(s)) System.out.println(ar.get(i)); 
            }
        }
    }
}
