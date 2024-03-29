/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

import java.util.Scanner;

/**
 *
 * @author VSIT
 */
public class ItemManager {

    public static void main(String[] args) {
        String filename = "items.txt";
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.add("Add new item");
        menu.add("Remove an item");
        menu.add("Update an item's price");
        menu.add("Print the list");
        menu.add("Save to files");
        menu.add("Quit");
        menu.displayMenu();
        int userChoice;
        NewItem list = new NewItem();
        list.loadStoredCode(filename);
        do {
            System.out.println("\nNEW ITEM MANAGER ");
            userChoice = menu.getUserChoice();
            switch (userChoice) {
                case 1:
                    list.addNewItem();
                    break;
                case 2:
                    list.removeItem();
                    break;
                case 3:
                    list.updatePrice();
                    break;
                case 4:
                    list.printList();
                    break;
                case 5:
                    list.appendToFile(filename);
                    break;
                default:
                    if (list.size() > 0) {
                        System.out.print("Save changes [Y/N] ?");
                        String rp = sc.nextLine().toUpperCase();
                        if (rp.startsWith("Y")) {
                            list.appendToFile(filename);
                        }
                    }
            }
        } while (userChoice > 0 && userChoice < 6);

    }
}
