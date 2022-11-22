/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayStack;

import java.util.Scanner;

/**
 *
 * @author VSIT
 */
public class MainAStack {
    public static void main(String[] args) {
        int choice, x, k;
        Scanner sc = new Scanner(System.in);
        ArrayStack as = new ArrayStack();
        Integer X;
        while (true) {
            System.out.println();
            System.out.println("1. Push");
            System.out.println("2. Top");
            System.out.println("3. Pop");
            System.out.println("4. Display All");
            System.out.println("0. Exit");
            System.out.println("    Your selection (0->4): ");
            choice = sc.nextInt();
            if (choice == 0) break;
            switch (choice) {
                case 1:
                    System.out.print("Enter the value to be pushed: ");
                    x = sc.nextInt();
                    X = new Integer(x);
                    as.push(X);
                    break;
                case 2:
                    try {
                        System.out.print("The elements at the top: " + as.top());
                    } catch (Exception e) {
                        System.out.print("This stack is empty now");
                    }
                    break;
                case 3:
                    try {
                        System.out.print("The poped elements: " + as.pop());
                    } catch (Exception e) {
                        System.out.print("This stack is empty now");
                    }
                    break;
                case 4: 
                    as.displayAll();
            }
        }
    }
}
