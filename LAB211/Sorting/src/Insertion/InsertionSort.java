/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Insertion;

import java.util.Random;

/**
 *
 * @author VSIT
 */
public class InsertionSort {
    
    public void Insert(int[] a) {
        int l = a.length;
        for (int i = 1; i < l; i++) {
            int key = a[i], j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Random rd = new Random();
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(100);
        }
        System.out.print("The given array: ");
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[a.length - 1]);
        InsertionSort is = new InsertionSort();
        is.Insert(a);
        System.out.print("After sorting: ");
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[a.length - 1]);
    }
}
