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
    public static void main(String[] args) {
        FileHandle fh = new FileHandle();
        String s,check="N"; 
        int choice,size,count;
        // print out menu and all program work here
        do {
            // print out the whole menu
            System.out.println("Choose from 1 to 4: ");
            System.out.println("1: Check path");
            System.out.println("2: Get files in the folder");
            System.out.println("3: Show files in the folder with condition");
            System.out.println("4: Read file and count words");
            System.out.println("5: Insert a string to a file");
            System.out.print("\tEnter your choice: ");
            // input user's choice
            choice = fh.inputChoice();
            switch (choice) {
                case 1:     // checkPath(String s) method will work here
                    System.out.print("\tEnter pathname: ");
                    s = fh.inputPath();
                    fh.checkPath(s);
                    // ask user if they want to go back to the menu
                    System.out.print("\tDo you want to go back to the menu? (Y/N): ");
                    check = fh.inputYesNo();
                    break;
                case 2:     // listFile(String s) method will work here
                    System.out.print("\tEnter pathname: ");
                    s=fh.inputPath();
                    fh.listJavaFile(s);
                    // ask user if they want to go back to the menu
                    System.out.print("\tDo you want to go back to the menu? (Y/N): ");
                    check = fh.inputYesNo();
                    break;
                case 3:     // listFileSize(String s, int size) method will work here
                    System.out.print("\tEnter pathname: ");
                    s=fh.inputPath();
                    System.out.print("\tEnter size (Kb): ");
                    size = fh.inputSize();
                    fh.listFileSize(s, size);
                    // ask user if they want to go back to the menu
                    System.out.print("\tDo you want to go back to the menu? (Y/N): ");
                    check = fh.inputYesNo();
                    break;
                case 4:     // countWord(String s) method will work here
                    System.out.print("\tEnter text file name (.txt): ");
                    s=fh.inputTxtFile();
                    count=fh.countWord(s);
                    if (count!=-1) System.out.println("\tThis text file have totally " + count + " words.");
                    // ask user if they want to go back to the menu
                    System.out.print("\tDo you want to go back to the menu? (Y/N): ");
                    check = fh.inputYesNo();
                    break;
                case 5:
                    System.out.print("\tEnter whatever you want to add to a file: ");
                    s=fh.inputPath();
                    fh.appendText(s);
                    System.out.print("\tDo you want to go back to the menu? (Y/N): ");
                    check = fh.inputYesNo();
            }
        } while (check.startsWith("Y"));
        
    }
}
