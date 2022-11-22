/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author VSIT
 */
public class testS {
    
    Map<Object, Object> m = new HashMap();       
    
    private Map<String, Integer> wordCounter = new HashMap<>();
    private Map<String, Integer> charCounter = new HashMap<>();
    
//    hello world
    
    public void count(String word) {
        StringTokenizer st = new StringTokenizer(word," ");
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            String[] sts= s.split("");
            for (int i = 0; i < sts.length; i++) {
                if(charCounter.containsKey(sts[i])) charCounter.put(sts[i],charCounter.get(sts[i])+1);
                else charCounter.put(sts[i], 1);
            }
//            <h, 1>, <e, 1>, <l, 2>, <o, 1>
           
            if (wordCounter.containsKey(s)) {
                wordCounter.put(s, wordCounter.get(s) + 1);
            }else{
            wordCounter.put(s, 1);
            }
        }
        
        
    }

    public void display() {
        System.out.println(wordCounter);
        System.out.println(charCounter);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        testS ts = new testS();
        ts.count(s);
    }
}
