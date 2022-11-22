/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bubble;

import java.util.Random;

/**
 *
 * @author VSIT
 */
public class BubbleSort {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(100);
        }
        for (int i = 0; i < a.length-1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[a.length-1]);
        for (int i = 0; i < 19-3; i++) {
            for (int j = 19; j > 0+i; j--) {
                if (a[j]>a[j-1]) {
                    int tem = a[j];
                    a[j]=a[j-1];
                    a[j-1]=tem;
                }
            }
        }
        for (int i = 0; i < a.length-1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[a.length-1]);
    }
}
