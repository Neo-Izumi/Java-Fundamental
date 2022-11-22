/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author VSIT
 */
public class Recursive {
    
    long fibo(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fibo(n-1) + fibo(n-2);
    }
    
    void display() {
        for (int i = 0; i < 45; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
    
    public static void main(String[] args) {
        new Recursive().display();
    }
}
