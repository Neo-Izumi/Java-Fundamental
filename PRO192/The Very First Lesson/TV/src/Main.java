
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VSIT
 */
public class Main {

    void display(ArrayList<TV> ar) {
        for (TV tv : ar) {
            System.out.println(tv);
        }
    }

    public static void main(String[] args) {
        ArrayList<TV> ar = new ArrayList<>();
        
        
        // test case
        ar.add(new TV("Sony", 125, 12.25));
        ar.add(new TV("LG", 327, 67.28));
        ar.add(new TV("Hello", 312, 21.25));
        ar.add(new TV("gundam", 666, 66.66));
        ar.add(new TV("counter", 666, 12.25));
        ar.add(new TV("hello", 345, 490.324));
        ar.add(new TV("alo123alo", 1223, 1234.232));
        ar.add(new TV("thinh", 327, 778.293));
        ar.add(new TV("THINH", 666, 66.66));
        ar.add(new TV("okok", 451, 4546));
        ar.add(new TV("Dell", 509, 152.212));
        ar.add(new TV("TLC", 345, 12.25));
        ar.add(new TV("cinema", 342, 12.22));
        ar.add(new TV("cinema", 784, 123.23));
        MyTV my = new MyTV();
        System.out.println("The List of TVs: ");
        for (TV tv : ar) {
            System.out.println(tv);
        }
        System.out.println("----------------------");
//        System.out.println(my.F1(ar, 666, "llo"));
//        my.F2(ar, 327, "llo");
        System.out.println(my.F3(ar, 125, "llo"));
        
        
        
        // application
//        Scanner sc = new Scanner(System.in);
//        System.out.println("How many TVs do you want to add?");
//        int n = Integer.parseInt(sc.nextLine());
//        for (int i = 0; i < n; i++) {
//            System.out.format("TV No.%d: ", i);
//            System.out.println();
//            System.out.print("Name: ");
//            String name = sc.nextLine();
//            System.out.print("Size: ");
//            int size = sc.nextInt();
//            System.out.print("Price: ");
//            double price = sc.nextDouble();
//            ar.add(new TV(name, size, price));
//        }
//        MyTV my = new MyTV();
//        int select;
//        do {
//            System.out.println("What u wanna do?");
//            System.out.println("1: Find the number of TVs by condition");
//            System.out.println("2: Rearrange TVs by condition");
//            System.out.println("3: Find the particular TVs by condition");
//            select = Integer.parseInt(sc.nextLine());
//        } while (select > 3 || select < 1);
//        switch (select) {
//            case 1:
//                System.out.print("Condition 1: ");
//                int x = Integer.parseInt(sc.nextLine());
//                System.out.print("Condition 2: ");
//                String s = sc.nextLine();
//                System.out.format("There are(is) %d TVs that satisfy the condition", my.F1(ar, x, s));
//                break;
//            case 2:
//                System.out.print("Condition 1: ");
//                x = Integer.parseInt(sc.nextLine());
//                System.out.print("Condition 2: ");
//                s = sc.nextLine();
//                my.F2(ar, x, s);
//                break;
//            case 3:
//                System.out.print("Condition 1: ");
//                x = Integer.parseInt(sc.nextLine());
//                System.out.print("Condition 2: ");
//                s = sc.nextLine();
//                System.out.println("The TV satisfying conditions is: " + my.F3(ar, x, s));
//                break;
//        }
    }
}
