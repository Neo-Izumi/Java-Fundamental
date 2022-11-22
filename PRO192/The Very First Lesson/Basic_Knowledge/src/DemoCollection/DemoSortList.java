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
public class DemoSortList {

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Sort sort = new Sort();
        Random rd = new Random();
        System.out.print("Enter n: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            ar.add(rd.nextInt(100));
        }
        System.out.print("Before: ");
        System.out.println(ar);

        System.out.print("After: ");
        // c1: manually build a method to sort
//        sort.Selection(ar);
        // c2: use sort(list ar) from class Collections
//        Collections.sort(ar); // class Integer implements interface Comparable
//        System.out.println(ar); // the array list is sorted to be increasing because Interface is a final class so we can't override method to compare 
//        Collections.reverse(ar); // use method reverse() to 
//        System.out.println(ar);
        // c3: use sort(list ar, Object c) from class Collections
        // 3.1: build a class
//        MySort c = new MySort();
//        Collections.sort(ar, c);
//        System.out.println(ar);
        // 3.2: anonymous object
//        Collections.sort(ar, new MySort());
//        System.out.println(ar);
        // 3.3: anonymous class
//        Comparator c = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return -Integer.compare(o1, o2);
//            }
//        };
//        Collections.sort(ar, c);
//        System.out.println(ar);
        // 3.4: anonymous class and object
        Collections.sort(ar, new Comparator<Integer> () {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -Integer.compare(o1, o2);
            }
        });
        System.out.println(ar);
        // 3.5: lambda expression (anonymous method)
//        Collections.sort(ar, (o1,o2)->{return o1-o2;}); // increasing order
//        Collections.sort(ar, (o1,o2)->{return o2-o1;}); // decreasing order
//        Collections.sort(ar, (o1,o2)->o1-o2); // increasing order
//        Collections.sort(ar, (o1, o2) -> o2 - o1); // decreasing order
//        System.out.println(ar);
    }
}

class MySort implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        // c1: use built-in method from class Integer
//        return Integer.compare(o1, o2); // increasing order
//        return -Integer.compare(o1, o2); // decreasing order
        // c2: manually build 
        if (o1 == o2) {
            return 0;
        } //        else return o1>o2?1:-1; // increasing order
        else {
            return o1 > o2 ? -1 : 1; // decreasing order
        }
    }

}

class Sort{

    void Selection(ArrayList<Integer> ar) {
        // arrange elements of collection to the decreasing order
        int tem = 0;
        for (int i = 0; i < ar.size() - 1; i++) {
            int min = i;
            for (int j = i; j < ar.size(); j++) {
                if (ar.get(min) < ar.get(j)) {
                    min = j;
                }
            }
            tem = ar.get(i);
            ar.set(i, ar.get(min));
            ar.set(min, tem);
        }
        System.out.println(ar);
    }
}
