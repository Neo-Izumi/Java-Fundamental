/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VSIT
 */
public class EmpList extends Vector<Employee> {

    Scanner sc = new Scanner(System.in);

    public EmpList() {
        super();
    }

    // to add employees from a text file
    public void addFromFile(String fName) {
        try {
            File f = new File(fName);   // check file 
            if (!f.exists()) {
                return;
            }
            FileReader fr = new FileReader(f);  // read()
            BufferedReader br = new BufferedReader(fr);     // readLine()
            String details;
            while ((details = br.readLine()) != null) {
                // split details into elements
                StringTokenizer stk = new StringTokenizer(details, ",");
                String code = stk.nextToken().toUpperCase();
                String name = stk.nextToken().toUpperCase();
                int salary = Integer.parseInt(stk.nextToken());
                // create an employee
                Employee emp = new Employee(code, name, salary);
                this.add(emp);
            }
            br.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    // to save new employees to text file
    public void saveToFile(String fName) {
        if (this.size() == 0) {
            System.out.println("Empty list");
            return;
        }
        try {
            File f = new File(fName);
            FileWriter fw = new FileWriter(f);      // write()
            PrintWriter pw = new PrintWriter(fw);    // print()
            for (Employee emp : this) {
                pw.println(emp.getCode() + "," + emp.getName() + "," + emp.getSalary());
            }
            pw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // to search an employee by their code
    private int find(String code) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCode().equals(code)) {
                return i;
            }
        }
        return -1;
    }

    // to add new employee
    public void addNewEmp() {
        String newcode, newname;
        int newsalary, pos;
        boolean valid = true;
        System.out.println("Enter new employee details: ");
        do {
            System.out.print("    code Exxx: ");
            newcode = sc.nextLine().toUpperCase();
            pos = find(newcode);
            valid = newcode.matches("^E\\d{3}$");   // contain E and 3 digits
            if (pos >= 0) {
                System.out.println("    Duplicated code");
            }
            if (!valid) {
                System.out.println("    Invalid code");
            }
        } while (pos >= 0 || !valid);
        System.out.print("    name: ");
        newname = sc.nextLine().toUpperCase();
        System.out.print("    salary: ");
        newsalary = Integer.parseInt(sc.nextLine());
        this.add(new Employee(newcode, newname, newsalary));
        System.out.println("New employee has been added.");
    }

    // remove an employee
    public void removeEmp() {
        String code;
        System.out.print("Enter the employee code that you want to remove: ");
        code = sc.nextLine().toUpperCase();
        int pos = find(code);
        if (pos < 0) {
            System.out.println("This code doesn't exist.");
        } else {
            this.remove(pos);
            System.out.println("The employee with code " + code + "has been removed");
        }
    }

    // to increase salary
    public void increaseSalary() {
        String code;
        System.out.print("Enter the employee code that you want to increase their salary: ");
        code = sc.nextLine().toUpperCase();
        int pos = find(code);
        if (pos < 0) {
            System.out.println("This code doesn't exist.");
        } else {
            int oldSalary = this.get(pos).getSalary();
            int newSalary;
            do {
                System.out.print("    The old salary: " + oldSalary + ", the new one: ");
                newSalary = Integer.parseInt(sc.nextLine());
            } while (oldSalary > newSalary);
            this.get(pos).setSalary(newSalary);
            System.out.println("The employee with code " + code + " has been pay rise");
        }
    }

    // to print out the list
    public void printList() {
        if (this.size() == 0) {
            System.out.println("Empty list");
            return;
        }
        Collections.sort(this);
        System.out.println("\nEMPLOYEE LIST: ");
        System.out.println("---------------------------------------");
        for (Employee emp : this) {
            emp.print();
        }
    }
}
