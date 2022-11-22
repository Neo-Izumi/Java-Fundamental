/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.util.Scanner;

/**
 *
 * @author VSIT
 */
public class ManageProgram {

    public static void main(String[] args) {
        String filename = "Employee.txt";
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.add("Add new employee");
        menu.add("Remove an employee");
        menu.add("Pay rise for an employee");
        menu.add("Print the list");
        menu.add("Save to file");
        menu.add("Quit");
        menu.displayMenu();
        int userChoice;
        boolean changed = false;
        EmpList list = new EmpList();
        list.addFromFile(filename);
        do {
            System.out.println("\nEMPLOYEE MANAGER");
            userChoice = menu.getUserChoice();
            switch (userChoice) {
                case 1:
                    list.addNewEmp();
                    changed = true;
                    break;
                case 2:
                    list.removeEmp();
                    changed = true;
                    break;
                case 3:
                    list.increaseSalary();
                    changed = true;
                    break;
                case 4:
                    list.printList();
                    break;
                case 5:
                    list.saveToFile(filename);
                    changed = true;
                    break;
                default:
                    if (changed) {
                        System.out.println("Save changes [Y/N]? ");
                        String rp = sc.nextLine().toUpperCase();
                        if (rp.startsWith("Y")) {
                            list.saveToFile(filename);
                        }
                    }
            }
        } while (userChoice < 6 && userChoice > 0);
    }
}
