/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author VSIT
 */
public class DemoSortListAdvance {
    static void sortObj (ArrayList ar) {
        Collections.sort(ar, new MySortAd());
    }
}

class MySortAd implements Comparator<Object>{

    @Override
    public int compare(Object o1, Object o2) {
        int kq = 0;
        if ((o1 instanceof String) && (o2 instanceof Integer)) 
            kq = -1; // String dung truoc Integer
        if ((o1 instanceof String) && (o2 instanceof String)) 
            kq = ((String)o1).compareTo((String)o2); // String tang dan
        if ((o1 instanceof Integer) && (o2 instanceof Integer)) 
            kq = -Integer.compare((int)o1, (int)o2); // Integer giam dan
        return kq;
    }
    
}

class TestAdvance {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ar.add(rd.nextInt(100));
        }
        ar.add("Hello");
        ar.add(23);
        ar.add(90);
        ar.add("hi");
        ar.add("string");
        ar.add("abc");
        ar.add("123");
        ar.add(32);
        ar.add(89);
        System.out.println("Before: " + ar);
        System.out.print("After: ");
        DemoSortListAdvance.sortObj(ar);
        System.out.println(ar);
    }
}