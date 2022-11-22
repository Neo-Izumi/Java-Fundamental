
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VSIT
 */
public class WordCharCounter {
    
    HashMap<String, Integer> wordCounter = new HashMap<>();
    HashMap<String, Integer> charCounter = new HashMap<>();
    
    void count (String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
            String words = st.nextToken().trim();
            String[] chars = words.split("");
            for (int i = 0; i < chars.length; i++) {
                if (charCounter.containsKey(chars[i])) charCounter.put(chars[i], charCounter.get(chars[i])+1);
                else charCounter.put(chars[i], 1);
            }
            if (wordCounter.containsKey(words)) wordCounter.put(words, wordCounter.get(words)+1);
            else wordCounter.put(words, 1);
        }
    }
    
    String input () {
        Scanner sc = new Scanner(System.in);
        String s;
        do {            
            System.out.println("Enter a string:");
            s = sc.nextLine();
            if (s.trim().isEmpty()) System.out.println("The given string cannot be empty");
        } while (s.trim().isEmpty());
        return s;
    }
    
    void display() {
        System.out.println(wordCounter);
        System.out.println(charCounter);
    }
    
}
