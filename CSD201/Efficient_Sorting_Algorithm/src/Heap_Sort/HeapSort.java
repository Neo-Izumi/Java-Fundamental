/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heap_Sort;

/**
 *
 * @author Thinh
 */
public class HeapSort {

    int[] a;
    int l;

    public HeapSort() {
    }

    public HeapSort(int[] b) {
        l = b.length;
        a = new int[l];
        for (int i = 0; i < l; i++) {
            a[i] = b[i];
        }
    }

    void setData(int[] b) {
        l = b.length;
        a = new int[l];
        for (int i = 0; i < l; i++) {
            a[i] = b[i];
        }
    }

    void display() {
        for (int i = 0; i < l; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }

    void heap() {
        int tem, son;
        for (int i = 1; i < l; i++) {
            tem = a[i];
            son = i;
            // this while loop is to find out the correct position for tem
            // if tem is greater than a element at index of it's father, change it to be a son
            while (son > 0 && tem > a[(son - 1) / 2]) {
                a[son] = a[(son - 1) / 2];
                son = (son - 1) / 2;
            }
            // put tem to the correct position
            a[son] = tem;
        }
    }

    void heapSort() {
        heap();
        System.out.print("Heap:");
        display();
        int tem, father, son;
        for (int i = l - 1; i > 0; i--) {
            // the greatest elements of the heap is a[0], so put it into last index
            tem = a[i];
            a[i] = a[0];
            // rebuild heap from remain elements (0 to i) 
            father = 0;
            son = 2 * father + 1;  // left son
            // if father have a right son and this son is greater than left son, use right son
            if (son + 1 < i && a[son] < a[son + 1]) {
                son = son + 1;
            }
            while (son < i && tem < a[son]) {
                a[father] = a[son];
                father = son;
                son = 2 * father + 1;
                if (son < i && a[son] < a[son + 1]) {
                    son = son + 1;
                }
            }
            a[father] = tem;
        }
    }
}
