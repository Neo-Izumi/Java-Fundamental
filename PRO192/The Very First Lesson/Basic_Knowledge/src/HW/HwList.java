/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author VSIT
 */
public class HwList { 

    int F1(ArrayList<Integer> ar) {
        int sum = 0;
        // 1: return the sum of all elements in collection
        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }
        // 2: return the sum of elements greater than 50
        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) > 50) {
                sum += ar.get(i);
            }
        }
        // 3: return the sum of all primes in the collection
        for (int i = 0; i < ar.size(); i++) {
            if (HwCheckNumber.checkPrimes(ar.get(i))) {
                sum += ar.get(i);
            }
        }
        // 4: return the sum of the greatest element and smallest element 
        int min = ar.get(0), max = ar.get(0);
        for (int i = 1; i < ar.size(); i++) {
            if (min > ar.get(i)) {
                min = ar.get(i);
            }
            if (max < ar.get(i)) {
                max = ar.get(i);
            }
        }
        sum = min + max;
        // 5: return the average of all primes 
        for (int i = 0; i < ar.size(); i++) {
            if (HwCheckNumber.checkPrimes(ar.get(i))) {
                sum += ar.get(i);
            }
        }
        sum = sum / ar.size();
        return sum;
    }
    
    void F2(ArrayList<Integer> ar) {
        for (int i = 0; i < ar.size() - 1; i++) {
            int min=i;
            for (int j = i; j < ar.size(); j++) {
                if (ar.get(min)<ar.get(j)) min = j;
            }
            int tem=ar.get(i);
            ar.set(i, ar.get(min));
            ar.set(min, tem);
        }
        System.out.println(ar);
    }
    
    void F3(ArrayList<Integer> ar) {
        
        // 1: sort all primes in the list in decreasing order
        // 1.1: 
//        for (int i = 0; i < ar.size() - 1; i++) {
//            if (HwCheckNumber.checkPrimes(ar.get(i))) {
//                int min = i;
//                for (int j = i + 1; j < ar.size(); j++) {
//                    if (HwCheckNumber.checkPrimes(ar.get(j)) && ar.get(min) < ar.get(j)) {
//                        min = j;
//                    }
//                }
//                int tem = ar.get(i);
//                ar.set(i, ar.get(min));
//                ar.set(min, tem);
//            } else {
//                continue;
//            }
//        }
//        System.out.println(ar);

        // 1.2: 
//        ArrayList<Integer> prime = new ArrayList<Integer>();
//        for (int i = 0; i < ar.size(); i++) {
//            if (HwCheckNumber.checkPrimes(ar.get(i))) {
//                prime.add(ar.get(i));
//            }
//        }
//        Collections.sort(prime, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return -Integer.compare(o1, o2);
//            }
//        });
//        System.out.println(prime);
//        int j = 0;
//        for (int i = 0; i < ar.size(); i++) {
//            if (HwCheckNumber.checkPrimes(ar.get(i))) {
//                ar.set(i, prime.get(j));
//                j++;
//            }
//        }
//        System.out.println(ar);

        // 2: sort numbers with even index in increasing order and numbers with odd index in decreasing order
        // 2.1: 
//        for (int i = 0; i < ar.size() - 1; i++) {
//            if (i % 2 == 0) {
//                int min = i;
//                for (int j = i + 2; j < ar.size(); j += 2) {
//                    if (ar.get(min) > ar.get(j)) {
//                        min = j;
//                    }
//                }
//                int tem = ar.get(i);
//                ar.set(i, ar.get(min));
//                ar.set(min, tem);
//            } else {
//                int max = i;
//                for (int j = i + 2; j < ar.size(); j += 2) {
//                    if (ar.get(max) < ar.get(j)) {
//                        max = j;
//                    }
//                }
//                int tem = ar.get(i);
//                ar.set(i, ar.get(max));
//                ar.set(max, tem);
//            }
//        }
//        System.out.println(ar);
        // 2.2:
//        ArrayList<Integer> odd = new ArrayList<>();
//        ArrayList<Integer> even = new ArrayList<>();
//        for (int i = 0; i < ar.size(); i++) {
//            if (i % 2 == 0) {
//                even.add(ar.get(i));
//            } else {
//                odd.add(ar.get(i));
//            }
//        }
//        Collections.sort(even);
//        Collections.sort(odd, new MySort());
//        System.out.println(even);
//        System.out.println(odd);
//        int j = 0, m = 0;
//        for (int i = 0; i < ar.size(); i++) {
//            if (i % 2 == 0) {
//                ar.set(i, even.get(j));
//                j++;
//            } else {
//                ar.set(i, odd.get(m));
//                m++;
//            }
//        }
//        System.out.println(ar);

        // 3: sort the first half of the list in increasing order and the other ones in decreasing order
        int fh, lh;
        if (ar.size() % 2 == 0) {
            fh = ar.size() / 2 - 1;
            lh = fh + 1;
        } else {
            fh = ar.size() / 2 - 1;
            lh = fh + 2;
        }
        // 3.1:
//        for (int i = 0; i <= fh - 1; i++) {
//            int min = i;
//            for (int j = i + 1; j <= fh; j++) {
//                if (ar.get(min) > ar.get(j)) {
//                    min = j;
//                }
//            }
//            int tem = ar.get(i);
//            ar.set(i, ar.get(min));
//            ar.set(min, tem);
//        }
//        for (int i = lh; i < ar.size(); i++) {
//            int min = i;
//            for (int j = i + 1; j < ar.size(); j++) {
//                if (ar.get(min) < ar.get(j)) {
//                    min = j;
//                }
//            }
//            int tem = ar.get(i);
//            ar.set(i, ar.get(min));
//            ar.set(min, tem);
//        }
//        System.out.println(ar);
        // 3.2:
//        Collections.sort(ar.subList(0, fh + 1));
//        Collections.sort(ar.subList(lh, ar.size()));
//        System.out.println(ar);

        // 4: delete the greatest element in the list and sort 5 first elements in increasing order
        int max = 0;
        for (int i = 1; i < ar.size(); i++) {
            if (ar.get(i) > ar.get(max)) {
                max = i;
            }
        }
        ar.remove(max);
        System.out.println(ar);
        Collections.sort(ar.subList(0, 5));
        System.out.println(ar);
    }
}

class MySort implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 == o2) {
            return 0;
        } else {
            return o1 > o2 ? -1 : 1;
        }
    }

}

class TestList {

    public static void main(String[] args) {
        HwList hw = new HwList();
        ArrayList<Integer> ar = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Enter size of collection: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ar.add(rd.nextInt(100));    // add n random numbers to the collection
        }
        System.out.print("Before: ");
        System.out.println(ar);
//        System.out.println("Result: " + hw.F1(ar));
        System.out.print("After: ");
        hw.F3(ar);
    }
}
