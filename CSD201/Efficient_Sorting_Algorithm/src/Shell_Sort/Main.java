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
public class Main {
    public static void main(String[] args) {
        int[] b = {7, 3, 5, 9, 11, 8, 6, 15, 10, 12, 14};
        ShellSort ss = new ShellSort(b);
        System.out.print("The given array:");
        ss.display();
        System.out.print("Sorted array:");
        ss.shellSort();
        ss.display();
    }
}
