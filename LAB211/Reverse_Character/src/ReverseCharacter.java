/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VSIT
 */
public class ReverseCharacter {
    
    // reverse all characters of the given string
    static void reverseChar (String s) {
        // if the given string is empty, do nothing
        if (s.trim().isEmpty()) {
        } else {
            // use a buffer string sb to hold the given string
            StringBuffer sb = new StringBuffer(s);
            // use method reverse from StringBuffer class
            sb.reverse();
            // print out the result
            System.out.println(sb);
        }
    }
    
    public static void main(String[] args) {
        reverseChar("hello there!~");
    }
}
