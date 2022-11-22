/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author VSIT
 */
public class Menu extends Vector<String> {

    public Menu() {
        super();
    }

    public void addMenuItem(String s) {
        this.add(s);
    }

    public void displayMenu() {
        for (int i = 0; i < this.size(); i++) {
            System.out.println((i + 1) + ": " + this.get(i));
        }
    }

    public int getUserChoice() {
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
}
