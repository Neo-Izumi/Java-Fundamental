/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linear;

import java.util.Random;

/**
 *
 * @author VSIT
 */
public class LinearSearch {
    
    void output (int[]a) {
        int l = a.length;
        for (int i = 0; i < l-1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[l-1]);
    }
    
    int[] random (int n) {
        Random rd = new Random();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(10);
        }
        return a;
    } 
    
    int Linsearch (int[] a, int key, int checkpoint) {
        for (int i = checkpoint; i < a.length; i++) {
            if (a[i] == key) return i;
        }
        return -1;
    } 
    
    void display (int[] a, int key) {
        int result = Linsearch(a, key, 0), l = a.length, i = 0, j=0;
        if (result == -1) System.out.println("There is no element with key value"); 
        else {
            System.out.print("Found " + key + " at index: ");
//            int[] b = new int[l];
//            for (int k = 0; k < b.length; k++) {
//                b[k] = -1;
//            }
            while (result != -1) {
//                b[i] = result;
//                i++;
                System.out.print(result + " ");
                result = Linsearch(a, key, result+1);
            }
//            while (b[j] != -1) {
//                System.out.print(b[j] + " ");
//                j++;
//            }
        }
    }
    
    public static void main(String[] args) {
        LinearSearch ln = new LinearSearch();
        int [] a = ln.random(10);
//        int [] a = {5,5,5,5,3,123,5,534};
        ln.output(a);
        ln.display(a, 5);
    }
}
