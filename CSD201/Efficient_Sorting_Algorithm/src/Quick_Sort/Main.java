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
public class Main {
    public static void main(String[] args) {
        int[] a = {0, 7, 2, 9, 6, 4, 5, 4, 6, 8, 10};
        QuickSort qs = new QuickSort(a);
        System.out.print("The given array: ");
        qs.display();
        System.out.print("Sorted array: ");
        qs.quickSort();
        qs.display();
    }
}
