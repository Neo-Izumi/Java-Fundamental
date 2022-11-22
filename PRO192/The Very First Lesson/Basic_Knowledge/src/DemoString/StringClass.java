
package DemoString;

import java.util.StringTokenizer;


public class StringClass {
    
    static  String s1 = "Helle Thinh day";
    static char[] carr = new char[100];
    static byte[] gb = new byte[100];
    
    public static void main(String[] args) {
        
        s1 = s1.replace(String.valueOf(s1.charAt(1)), "XX");
        System.out.println(s1);
////        // charAt (int Index): return the character at the index in a string
////        System.out.println(s1.charAt(0));
////        System.out.println(s1.charAt(4));
////        System.out.println("----------------------");
////        
////        // toCharArray(): convert a string into a new character array
////        carr = s1.toCharArray();
////        for (int i = 0; i < carr.length; i++) {
////            System.out.print(carr[i] + ", ");
////        }
////        System.out.println();
////        System.out.println("----------------------");
////        
////        // getBytes(): encode a string into the sequence of bytes
////        gb = s1.getBytes();
////        for (int i = 0; i < gb.length; i++) {
////            System.out.print(gb[i] + ", ");
////        }
////        System.out.println();
////        System.out.println("----------------------");
////        
////        // codePointAt(int index): return the unicode value of the character at the index
////        System.out.println(s1.codePointAt(0));
////        System.out.println(s1.codePointAt(4));
////        System.out.println("----------------------");
////        
////        // compareTo(String s2): the same as strcmp() in C
////        System.out.println(s1.compareTo("hello"));
////        System.out.println(s1.compareTo("HEllo"));
////        System.out.println("----------------------");
////        
////        // compareToIgnoreCase(String s2): compareTo() but ignore case differences
////        System.out.println(s1.compareTo("hello"));
////        System.out.println(s1.compareTo("heLLO"));
////        System.out.println("----------------------");
////        
////        // hashCode(): return hash code for the given string
////        System.out.println(s1.hashCode());
////        System.out.println("----------------------");
////        
////        // indexOf(String s2); indexOf(String s2, int fromIndex); indexOf(int char); indexOf (int char, int fromIndex)
////        // return the index of substring or character from the given string, if it never occur, return -1
////        System.out.println(s1.indexOf("ll"));
////        System.out.println(s1.indexOf("nh", 3));
////        System.out.println(s1.indexOf('n'));
////        System.out.println(s1.indexOf('a', 5));
////        System.out.println("----------------------");
////        
////        // lastIndexOf(...): return the last index of substring or character from the given string, return 1 if it never occur
////        System.out.println(s1.lastIndexOf('l'));
////        System.out.println("----------------------");
////        
////        // length(): return the length of given string
////        System.out.println(s1.length());
////        System.out.println("----------------------");
////        
////        // concat(String s2): the same as strcat()
////        System.out.println(s1.concat("ne"));
////        System.out.println("----------------------");
////        
////        // substring(int index): return a substring of the given string begin with the character from index
////        // substring(int index1, int index2): substring begin with character at index 1 and end with character at index 2
////        System.out.println(s1.subSequence(6, 11));
////        System.out.println(s1.substring(6));
////        System.out.println("----------------------");
////        
////        
////        // trim(): remove whitespace from both ends of given string
////        String s3 = "   Hello     Thinh   day  ne     ";
////        String s4 = "   Hello     Thinh   day  ne     ";
////        
////        System.out.println("(" + s3 + ")");
////        System.out.println("(" + s3.trim() + ")"); // trim() in Java just remove whitespace from both ends of given string, but it doesn't remove extra spaces between words
////        // this's also called standardize s string 
////        s3 = s3.replaceAll("\\s+", " ");
////        s3 = s3.trim();
////        System.out.println("(" + s3 + ")"); // trim() in C# or JavaScript or some other high-level programming language will show you directly this result 
////        System.out.println("----------------------");
////        
////        // split(String regex): devides the given string at the regex and returns an array of strings
////        // split(String regex, int limit): devides the given string at the regex and returns an array of strings, with the limit times
////        String [] sarr1 = s1.split(" "); // recommened to use with standardized string. uncomment line 94 to know what happen if we use this method with an non-standard string
//////        String [] sarr = s4.split(" "); 
////        String [] sarr3 = s1.split("l");
////        String [] sarr2 = s4.split("\\s+"); // this command will fix split(" ") problem (head still have whitespaces that can't be removed)
////        for (int i = 0; i < sarr2.length; i++) {
////            System.out.println(sarr2[i]);
////        }
////        System.out.println("----------------------");
////        
////        // use class StringTokenizer to devide the given string to tokens or element
////        StringTokenizer stk = new StringTokenizer(s4);
////        while (stk.hasMoreTokens()) {
////            System.out.println(stk.nextToken()+"");
//        }
    }
}
