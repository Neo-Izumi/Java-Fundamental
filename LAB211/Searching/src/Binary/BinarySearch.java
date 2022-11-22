/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary;

import java.util.Random;

/**
 *
 * @author VSIT
 */
public class BinarySearch {
    
    void sort(int[] a) {
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
    
    // 1
    
    int BinSearch(int [] a, int x) {
        sort(a);
        int last=a.length-1, first=0, mid;
            while (first<=last) {
            mid= first+(last-first)/2;
            if(a[mid]==x) return mid;
            else if (a[mid]<x) first=mid+1;
            else last=mid-1;
        }
        return -1;
    }
    
    void display(int[] a, int x) {
        int check = BinSearch(a, x);
        if (check == -1) System.out.println("There is no element with key value");
        else {
            int i = check, j=check+1, k=0, al = a.length, save;
            if (al == 1) {
                System.out.println("Found " + x + " at index " + check);
                return;
            }
            int[] b = new int[al];
            for (int l = 0; l < al; l++) {
                b[l] = -1;
            }
            while (a[i] == x) {
                b[k++] = i--;
                if (i < 0) break;
            }
            while (a[j] == x) {
                b[k++] = j++;
                if (j >= al) break; 
            }
            sort(b);
            System.out.print("Found " + x + " at index:");
            for (int l = 0; l < b.length; l++) {
                if (b[l] != -1) System.out.print(" "+b[l]);
            }
        }
    }
    
    public static void main(String[] args) {
       BinarySearch bs = new BinarySearch();
//       int[] a = bs.random(10);
       int [] a = {1,10,7,4,5,6,7,5,5,9,5};
        bs.sort(a);
        bs.output(a);
        bs.display(a, 5);
    }
}
