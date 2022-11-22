/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

import java.util.ArrayList;

/**
 *
 * @author VSIT
 */
public class StudentManager {

    public static void main(String[] args) {
        // options in menu
        ArrayList options = new ArrayList();
        options.add("Add new student");
        options.add("Search a student");
        options.add("Update name and mark");
        options.add("Remove a student");
        options.add("List all");
        options.add("Quit");
        int choice = 0;
        StudentList list = new StudentList();
        do {
            System.out.println("\nStudent managing program");
            choice = Menu.getChoice(options);
            switch (choice) {
                case 1:
                    list.addStudent();
                    break;
                case 2:
                    list.searchStudent();
                    break;
                case 3:
                    list.updateStudent();
                    break;
                case 4:
                    list.removeStudent();
                    break;
                case 5:
                    list.printAll();
                    break;
                default:
                    System.out.println("Bye!");
            }
        } while (choice > 0 && choice < 6);

    }
}
