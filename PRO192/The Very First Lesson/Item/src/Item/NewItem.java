/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author VSIT
 */
public class NewItem extends Vector<Item> {

    Scanner sc = new Scanner(System.in);
    Vector<String> storedCodes = new Vector<>();

    public NewItem() {
        super();
    }

    // to load stored code from a text file 
    public void loadStoredCode(String fName) {
        // clear old codes before loading new codes
        if (storedCodes.size() > 0) {
            storedCodes.clear();
        }
        try {
            File f = new File(fName);
            if (!f.exists()) {
                return;
            }
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String code, name, priceStr;
            while ((code = br.readLine()) != null
                    && (name = br.readLine()) != null
                    && (priceStr = br.readLine()) != null) {
                storedCodes.add(code);
            }
            fr.close();
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // to check the validity of a code
    private boolean valid(String aCode) {
        // stored codes
        for (int i = 0; i < storedCodes.size(); i++) {
            if (aCode.equals(storedCodes.get(i))) {
                return false;
            }
        }
        // new-item list
        for (int i = 0; i < this.size(); i++) {
            if (aCode.equals(this.get(i).getCode())) {
                return false;
            }
        }
        return true;
    }

    // to find an item code in new-item list
    private int find(String aCode) {
        for (int i = 0; i < this.size(); i++) {
            if (aCode.equals(this.get(i).getCode())) {
                return i;
            }
        }
        return -1;
    }

    // to append new-item list to a text file
    public void appendToFile(String fName) {
        if (this.size() == 0) {
            System.out.println("Empty list");
            return;
        }
        try {
            boolean append = true;
            File f = new File(fName);
            FileWriter fw = new FileWriter(f, append);
            PrintWriter pw = new PrintWriter(fw);
            for (Item item : this) {
                pw.println(item.getCode());
                pw.println(item.getName());
                pw.println(item.getPrice());
                pw.flush();     // write to file immediately
            }
            pw.close();
            fw.close();
            this.loadStoredCode(fName);     // reload stored codes
            this.clear();       // clear item list
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // to add new item
    public void addNewItem() {
        String newCode, newName;
        int newPrice;
        boolean duplicated = false, match = true;
        System.out.println("Enter new item details");
        do {
            System.out.print("    Code(Ixxx): ");
            newCode = sc.nextLine().toUpperCase();
            duplicated = !valid(newCode);
            match = newCode.matches("^I\\d{3}$");
            if (duplicated) {
                System.out.println("    Duplicated code");
            }
            if (!match) {
                System.out.println("    Invalid Code");
            }
        } while (duplicated || !match);
        System.out.print("    Name: ");
        newName = sc.nextLine();
        System.out.print("    Price: ");
        newPrice = Integer.parseInt(sc.nextLine());
        this.add(new Item(newCode, newName, newPrice));
        System.out.println("    New item has been added");
    }

    // check new-item list
    private int checkNewList(String code) {
        for (int i = 0; i < this.size(); i++) {
            if (code.equals(this.get(i).getCode())) {
                return i;
            }
        }
        return -1;
    }

    // to remove an items from new-item list
    public void removeItem() {
        String code;
        int check;
        System.out.print("Enter the item code that you want to remove: ");
        do {
            code = sc.nextLine().toUpperCase();
            check = checkNewList(code);
            if (check == -1) {
                System.out.println("This code doesn't exist");
            }
        } while (check == -1);
        this.remove(check);
    }

    // to update an item price
    public void updatePrice() {
        String code;
        int check;
        System.out.print("Enter the item code that you want to remove: ");
        do {
            code = sc.nextLine().toUpperCase();
            check = checkNewList(code);
            if (check == -1) {
                System.out.println("This code doesn't exist");
            }
        } while (check == -1);
        System.out.print("Old price: " + this.get(check).getPrice() + " the new price: ");
        int newPrice = Integer.parseInt(sc.nextLine());
        this.get(check).setPrice(newPrice);
    }

    // to print out the list
    public void printList() {
        if (this.size() == 0) {
            System.out.println("Empty list");
            return;
        }
        Collections.sort(this);
        System.out.println("\nITEMS LIST");
        System.out.println("--------------------------------------");
        for (Item item : this) {
            item.print();
        }
    }
}
