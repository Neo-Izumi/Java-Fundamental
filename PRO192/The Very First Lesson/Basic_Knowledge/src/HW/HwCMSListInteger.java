/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author VSIT
 */
public class HwCMSListInteger {

    int F1(ArrayList<Integer> ar) {
        
        // 1,2: return the number and the sum of elements that are greater than the average 
//        int ave = 0, sum = 0, cnt = 0;
//        for (int i = 0; i < ar.size(); i++) {
//            ave += ar.get(i);
//        }
//        ave = ave / ar.size();
//        System.out.println(ave);
//        for (int i = 0; i < ar.size(); i++) {
//            if (ar.get(i) > ave) {
//                cnt++;
//                sum += ar.get(i);
//            }
//        }
//        return cnt;
//        return sum;

        // 3: return the sum of elements that are at the non-prime indexes
//        int sum = 0;
//        for (int i = 0; i < ar.size(); i++) {
//            if (!HwCheckNumber.checkPrimes(i)) {
//                sum += ar.get(i);
//            }
//        }
//        return sum;
        
        // 4: return the integer division of the greatest number by the smalleast number
//        int min = 0, max = 0;
//        for (int i = 1; i < ar.size(); i++) {
//            if (ar.get(i) > ar.get(max)) {
//                max = i;
//            }
//            if (ar.get(i) < ar.get(min)) {
//                min = i;
//            }
//        }
//        return (ar.get(max) / ar.get(min));
        
        // 5: delete the first greatest and smallest elements, return the averge of new list
//        int min = 0, max = 0, ave = 0;
//        for (int i = 1; i < ar.size(); i++) {
//            if (ar.get(i) > ar.get(max)) {
//                max = i;
//            }
//            if (ar.get(i) < ar.get(min)) {
//                min = i;
//            }
//        }
//        ar.remove(max);
//        ar.remove(min);
//        System.out.println(ar);
//        for (int i = 0; i < ar.size(); i++) {
//            ave += ar.get(i);
//        }
//        return ave / ar.size();
        
        // 6: delete all the greatest and smallest elements, return the averge of new list
//        int min = 0, max = 0, ave = 0;
//        for (int i = 1; i < ar.size(); i++) {
//            if (ar.get(i) > ar.get(max)) {
//                max = i;
//            }
//            if (ar.get(i) < ar.get(min)) {
//                min = i;
//            }
//        }
//        for (int i = 0; i < ar.size(); i++) {
//            if (Objects.equals(ar.get(i), ar.get(max)) || Objects.equals(ar.get(i), ar.get(max))) {
//                ar.remove(i);
//            }
//        }
//        System.out.println(ar);
//        for (int i = 0; i < ar.size(); i++) {
//            ave += ar.get(i);
//        }
//        return ave / ar.size();
      
        // 7: return the average of the first half of the list
//        int ave = 0;
//        for (int i = 0; i < ar.size() / 2; i++) {
//            ave += ar.get(i);
//        }
//        return ave / ar.size();
        
        // 8: 
//        int ave = 0, gtave = 0, ltave = 0, cntgt = 0, cntlt = 0;
//        for (int i = 0; i < ar.size(); i++) {
//            ave += ar.get(i);
//        }
//        ave = ave / ar.size();
//        for (int i = 0; i < ar.size(); i++) {
//            if (ar.get(i) > ave) {
//                gtave += ar.get(i);
//                cntgt++;
//            }
//            if (ar.get(i) < ave) {
//                ltave += ar.get(i);
//                cntlt++;
//            }
//        }
        // 8.a: return the average of all elements that are greater than the avegrage of list
//        return gtave / cntgt;
        // 8.b: return the average of all elements that are smaller than the avegrage of list
//        return ltave / cntlt;
        // 8.c: return the quotient of the gtave divided by ltave
//        return gtave / ltave;
        // 9,10: return the elements that occur the most and the average of the frequency of the occurence of the elements 
        int[] a = new int[ar.size()];
        for (int i = 0; i < ar.size(); i++) {
            int cnt = 0;
            for (int j = i + 1; j < ar.size(); j++) {
                if (ar.get(i) == ar.get(j)) {
                    cnt++;
                }
            }
            a[i] = cnt;
        }
        int max = 0, ave = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[max] < a[i]) {
                max = i;
            }
            ave += a[i];
        }
        return ar.get(max);
//        return ave / a.length;
    }

    void F2(ArrayList<Integer> ar) {
        
        // 1: sort the elements in the first half of the list (not including the middle one), the other stand still  
//        Collections.sort(ar.subList(0, ar.size()/2));
//        System.out.println(ar);
        
        // 2: sort the elements greater than the average, the other stand still
//        int ave = 0;
//        for (int i = 0; i < ar.size(); i++) {
//            ave += ar.get(i);
//        }
//        ave = ave / ar.size();
//        System.out.println(ave);
//        ArrayList<Integer> tem = new ArrayList<>();
//        for (int i = 0; i < ar.size(); i++) {
//            if (ar.get(i) > ave) {
//                tem.add(ar.get(i));
//            }
//        }
//        Collections.sort(tem, (o1, o2) -> {
//            return o2 - o1;
//        });
//        int j = 0;
//        for (int i = 0; i < ar.size(); i++) {
//            if (ar.get(i) > ave) {
//                ar.set(i, tem.get(j++));
//            }
//        }
//        System.out.println(ar);
        
        // 3: sort all even numbers, odd numbers stand still
//        ArrayList<Integer> tem = new ArrayList<>();
//        for (int i = 0; i < ar.size(); i++) {
//            if (ar.get(i) % 2 == 0) {
//                tem.add(ar.get(i));
//            }
//        }
//        Collections.sort(tem, (o1, o2) -> o2 - o1);
//        int j = 0;
//        for (int i = 0; i < ar.size(); i++) {
//            if (ar.get(i) % 2 == 0) {
//                ar.set(i, tem.get(j++));
//            }
//        }
//        System.out.println(ar);

        // 4: reverse the first half list, the other stand still
        Collections.reverse(ar.subList(0, ar.size() / 2));
        System.out.println(ar);
        
        // 5: reverse elements greater than ave, the other stand still
        ArrayList<Integer> tem = new ArrayList<>();
        int ave = 0;
        for (int i = 0; i < ar.size(); i++) {
            ave += ar.get(i);
        }
    }
}


class TestCMSListInteger {

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        HwCMSListInteger hw = new HwCMSListInteger();
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ar.add(rd.nextInt(100));
        }
        System.out.println("The given ArrayList: ");
        System.out.println(ar);
//        System.out.println(hw.F1(ar));
        hw.F2(ar);
    }
}