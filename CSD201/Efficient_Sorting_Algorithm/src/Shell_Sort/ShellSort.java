/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shell_Sort;

/**
 *
 * @author Thinh
 */
public class ShellSort {

    int[] a;
    int l;

    public ShellSort() {
    }

    public ShellSort(int[] b) {
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

    // shell sort
    void insertSort(int dist) {
        int tem, j;
        for (int i = dist; i < l; i++) {
            tem = a[i];
            j = i;
            while (j - dist >= 0 && tem < a[j - dist]) {
                a[j] = a[j - dist];
                j = j - dist;
            }
            a[j] = tem;
        }
    }

    void shellSort(int[] step) {
        int dist;
        for (int i = 0; i < step.length; i++) {
            dist = step[i];
            insertSort(dist);
        }
    }

    void shellSort() {
        int[] step = {5, 3, 1};
        shellSort(step);
    }
}
