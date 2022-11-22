
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
public class ReverseWord {
    
    // reverse words of a string
    static void reverse (String s) {
        Scanner sc = new Scanner(System.in);
        // if the given string is empty, ask user to enter a new string
        while (s.trim().isEmpty()) {
            System.out.println("The given string cannot be empty!!");
            System.out.print("Enter again: ");
            s = sc.nextLine();
        }
        s=s.replaceAll("\\s+", " ");
        // buffer string reverserdString will be reversed version of old string
        String reversedString = new String();
        // string array sentences holds all sentences of the given string
        String[] sentences = s.trim().split("[.]");// regex java
        // pass through each sentence and append to reversedString
        for (int i = sentences.length-1; i >= 0; i--) {
            // buffer string reversedSentence will be reversed version of old sentence
            String reversedSentence = new String();
            // string array words holds all words of the current sentence
            String[] words = sentences[i].trim().split(" ");    
            int lw = words.length - 1;
            // the last word of old sentence will be changed to be upper case at first and after that, add to resersedSentence
            reversedSentence=reversedSentence.concat(String.valueOf(words[lw].charAt(0)).toUpperCase()).concat(words[lw].substring(1));
            if (lw > 0) reversedSentence=reversedSentence.concat(" ");
            // go through the remaining words of current sentence
            for (int j = lw-1; j >=0 ; j--) {
                // the last word will be added to the reversedSentence without a space at the end
                if (j > 0) {
                    reversedSentence=reversedSentence.concat(words[j].toLowerCase()).concat(" ");
                } else {
                    reversedSentence=reversedSentence.concat(words[j].toLowerCase());
                }
            }
            // add reversedSentence to reversedString 
            // the last sentence will be added to the reversedString without a ". " sign at the end
            if (i>0) {
                reversedString=reversedString.concat(reversedSentence).concat(". ");
            } else {
                reversedString=reversedString.concat(reversedSentence);
            }
        }
        // if the given string ends with a dot, append it to the reversedString
        if (s.trim().endsWith(".")) {
            reversedString=reversedString.concat(".");
        }
        // print out the result.
        System.out.print("Reversed string: ");
        System.out.println(reversedString);
    }
    
    public static void main(String[] args) {
        reverse("");
    }
}
