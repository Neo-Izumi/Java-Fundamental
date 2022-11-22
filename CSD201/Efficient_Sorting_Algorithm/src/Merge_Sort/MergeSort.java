/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Merge_Sort;

/**
 *
 * @author Thinh
 */
public class MergeSort {

    int a[];
    int l;

    public MergeSort() {
    }

    public MergeSort(int[] b) {
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

    // merge 2 sorted array
    void merge(int first, int mid, int last) {
        if (!(first <= mid) && (mid <= last)) {
            return;
        }
        int n, i, j, k;
        n = last - first + 1;
        i = first;
        j = mid + 1;
        k = 0;
        int[] b = new int[n];
        while (i <= mid && j <= last) {
            if (a[i] < a[j]) {
                b[k++] = a[i++];
            } else {
                b[k++] = a[j++];
            }
        }
        while (i <= mid) {
            b[k++] = a[i++];
        }
        while (j <= last) {
            b[k++] = a[j++];
        }
        k = 0;
        for (int m = first; m <= last; m++) {
            a[m] = b[k++];
        }
    }

    // merge-sort algorithm
    void mergeSort(int first, int last) {
        if (first >= last) {
            return;
        }
        int mid = (last + first) / 2;
        mergeSort(first, mid);
        mergeSort(mid + 1, last);
        merge(first, mid, last);
    }

    void mergeSort() {
        mergeSort(0, l - 1);
    }
}
