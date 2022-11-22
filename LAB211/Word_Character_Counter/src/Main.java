
import sun.security.acl.WorldGroupImpl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VSIT
 */
public class Main {
    public static void main(String[] args) {
        WordCharCounter wc = new WordCharCounter();
        String s = wc.input();
        wc.count(s);
        wc.display();
    }
}
