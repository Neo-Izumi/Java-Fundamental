/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HanoiTower;

/**
 *
 * @author VSIT
 */
public class HanoiTower {

    static void Hanoi(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println(" " + a + " -> " + b);
        } else {
            Hanoi(n - 1, a, c, b);
            Hanoi(1, a, b, c);
            Hanoi(n - 1, c, b, a);
        }
    }

    public static void main(String[] args) {
        char a = 'A', b = 'B', c = 'C';
        int n = 3;
        System.out.println();
        System.out.println("Hanoi Tower for n= " + n);
        Hanoi(n, a, b, c);
        System.out.println();
    }
}
