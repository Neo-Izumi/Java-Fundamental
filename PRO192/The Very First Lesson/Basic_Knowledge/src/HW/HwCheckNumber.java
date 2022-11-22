/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

import static java.lang.Math.*;
import java.util.Scanner;

/**
 *
 * @author VSIT
 */
public class HwCheckNumber {

    // 1: check primes
    public static  boolean checkPrimes(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 2: check fibonacci number (is a natural number that is the sum of the two preceding ones)
    public boolean checkFibo(int n) {
        int a = 0, b = 1, c = 1;
        if (n == 0 || n == 1) {
            return true;
        }
        while (c <= n) {
            if (n == c) {
                return true;
            }
            c = a + b;
            a = b;
            b = c;
        }
        return false;
    }

    // 3: print out fibonacci number at position n (recursion)
    public int printFibo(int n) {
        switch (n) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 1;
            default:
                return printFibo(n - 1) + printFibo(n - 2);
        }
    }

    // 4: check palindrome number (is an natural number that remains the same when its digits are reversed)
    public boolean checkPalin(int n) {
        int m = n, k = 0;
        while (m > 0) {
            k = k * 10 + (m % 10);
            m /= 10;
        }
        if (k == n) {
            return true;
        } else {
            return false;
        }
    }

    // 5: check armstrong (or narcissistic) number (is the natural number that equal to the sum of its digits raised to the power of the number of digits it have)
    public boolean checkArm(int n) {
        int sum = 0, nod = 0, a;
        for (int i = n; i > 0; i /= 10) {
            nod++;
        }
        for (int i = n; i > 0; i /= 10) {
            a = i % 10;
            sum += pow(a, nod);
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    // 6: find gcd(a,b)
    public int gcd(int a, int b) {
        if (a < b) {
            int tem = a;
            a = b;
            b = tem;
        }
        while (a != 0 && b != 0) {
            int tem = b;
            b = a % b;
            a = tem;
        }
        return a;
    }

    // 7: find lcm(a,b)
    public int lcm(int a, int b) {
        if (a < b) {
            int tem = a;
            a = b;
            b = tem;
        }
        int tem = a;
        while (a % b != 0) {
            a += tem;
        }
        return a;
    }

    // 8: relatively primes 
    public boolean checkRelaPrime(int a, int b) {
        if (gcd(a, b) == 1) {
            return true;
        } else {
            return false;
        }
    }

    // 9: factorize n to products of factor primes
    public void factorPrime(int n) {
        System.out.print("n = ");
        for (int i = 2; i < n; i++) {
            int cnt = 0;
            while (n % i == 0) {
                cnt++;
                n /= i;
            }
            if (cnt != 0) {
                System.out.format("%d^%d.", i, cnt);
            }
        }
    }

    // 10: check positive even number
    public boolean checkPoEven(int n) {
        if (n > 0 && n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 11: the number which the sum of all its digits is divided by 10
    public boolean checkSumdb10(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        if (sum % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 12: the number which the sum of all its digits equals to 10
    public boolean checkSum10(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        if (sum == 10) {
            return true;
        } else {
            return false;
        }
    }

    // 13: the number which the product of all its digits is bigger than itself
    public boolean checkProBig(int n) {
        int pro = 1;
        while (n != 0) {
            pro *= (n % 10);
            n /= 10;
        }
        if (pro >= n) {
            return true;
        } else {
            return false;
        }
    }

    // 14: the number which the product of all its digits is devided by 7
    public boolean checkProdb7(int n) {
        int pro = 1;
        while (n != 0) {
            pro *= (n % 10);
            n /= 10;
        }
        if (pro % 7 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 15: the number which the sum of the first half number of its digits equals to the last half ones
    public boolean checkSumsym(int n) {
        int sumf = 0, suml = 0, digits = 0;
        for (int i = n; i > 0; i /= 10) {
            digits++;
        }
        while (digits > 0) {
            sumf += (n / pow(10, digits - 1));
            suml += (n % 10);
            System.out.println(sumf);
            System.out.println(suml);
            n %= pow(10, digits - 1);
            n /= 10;
            digits -= 2;
        }
        if (sumf == suml) {
            return true;
        }
        return false;
    }

    // 16: the number which the product of the first half number of its digits equals to the last half ones
    public boolean checkProsym(int n) {
        int productf = 0, productl = 0, digits = 0;
        for (int i = n; i > 0; i /= 10) {
            digits++;
        }
        while (digits > 0) {
            productf += (n / pow(10, digits - 1));
            productl += (n % 10);
            n %= pow(10, digits - 1);
            n /= 10;
            digits -= 2;
        }
        if (productf == productl) {
            return true;
        }
        return false;
    }

    // 17: check symmetric number 
    public boolean checkSym(int n) {
        int digits = 0;
        for (int i = n; i > 0; i /= 10) {
            digits++;
        }
        while (digits > 0) { //12421
            if ((n / (int) pow(10, digits - 1)) != (n % 10)) {
                return false;
            }
            n %= pow(10, digits - 1);
            n /= 10;
            digits -= 2;
        }
        return true;
    }

    // 18: the number which the sum of its digits is a primes
    public boolean checkSumPrime(int n) {
        int sum = 0;
        for (int i = n; i > 0; i /= 10) {
            sum += i % 10;
        }
        if (checkPrimes(sum) == true) {
            return true;
        } else {
            return false;
        }
    }

    // 19: reverse the given number
    public int Reverse(int n) {
        int r = 0;
        for (int i = n; i > 0; i /= 10) {
            r = r * 10 + (i % 10);
        }
        return r;
    }

    // 20: the number ends with m digits that create a number divisible by 8
    public boolean checkEnd2db8(int n, int m) {
        int digits = 0;
        for (int i = n; i > 0; i /= 10) {
            digits++;
        }
        if (digits < m) {
            if (n % 8 == 0) {
                return true;
            } else {
                return false;
            }
        }
        int e = (int) (n % pow(10, m));
        if (e % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

class TestNumber {
    public static void main(String[] args) {
        int a = 407;
        int b = 144;
        HwCheckNumber hw = new HwCheckNumber();
        System.out.println(hw.checkEnd2db8(1256, 3));
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        System.out.println(hw.checkPrimes(c));
    }
}
