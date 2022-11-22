
package fibonacci;


public class NonRecursive {
    
    long fibo(int n, long[] a) {
        if (n==0) return 0;
        else if (n<3) return 1;
        else {
            return a[n-1] + a[n-2];
        }
    }
    
    void display () {
        long [] a = new long[45];
        for (int i = 0; i < 45; i++) {
            a[i] = fibo(i, a);
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        NonRecursive fb = new NonRecursive();
        fb.display();
    }
    
}
