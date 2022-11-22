/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quick_Sort;

/**
 *
 * @author Thinh
 */
public class QuickSort {

    int[] a;
    int l;

    public QuickSort() {
    }

    public QuickSort(int[] b) {
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

    // swap elements at index i and k in array a 
    void swap(int[] a, int i, int k) {
        int tem = a[i];
        a[i] = a[k];
        a[k] = tem;
    }

    // devide the array to 2 parts, all elements less than pivot gonna be in the left side of pivot, right side is all elements greater than pivot
    int partition(int first, int last) {
        int pivot, pivotval;
        pivotval = a[first];
        int i = first, j = last;
        while (i < j) {
            while (a[i] <= pivotval && i < last) {
                i++;    // find the first elements greater than pivot
            }
            while (a[j] > pivotval) {
                j--;    // find the first elements less than pivot
            }
            if (i < j) {
                swap(a, i, j);
            }
        }
        swap(a, first, j);  // j is index of the last elements less than pivot
        pivot = j;
        return pivot;
    }

    void quickSort(int first, int last) {
        int pivot;
        if (first >= last) {
            return;
        }
        pivot = partition(first, last);     // complexity: n 
        quickSort(first, pivot - 1);      // complexity: n/2
        quickSort(pivot + 1, last);       // complexity: n/2
    }

    void quickSort() {
        quickSort(0, l - 1);
    }
}
