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
public class DynamicProgramming {
    
    long[] f = new long[45];
    
    long fibo (int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        if (f[n]!=0) return f[n];
        f[n]= fibo(n-1)+fibo(n-2);
        return f[n];
    }
    
    public static void main(String[] args) {
        DynamicProgramming dn = new DynamicProgramming();
        for (int i = 0; i < 45; i++) {
            System.out.print(dn.fibo(i) + " ");
        }
    }
}
