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
public class Main {
    public static void main(String[] args) {
        int[] b = {7, 3, 5, 9, 11, 8, 6, 15, 10, 12, 14};
        HeapSort hs = new HeapSort(b);
        System.out.print("The given array:");
        hs.display();
        hs.heapSort();
        System.out.print("Sorted array:");
        hs.display();
    }
}
