/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EightQueens;

import java.util.Scanner;

/**
 *
 * @author VSIT
 */
public class Queen {

    int n, count;
    boolean[] a, b, c;
    int[] x;
    Scanner sc;

    public Queen() {
        x = new int[25];  // array x is to hold all solutions
        a = new boolean[50];    // array a is to check whether a row is safe or not
        b = new boolean[50];    // array a is to check whether DCDL is safe or not
        c = new boolean[50];    // array a is to check whether DCDX is safe or not
        sc = new Scanner(System.in);
    }

    void init() {
        int i;
        System.out.print(" n = ");  // n is the size of chess board
        n = sc.nextInt();
        count = 0;
        for (i = 1; i <= n; i++) {
            a[i] = true;  // all row are safe
        }
        for (i = 1; i <= 2 * n; i++) {
            b[i] = true;  // all DCDL are safe
        }
        for (i = 1; i <= 2 * n; i++) {
            c[i] = true;  // all DCDX are safe
        }
    }

    void result() {
        int i;
        System.out.printf("\nSolution%3d: ", ++count);
        for (i = 1; i <= n; i++) {
            System.out.printf("%4d", x[i]);
        }
    }

    void test(int j) {
        int i = 0;
        do {    // test each row one after another
            i++;
            if (a[j] && b[i + j] && c[i - j + n]) {   // if O(i,j) is safe
                x[j] = i;     // place a queen to row i (it means O(i,j) is not safe anymore)
                a[i] = false;
                b[i + j] = false;
                c[i - j + n] = false;
                if (j < n) {  // if j isn't the last queen
                    test(j + 1);  // recursive point
                } else {
                    result();
                }
                // save j to reuse
                a[i] = true;
                b[i + j] = true;
                c[i - j + n] = true;
            }
        } while (i < n);
    }
}
