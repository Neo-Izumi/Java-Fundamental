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
public class StudentList extends ArrayList<Student> {

    public StudentList() {
        super();
    }

    // search a student by student's code
    // this method is to prevent code duplications
    public Student search(String code) {
        code = code.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCode().equals(code)) {
                return this.get(i);
            }
        }
        return null;
    }

    // check code duplication
    private boolean isCodeDupplicated(String code) {
        code = code.trim().toUpperCase();
        return search(code) != null;
    }

    // add new student
    public void addStudent() {
        // input data
        String newCode, newName;
        int newMark;
        boolean codeDuplicated = false;
        do { //pattern: s000 or S000 ==> pattern: "[sS][\\d]{3}"
            newCode = Inputter.inputPattern("St. code S000", "[sS][\\d]{3}");
            newCode = newCode.trim().toUpperCase();
            codeDuplicated = isCodeDupplicated(newCode);
            if (codeDuplicated) {
                System.out.println("Code is duplicated!");
            }
        } while (codeDuplicated == true);
        newName = Inputter.inputNonBlankStr("Name of new student");
        newName = newName.toUpperCase();
        newMark = Inputter.inputInt("Mark", 0, 10);
        Student st = new Student(newCode, newName, newMark);
        this.add(st);
        System.out.println("Student " + newCode + " has been added.");
    }

    // search student based on inputted code
    public void searchStudent() {
        if (this.isEmpty()) {
            System.out.println("Empty list");
        } else {
            String sCode = Inputter.inputStr("Input student code for search");
            Student st = this.search(sCode);
            if (st == null) {
                System.out.println("Student " + sCode + " doesn't exist");
            } else {
                System.out.println("Found: " + st);
            }
        }
    }

    // update name and mark based on student's code
    public void updateStudent() {
        if (this.isEmpty()) {
            System.out.println("Empty list");
        } else {
            String uCode = Inputter.inputStr("Input code of updated student");
            Student st = this.search(uCode);
            if (st == null) {
                System.out.println("Student " + uCode + " doesn't exist");
            } else {
                // update student name
                String oldName = st.getName();
                String msg = "Old name: " + oldName + ", new name";
                String newName = Inputter.inputNonBlankStr(msg);
                st.setName(newName);
                // update student mảk
                int oldMark = st.getMark();
                msg = "Old mark: " + oldMark + ", new mark";
                int newMark = Inputter.inputInt(msg, 0, 10);
                st.setMark(newMark);
                System.out.println("Student " + uCode + " has been updated.");
            }
        }
    }

    // remove a student based on student code
    public void removeStudent() {
        if (this.isEmpty()) {
            System.out.println("Empty list");
        } else {
            String rCode = Inputter.inputStr("Input code of student taht you want to remove");
            Student st = this.search(rCode);
            if (st == null) {
                System.out.println("Student " + rCode + " doesn't exist");
            } else {
                this.remove(st);
                System.out.println("Student " + rCode + " has been removed.");
            }
        }
    }

    // list all student
    public void printAll() {
        if (this.isEmpty()) {
            System.out.println("Empty list");
        } else {
            System.out.println("Student list:");
            for (Student st : this) {
                System.out.println(st);
            }
            System.out.println("Total: " + this.size() + " Students.");
        }
    }
}
